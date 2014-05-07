package com.anucana.service.images;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletConfig;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.multipart.MultipartFile;


@Component
public class ImageService implements IImageService,ServletConfigAware {

	private String imagePath = null;
	
	@Override
	public boolean validateImageFormat(MultipartFile image, ModelMap model) {
		if(isImageNull(image, model)){
			return false;
		}
		return true;
	}


	@Override
	public boolean validateImageSize(MultipartFile image, ModelMap model) {
		return false;
	}

	public boolean saveImage(ImageBucket bucket) {
		File bucketDir = new File(this.imagePath + "" + bucket.getBucketName());
		try {
			if(!bucketDir.exists()){
				bucketDir.mkdir();
			}

			File file = new File(bucketDir.getAbsolutePath() + "\\" + "main" + "." + ImageUtils.getImageExtension(bucket.getImage())); 
			byte[] bytes = bucket.getImage().getBytes();
			FileUtils.writeByteArrayToFile(file, bytes);
			
		} catch (IOException e) {
			e.printStackTrace();
			bucket.getModelMap().put("imageuploaderror", e.getMessage());
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			bucket.getModelMap().put("imageuploaderror", e.getMessage());
			return false;
			
		}
		return true;
	}

	
	private boolean isImageNull(MultipartFile image, ModelMap model){
		if(image == null || image.getSize() <= 0){
			model.put("imageuploaderror", "Please select a an image to upload");
			return true;
		}
		return false;
	}


	@Override
	public void setServletConfig(ServletConfig servletConfig) {
		this.imagePath = servletConfig.getServletContext().getRealPath("") + "\\" + servletConfig.getInitParameter("profile-image-repo")+ "\\";
	}
	
}
