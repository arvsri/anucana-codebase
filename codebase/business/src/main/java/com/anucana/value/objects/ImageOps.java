package com.anucana.value.objects;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import com.anucana.validation.annotations.ValidImageFormat;

public class ImageOps implements Serializable {
	
	private static final long serialVersionUID = 94264794203162833L;
	
	public static enum BUCKET {
		PROFILE, COMMUNITY, EVENT, GALLERY;
	}
	
	private MultipartFile image;

	
	public ImageOps(BUCKET bucket){
		this.imageBucket = bucket;
	}
	
	/**
	 * Image bucket and id uniquely identify the image
	 */
	private long id;
	
	private boolean dummy;
	
	private final BUCKET imageBucket;
	
	/**
	 * Timed image url
	 */
	private String timedImageURL;
	
	private ImageCropCordinates cropCoordinates;

	@ValidImageFormat
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public BUCKET getImageBucket() {
		return imageBucket;
	}
	
	public String getTimedImageURL() {
		return timedImageURL;
	}
	public void setTimedImageURL(String timedImageURL) {
		this.timedImageURL = timedImageURL;
	}
	
	public boolean isDummy() {
		return dummy;
	}
	public void setDummy(boolean dummy) {
		this.dummy = dummy;
	}
	
	public ImageCropCordinates getCropCoordinates() {
		return cropCoordinates;
	}
	public void setCropCoordinates(ImageCropCordinates cropCoordinates) {
		this.cropCoordinates = cropCoordinates;
	}


	public static class ImageCropCordinates{
		/**
		 * Image corp coordinates
		 */
		private int x;
		private int y;
		private int x2;
		private int y2;
		private int w;
		private int h;

		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getX2() {
			return x2;
		}
		public void setX2(int x2) {
			this.x2 = x2;
		}
		public int getY2() {
			return y2;
		}
		public void setY2(int y2) {
			this.y2 = y2;
		}
		public int getW() {
			return w;
		}
		public void setW(int w) {
			this.w = w;
		}
		public int getH() {
			return h;
		}
		public void setH(int h) {
			this.h = h;
		}
	}
}
