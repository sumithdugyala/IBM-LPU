package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;

@Service
public class CustomerServiceImplement implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		  customerDao.findAll().forEach(customer -> {
		   customers.add(new Customer(customer.getPesel(),customer.getName(),customer.getType()));
		   }
		  );
		
		return customers;
	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id).get();
	}
	
	

}
