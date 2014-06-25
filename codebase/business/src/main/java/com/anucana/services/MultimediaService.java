package com.anucana.services;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;
import org.imgscalr.Scalr;
import org.jets3t.service.S3ServiceException;
import org.jets3t.service.impl.rest.httpclient.RestS3Service;
import org.jets3t.service.model.S3Bucket;
import org.jets3t.service.model.S3Object;
import org.jets3t.service.security.AWSCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.anucana.client.data.IClientDetails;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.user.data.IUserDetails;
import com.anucana.validation.implementations.JSR303ValidatorFactoryBean;
import com.anucana.value.objects.ImageOps;
import com.anucana.value.objects.ImageOps.ImageCropCordinates;

@Component
public class MultimediaService implements IMultimediaService{

	// AWS Credentials
	@Value("${amazon.service.awsAccessKey}")
	private String awsAccessKey;
	
	@Value("${amazon.service.awsSecretAccessKey}")
	private String awsSecretAccessKey;
	
	// Image URL Timeout
	@Value("${image.url.timeout}")
	private String urlTimeout;

	
	// Image Buckets
	@Value("${bucket.profile}")
	private String profileImageBucket;

	@Value("${bucket.community}")
	private String communityImageBucket;
	
	@Value("${bucket.event}")
	private String eventImageBucket;
	
	@Value("${bucket.gallery}")
	private String galleryImageBucket;
	
	
	// Fallback URLs
	@Value("${dummy.url.profile}")
	private String dummyProfileImage;

	@Value("${dummy.url.community}")
	private String dummyCommunityImage;
	
	@Value("${dummy.url.event}")
	private String dummyEventImage;
	
	@Value("${dummy.url.gallery}")
	private String dummyGalleryImage;
	
	
	@Autowired
	private JSR303ValidatorFactoryBean jsr303validator;
	
	private final String profileMainImageFolder = "main/";
	private final String communityMainImageFolder = "banner/";
	private final String eventMainImageFolder = "banner/";
	private final String galleryMainImageFolder = "images/";
	

	@Override
	public ServiceResponse<List<ImageOps>> getImages(ServiceRequest<List<ImageOps>> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		List<ImageOps> imageOps = request.getTargetObject();

		AWSCredentials credentials = new AWSCredentials(awsAccessKey, awsSecretAccessKey);
		RestS3Service service = new RestS3Service(credentials);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, Integer.valueOf(urlTimeout));
		Date expiryDate = cal.getTime();
		
		if (imageOps != null) {
			for (ImageOps image : imageOps) {
				try {
					String bucketName = getBucketName(image);
					String imageKey = getImageKey(image);
					if(service.isObjectInBucket(bucketName, imageKey)){
						image.setTimedImageURL(service.createSignedGetUrl(bucketName,imageKey, expiryDate));
					}
				} catch (S3ServiceException e) {
					e.printStackTrace();
				} catch (org.jets3t.service.ServiceException e) {
					e.printStackTrace();
				}
				// if the image didn't get set for some reason, set the dummy url 
				if(StringUtils.isBlank(image.getTimedImageURL())){
					image.setTimedImageURL(getFallbackImage(image));
					image.setDummy(true);
				}
			}
		}
		
