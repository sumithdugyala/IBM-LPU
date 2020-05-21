package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Image")
public class Image {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="imageId")
	Integer imageId;
	
	@Column(name="imageUrl")
	String imageUrl;
	@Column(name="imageAvailable")
	Boolean isAvailable;
	
	public Image()
	{
		super();
	}
	public Image(Integer imageId, String imageUrl, Boolean isAvailable) {
		super();
		this.imageId = imageId;
		this.imageUrl = imageUrl;
		this.isAvailable = isAvailable;
	}


	public Image(String imageUrl, Boolean isAvailable) {
		super();
		this.imageUrl = imageUrl;
		this.isAvailable = isAvailable;
	}


	public Integer getImageId() {
		return imageId;
	}


	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Boolean getIsAvailable() {
		return isAvailable;
	}


	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageUrl=" + imageUrl + ", isAvailable=" + isAvailable + "]";
	}
	
	
}
