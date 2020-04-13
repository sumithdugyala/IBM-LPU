package com.example.demo.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
public class Image 
{
	private String imageId;
	private String imageName;
	
	public Image() 
	{
		
	}
	
	public Image(String imageId, String imageName) {
		super();
		this.imageId = imageId;
		this.imageName = imageName;
	}
	
	
}
