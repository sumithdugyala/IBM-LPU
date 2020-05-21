package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.MovieDao;
import com.example.demo.model.Movie;

@Service
public class MovieServiceImplement implements MovieService{

	@Autowired
	private MovieDao movieDao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public List<Movie> listAllById(Integer id) 
	{
		
		List<Movie> movies= new ArrayList<Movie>();
		
		movieDao.findAll().forEach(movie -> { movies.add(new Movie(movie.getMovieId(),movie.getMovieName(),movie.getGenre()));}
		);
		if(restTemplate.getForObject("http://user-service/users/"+id, Object.class)!=null) 
		{
		return movies;
		}
		else
		{
			return null;
		}
	}


	@Override
	public Movie addMovie(Movie movie, Integer id) {
		
		if(restTemplate.getForObject("http://user-service/users/"+id, Object.class)!=null)
		{
			movieDao.save(movie);
		}
		return movie;
	}


	@Override
	public Movie updateMovie(Movie movie, Integer id) {
		if(restTemplate.getForObject("http://user-service/users/"+id, Object.class)!=null)
		{
			movieDao.save(movie);
		}
		
		return movie;
	}


	@Override
	public void deleteMovie(Integer movieId, Integer id) {
		if(restTemplate.getForObject("http://user-service/users/"+id, Object.class)!=null)
		{
			Movie movie = movieDao.findById(movieId).get();
			movieDao.delete(movie);
		}
		
		
	}
	
	
	
	
	

	
}
