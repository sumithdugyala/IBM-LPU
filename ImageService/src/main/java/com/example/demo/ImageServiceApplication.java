package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

@SpringBootApplication
@EnableDiscoveryClient
public class ImageServiceApplication implements CommandLineRunner {

	@Autowired
	private ImageDao imageDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ImageServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		imageDao.save(new Image("demo1.com",true));
		imageDao.save(new Image("demo2.com",true));
		imageDao.save(new Image("demo3.com",false));
		imageDao.save(new Image("demo4.com",true));
		
	
	}

}