		return request;
	}

	@Override
	public ServiceResponse<ImageOps> saveImage(ServiceRequest<ImageOps> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {
		request.setValidator(jsr303validator);
		request.validate();
		if(request.getBindingResult().hasErrors()){
			return request;
		}
		
		ImageOps imageOps = request.getTargetObject();
		try {
			// transform the image to jpeg
			BufferedImage image = ImageIO.read(imageOps.getImage().getInputStream());
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(image, "jpg", baos);
			
			
			S3Object s3Obj = new S3Object(getImageKey(imageOps),baos.toByteArray());
			s3Obj.setContentType("image/jpeg");

			AWSCredentials credentials = new AWSCredentials(awsAccessKey, awsSecretAccessKey);
			RestS3Service service = new RestS3Service(credentials);
			
			S3Bucket bucket = service.getBucket(getBucketName(imageOps));
			service.putObject(bucket, s3Obj);

		} catch (S3ServiceException e) {
			e.printStackTrace();
			throw new ServiceException(e.getErrorCode(),e);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION,e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION,e);
		}
		
		List<ImageOps> imageList = new ArrayList<ImageOps>();
		imageList.add(imageOps);
		
		ServiceResponse<List<ImageOps>> res = getImages(new ServiceRequest<List<ImageOps>>(imageList), userDetails, client);
		return new ServiceResponse<ImageOps>(res.getTargetObject().get(0));
	}

	@Override
	public ServiceResponse<ImageOps> cropImage(ServiceRequest<ImageOps> request, IUserDetails userDetails,IClientDetails client) throws ServiceException {

		ImageOps imageOps = request.getTargetObject();
		AWSCredentials credentials = new AWSCredentials(awsAccessKey, awsSecretAccessKey);
		RestS3Service service = new RestS3Service(credentials);
		
		try {
			S3Object s3Obj = service.getObject(getBucketName(imageOps),getImageKey(imageOps));
			if(s3Obj == null){
				throw new ServiceException(ServiceException.IMAGE_KEY_NOT_FOUND);
			}
			ImageCropCordinates corpCoordinates = imageOps.getCropCoordinates();
			
			// read the image from the S3 bucket
			BufferedImage image = ImageIO.read(s3Obj.getDataInputFile());
			// crop the image
			BufferedImageOp ops = null;
			BufferedImage croppedImage = Scalr.crop(image, corpCoordinates.getX(), corpCoordinates.getY(), corpCoordinates.getW(), corpCoordinates.getH(), ops);
			
			// save the image back in s3 bucket
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(croppedImage, "jpg", baos);

			s3Obj = new S3Object(getImageKey(imageOps),baos.toByteArray());
			s3Obj.setContentType("image/jpeg");

			S3Bucket bucket = service.getBucket(getBucketName(imageOps));
			service.putObject(bucket, s3Obj);
			
		} catch (S3ServiceException e) {
			e.printStackTrace();
			throw new ServiceException(e.getErrorCode(),e);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION,e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new ServiceException(ServiceException.GENERAL_SYSTEM_EXCEPTION,e);
		}
		
		// get the url and return
		List<ImageOps> imageList = new ArrayList<ImageOps>();
		imageList.add(imageOps);
		
		ServiceResponse<List<ImageOps>> res = getImages(new ServiceRequest<List<ImageOps>>(imageList), userDetails, client);
		return new ServiceResponse<ImageOps>(res.getTargetObject().get(0));
	}
	
	
	
	private String getImageKey(ImageOps imageOps) throws ServiceException {
		String suffix = ".jpeg";
		switch(imageOps.getImageBucket()){
			case PROFILE:
				return profileMainImageFolder + imageOps.getId() + suffix;
			case COMMUNITY:
				return communityMainImageFolder + imageOps.getId() + suffix;
			case EVENT:
				return eventMainImageFolder + imageOps.getId() + suffix;
			case GALLERY:
				return galleryMainImageFolder + imageOps.getId() + suffix;
			default:
				throw new ServiceException(ServiceException.IMAGE_KEY_NOT_FOUND);
		}
	}

	
	private String getBucketName(ImageOps imageOps) throws ServiceException {
		switch(imageOps.getImageBucket()){
			case PROFILE:
				return profileImageBucket;
			case COMMUNITY:
				return communityImageBucket;
			case EVENT:
				return eventImageBucket;
			case GALLERY:
				return galleryImageBucket;
			default:
				throw new ServiceException(ServiceException.IMAGE_BUCKET_NOT_FOUND);
		}
	}
	
	private String getFallbackImage(ImageOps imageOps) throws ServiceException {
		switch(imageOps.getImageBucket()){
			case PROFILE:
				return dummyProfileImage;
			case COMMUNITY:
				return dummyCommunityImage;
			case EVENT:
				return dummyEventImage;
			case GALLERY:
				return dummyGalleryImage;
			default:
				throw new ServiceException(ServiceException.IMAGE_KEY_NOT_FOUND);
		}
	}
	
	
}
