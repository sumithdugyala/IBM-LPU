package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

@Service
public class AccountServiceImplement implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	
	@Override
	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<Account>();
		  accountDao.findAll().forEach(account -> {
		   accounts.add(new Account(account.getCustomerId(),account.getNumber()));
		   }
		  );
		
		return accounts;
	}

	@Override
	public Account findById(Integer id) {
		return accountDao.findById(id).get();
	}

}
