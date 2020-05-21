package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerType;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApplication implements CommandLineRunner{

	@Autowired
	private CustomerDao customerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerDao.save(new Customer("1234","shyam",CustomerType.INDIVIDUAL));
		customerDao.save(new Customer("1235","ravi",CustomerType.INDIVIDUAL));
		customerDao.save(new Customer("1236","mahesh",CustomerType.INDIVIDUAL));
		customerDao.save(new Customer("1237","vikas",CustomerType.INDIVIDUAL));
		customerDao.save(new Customer("1238","bhargav",CustomerType.INDIVIDUAL));
		
	}

}
