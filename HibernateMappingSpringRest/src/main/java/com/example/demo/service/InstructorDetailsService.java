package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetails;

public interface InstructorDetailsService {
	
	public InstructorDetails createInstructorDetails(InstructorDetails instructorDetails);

	public List<InstructorDetails> displayAll();
	
	public InstructorDetails getInstructorById(int id);
	
	public InstructorDetails deleteInstructor(Instructor instructor);
	

}
