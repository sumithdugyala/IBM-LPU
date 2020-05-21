package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.InstructorDao;
import com.example.demo.model.Instructor;

@Service
@EnableTransactionManagement
public class InstructorServiceImplement implements InstructorService {

	@Autowired
	private InstructorDao instructorDao;
	
	@Override
	@Transactional
	public Instructor createInstructorService(Instructor instructor) {
		
		return instructorDao.createInstructor(instructor);
	}

	@Override
	public List<Instructor> displayAll() {
		// TODO Auto-generated method stub
		return instructorDao.displayAll();
	}

	@Override
	public Instructor getInstructorById(int id) {
		// TODO Auto-generated method stub
		return instructorDao.getInstructorById(id);
	}

	@Override
	@Transactional
	public Instructor deleteInstructor(Instructor instructor) {
		return instructorDao.deleteInstructor(instructor);
	}

}
