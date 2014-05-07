package com.anucana.service.images;

import org.springframework.web.multipart.MultipartFile;

public class ImageUtils {
	
	public static String getImageExtension(MultipartFile image) throws Exception{
		if("image/png".equalsIgnoreCase(image.getContentType())){
			return "png";
		}else if("image/jpg".equalsIgnoreCase(image.getContentType())){
			return "jpg";
		}else if("image/gif".equalsIgnoreCase(image.getContentType())){
			return "gif";
		}
		throw new Exception("Image Content Type not supported");
	}

}
