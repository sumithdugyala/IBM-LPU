package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name ="instructordetails")
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "instructorId")
	int instructorId;
	String email;
	String address;
	int age;
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public InstructorDetails(int instructorId, String email, String address, int age) {
		super();
		this.instructorId = instructorId;
		this.email = email;
		this.address = address;
		this.age = age;
	}
	
	 public InstructorDetails() {
		// TODO Auto-generated constructor stub
	}
	 
	@JsonBackReference 
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "details")
	private Instructor instructor;

	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public InstructorDetails(int instructorId, String email, String address, int age, Instructor instructor) {
		super();
		this.instructorId = instructorId;
		this.email = email;
		this.address = address;
		this.age = age;
		this.instructor = instructor;
	}
	
	
	
//	create table instructordetails (email varchar(255), address varchar(255), age int, instructorId int,FOREIGN KEY (instructorId) REFERENCES instructor(id))	

}
