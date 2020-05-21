package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Instructor;

public interface InstructorService {

	public Instructor createInstructorService(Instructor instructor);
	
	public List<Instructor> displayAll();
	
	public Instructor getInstructorById(int id);
	
	public Instructor deleteInstructor(Instructor instructor);
	
}
