package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Instructor;

public interface InstructorDao {

	public Instructor createInstructor(Instructor instructor);
	
	public List<Instructor> displayAll();
	
	public Instructor getInstructorById(int id);
	
	public Instructor deleteInstructor(Instructor instructor);
	
	
}
