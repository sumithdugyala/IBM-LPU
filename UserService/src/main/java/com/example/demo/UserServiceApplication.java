package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner{

	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userDao.save(new User("shyam"));
		userDao.save(new User("vikas"));
		userDao.save(new User("bhargav"));
		userDao.save(new User("mahesh"));
		userDao.save(new User("ravi"));
		
	}

	
}
