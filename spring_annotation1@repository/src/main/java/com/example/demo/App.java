package com.example.demo;

import java.util.UUID;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.Image;
import com.example.demo.repo.ImageRepoImpl;
import com.example.demo.service.ImageServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
        ImageServiceImpl imageServiceImpl=context.getBean("imageServiceImpl",ImageServiceImpl.class);
        Image image =context.getBean("image",Image.class); 
        image.setImageId(UUID.randomUUID().toString()); image.setImageName("sumith");
        image=imageServiceImpl.createImage(image);
        System.out.println(image);
    }
}