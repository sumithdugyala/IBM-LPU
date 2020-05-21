package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.InstructorDetails;

public interface InstructorDetailsDao {
	
	public InstructorDetails createInstructorDetails(InstructorDetails instructorDetails);

	public List<InstructorDetails> displayAll();
	
	public InstructorDetails getInstructorById(int id);
	
	public InstructorDetails deleteInstructor(InstructorDetails instructoDetails);
	
}
