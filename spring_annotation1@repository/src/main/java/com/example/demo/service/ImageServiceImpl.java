package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Image;
import com.example.demo.repo.ImageRepo;

@Service
public class ImageServiceImpl implements ImageService 
{
	@Autowired
	private ImageRepo imageRepo;
	public Image createImage(Image image) 
	{
		return imageRepo.createImage(image);
	}

}
