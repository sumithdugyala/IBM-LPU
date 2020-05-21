package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Image;
import com.example.demo.service.ImageService;

@RestController
public class ImageController {
	
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@GetMapping(value ="/images")
	public List<Image> listAll()
	{
		return imageService.listAll();
	}
	
	 @GetMapping(value="/port")
	 public String port()
	 {
		 return imageService.port();
	 }

}
