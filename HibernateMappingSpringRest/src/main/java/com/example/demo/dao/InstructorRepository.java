package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Instructor;

@Repository(value = "")
public interface InstructorRepository extends CrudRepository<Instructor, Integer>{

}
