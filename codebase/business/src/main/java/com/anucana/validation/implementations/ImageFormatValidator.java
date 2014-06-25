package com.anucana.validation.implementations;

import java.io.IOException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import com.anucana.validation.annotations.ValidImageFormat;

public class ImageFormatValidator implements ConstraintValidator<ValidImageFormat, MultipartFile>{

	@Value("${image.upload.format.supported}")
	private String supportedImageFormats;
	
	private final String IMAGE_SUPPORTED_FORMAT_SPLITTER = ",";
	
	private String[] imageFormats;

	@Override
	public void initialize(ValidImageFormat constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(MultipartFile image,ConstraintValidatorContext context) {
		boolean isFormatValid = false;
		try {
			if(image == null || image.getBytes().length == 0 || StringUtils.isBlank(image.getOriginalFilename())){
				return false;
			}
			if((imageFormats == null || imageFormats.length == 0) && StringUtils.isNotBlank(supportedImageFormats)){
				imageFormats = supportedImageFormats.split(IMAGE_SUPPORTED_FORMAT_SPLITTER);
			}
			
			if(imageFormats != null){
				String[] named = image.getOriginalFilename().split("\\.");
				String imageExtension = named[named.length - 1];
				
				for(String format : imageFormats){
					if(format.equalsIgnoreCase(imageExtension)){
						isFormatValid = true;
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return isFormatValid;
	}


}
