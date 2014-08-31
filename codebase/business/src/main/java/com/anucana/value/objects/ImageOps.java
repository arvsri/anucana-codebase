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
		private double x;
		private double y;
		private double x2;
		private double y2;
		private double w;
		private double h;
		/**
		 * @return the x
		 */
		public double getX() {
			return x;
		}
		/**
		 * @param x the x to set
		 */
		public void setX(double x) {
			this.x = x;
		}
		/**
		 * @return the y
		 */
		public double getY() {
			return y;
		}
		/**
		 * @param y the y to set
		 */
		public void setY(double y) {
			this.y = y;
		}
		/**
		 * @return the x2
		 */
		public double getX2() {
			return x2;
		}
		/**
		 * @param x2 the x2 to set
		 */
		public void setX2(double x2) {
			this.x2 = x2;
		}
		/**
		 * @return the y2
		 */
		public double getY2() {
			return y2;
		}
		/**
		 * @param y2 the y2 to set
		 */
		public void setY2(double y2) {
			this.y2 = y2;
		}
		/**
		 * @return the w
		 */
		public double getW() {
			return w;
		}
		/**
		 * @param w the w to set
		 */
		public void setW(double w) {
			this.w = w;
		}
		/**
		 * @return the h
		 */
		public double getH() {
			return h;
		}
		/**
		 * @param h the h to set
		 */
		public void setH(double h) {
			this.h = h;
		}

		
	}
}
