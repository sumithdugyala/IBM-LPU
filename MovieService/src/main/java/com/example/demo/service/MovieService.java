package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Movie;

public interface MovieService {
	
	public List<Movie> listAllById(Integer id);
	
	public Movie addMovie(Movie movie,Integer id);
	
	public Movie updateMovie(Movie movie,Integer id);
	
	public void deleteMovie(Integer movieId, Integer id);
	
	

}
