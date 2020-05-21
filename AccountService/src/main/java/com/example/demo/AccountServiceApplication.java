package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceApplication implements CommandLineRunner {

	
	@Autowired
	private AccountDao accountDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		accountDao.save(new Account(1234,"22748278345532"));
		accountDao.save(new Account(1235,"22748246783342"));
		accountDao.save(new Account(1236,"22748278563332"));
		accountDao.save(new Account(1237,"22748278345632"));
		accountDao.save(new Account(1238,"22748278334552"));
		
		
	}

}
