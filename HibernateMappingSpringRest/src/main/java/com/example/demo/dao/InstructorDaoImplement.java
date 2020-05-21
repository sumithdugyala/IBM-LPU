package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Instructor;

@Repository
public class InstructorDaoImplement implements InstructorDao {

	private EntityManager entityManager;

	

	@Autowired
	public InstructorDaoImplement(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}


	@Override
	public Instructor createInstructor(Instructor instructor) {
		
//		Session currentSession = entityManager.unwrap(Session.class);
//		currentSession.saveOrUpdate(instructor);
		//entityManager.persist(instructor);
		entityManager.merge(instructor);
		return instructor;
	}


	@Override
	public List<Instructor> displayAll() {
//		Session currentSession = entityManager.unwrap(Session.class);
//		Query<Instructor> query = currentSession.createQuery("from Instructor",Instructor.class);
		TypedQuery<Instructor> query = entityManager.createQuery("from Instructor", Instructor.class);
		return query.getResultList();
	}


	@Override
	public Instructor getInstructorById(int id) {
		
		//Session currentSession = entityManager.unwrap(Session.class);

		return entityManager.find(Instructor.class,id);
	}

	@Override
	public Instructor deleteInstructor(Instructor instructor) {
//		Session currentSession = entityManager.unwrap(Session.class);
//		currentSession.delete(instructor);
		
		entityManager.remove(instructor);
		return instructor;
	}

}
