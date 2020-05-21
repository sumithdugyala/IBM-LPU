package com.example.demo.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.example.demo.dao.InstructorRepository;
import com.example.demo.exception.InstructorNotFoundException;
import com.example.demo.model.Instructor;


@RestController
@RequestMapping("/api/v1")
@Api(value="Instructor Management System", description="Operations pertaining to Instructor in Instructor Management System")
public class InstructorSwaggerController 
{
	@Autowired
	private InstructorRepository instructorRepository;
	
	@ApiOperation(value = "View a list of available Instructors", response = List.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") 
			})
	@GetMapping("/instructors")
	public Iterable<Instructor> getAllEmployees() {
		return instructorRepository.findAll();
	}
	
	@ApiOperation(value = "Get an employee by Id")
	@GetMapping("/instructor/{id}")
	public Optional<Instructor> getInstructorById(
			@ApiParam(value = "instructor id from which employee object will retrieve", required = true)
			@PathVariable(value = "id") Integer id)
			throws InstructorNotFoundException {
		Optional<Instructor> instructor = instructorRepository.findById(id);				
		return instructor;
		}

	
	@ApiOperation(value = "Add an instructor")
	@PostMapping("/instructor")
	public Instructor createInstructor(
			@ApiParam(value = "instructor object store in database table", required = true)
			@Valid @RequestBody Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@ApiOperation(value = "Update an instructor")
	@PutMapping("/instructor/{id}")
	public ResponseEntity<Instructor> updateInstructor(
			@ApiParam(value = "Instructor Id to update Instructor object", required = true)
			@PathVariable(value = "id") Integer id,
			@ApiParam(value = "Update instructor object", required = true)
			@Valid @RequestBody Instructor instructorDetails) throws InstructorNotFoundException {
		Optional<Instructor> instructor = instructorRepository.findById(id);
		
			
		Instructor e=instructor.get();
		e.setLastName(instructorDetails.getLastName());
		e.setFirstName(instructorDetails.getFirstName());
		instructorRepository.save(e);
		return new ResponseEntity<Instructor>(HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Delete an instructor")
	@DeleteMapping("/instructor/{id}")
	public Map<String, Boolean> deleteInstructor(
			@ApiParam(value = "Instructor Id from which Instructor object will delete from database table", required = true)
			@PathVariable(value = "id") Integer id)
			throws InstructorNotFoundException {
		Optional<Instructor> employee = instructorRepository.findById(id);
		Instructor e=employee.get();

		instructorRepository.delete(e);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
