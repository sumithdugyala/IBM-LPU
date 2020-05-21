package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Instructor;
import com.example.demo.model.InstructorDetails;

@Repository
public class InstructorDetailsDaoImplement implements InstructorDetailsDao{

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public InstructorDetails createInstructorDetails(InstructorDetails instructorDetails) {
		Session currentSession = entityManager.unwrap(Session.class);
		Instructor instructor = instructorDetails.getInstructor();
		instructor.setDetails(instructorDetails);
		currentSession.saveOrUpdate(instructor);
		return instructorDetails;
		
	}


	@Override
	public List<InstructorDetails> displayAll() {
		
		return null;
	}


	@Override
	public InstructorDetails getInstructorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public InstructorDetails deleteInstructor(InstructorDetails instructoDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
