package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int movieId;
	
	@Column(name="name")
	String movieName;
	
	@Column(name="genre")
	MovieGenre genre;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieId, String movieName, MovieGenre genre) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
	}

	public Movie(String movieName, MovieGenre genre) {
		super();
		this.movieName = movieName;
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public MovieGenre getGenre() {
		return genre;
	}

	public void setGenre(MovieGenre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + "]";
	}
	
	
}
