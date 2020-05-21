package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InstructorDetailsDao;
import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetails;

@Service
public class InstructorDetailsServiceImplement implements InstructorDetailsService{

	@Autowired
	private InstructorDetailsDao instructorDetailsDao;
	
	@Override
	public InstructorDetails createInstructorDetails(InstructorDetails instructorDetails) {
		return instructorDetailsDao.createInstructorDetails(instructorDetails);
	}

	@Override
	public List<InstructorDetails> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstructorDetails getInstructorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstructorDetails deleteInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
