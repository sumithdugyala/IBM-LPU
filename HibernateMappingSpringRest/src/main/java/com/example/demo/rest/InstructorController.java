package com.example.demo.rest;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.exception.InstructorNotFoundException;
//import com.example.demo.exception.InstructorResponseEntity;
//import com.example.demo.model.Instructor;
//import com.example.demo.model.InstructorDetails;
//import com.example.demo.service.InstructorDetailsService;
//import com.example.demo.service.InstructorService;
//
//@RestController
//@RequestMapping("/api")
//public class InstructorController {
//
//	@Autowired
//	private InstructorService instructorService;
//	
//	@Autowired 
//	InstructorDetailsService instructorDetailsService;
//	
//	@PostMapping("/instructor")
//	public Instructor create(@RequestBody Instructor instructor)
//	{
//		return instructorService.createInstructorService(instructor);
//	}
//	
//	@GetMapping("/hiii")
//	public String display()
//	{
//		return "hii";
//	}
//	
//	@PostMapping("/instructorDetail")
//	public InstructorDetails createDetail(@RequestBody InstructorDetails instructorDetails)
//	{
//		return instructorDetailsService.createInstructorDetails(instructorDetails);
//	}
//	
//	@GetMapping("/instructors")
//	public List<Instructor> getInstructors() {
//		
//		return instructorService.displayAll();
//		
//	}
//	
//	@GetMapping("/instructor/{instructorId}")
//	public Instructor getInstructor(@PathVariable int instructorId) throws InstructorNotFoundException {
//
//		Instructor instructor = instructorService.getInstructorById(instructorId);
//		if ( instructor==null ) {			
//			throw new InstructorNotFoundException("Instructor id -- "+instructorId+" not found ");
//		}
//		
//		return instructor;
//	}
//
//	@ExceptionHandler
//	public ResponseEntity<InstructorResponseEntity> handleException(InstructorNotFoundException infe)
//	{
//		return new ResponseEntity<InstructorResponseEntity>(new InstructorResponseEntity(HttpStatus.NOT_FOUND.value(),
//				infe.getMessage(),System.currentTimeMillis()),HttpStatus.NOT_FOUND);
//	}
//	
//	@DeleteMapping("/instructor/delete/{id}")
//	public Instructor delete(@PathVariable int id) throws InstructorNotFoundException
//	{
//		Instructor instructor = instructorService.getInstructorById(id);
//		if ( instructor==null ) {			
//			throw new InstructorNotFoundException("Instructor id -- "+id+" not found ");
//		}
//		
//		instructorService.deleteInstructor(instructor);
//		return instructor;
//		
//		
//	}
//	
//	
//}
