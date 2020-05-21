package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

@Service
public class ImageServiceImplement implements ImageService {

	
	@Value("${server.port}")
	String port;
	
	private ImageDao imageDao;
	
	@Autowired
	public ImageServiceImplement(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}


	@Override
	public List<Image> listAll() {
		
		List<Image> images = new ArrayList<Image>();
		  imageDao.findAll().forEach(image -> {
		   images.add(new Image(image.getImageId(),image.getImageUrl(),image.getIsAvailable()));
		   }
		  );
		
		return images;
	}


	@Override
	public String port() {
		// TODO Auto-generated method stub
		return port;
	}

}
