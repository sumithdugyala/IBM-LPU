package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies/{id}")
	public List<Movie> listAll(@PathVariable Integer id)
	{
		return movieService.listAllById(id);
	}
	
	@PostMapping("/movies/{id}")
	public Movie addMovie(@RequestBody Movie movie,@PathVariable Integer id)
	{
		return movieService.addMovie(movie, id);
	}
	
	@PutMapping("/movies/{id}")
	public Movie updateMovie(@RequestBody Movie movie,@PathVariable Integer id)
	{
		return movieService.updateMovie(movie, id);
	}
	
	@DeleteMapping("/movies/{movieId}/{id}")
	public ResponseEntity<Movie> deleteMovie(@PathVariable Integer movieId,@PathVariable Integer id)
	{
		movieService.deleteMovie(movieId, id);
		return new ResponseEntity<Movie>(HttpStatus.OK);
	}

	

}
