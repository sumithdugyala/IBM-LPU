package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.MovieDao;
import com.example.demo.model.Movie;
import com.example.demo.model.MovieGenre;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieServiceApplication implements CommandLineRunner{

	@Autowired
	private MovieDao movieDao;
	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		movieDao.save(new Movie("AVENGERS",MovieGenre.COMIC));
		movieDao.save(new Movie("FRIENDS",MovieGenre.COMIC));
		movieDao.save(new Movie("BattleShip",MovieGenre.SERIOUS));
		movieDao.save(new Movie("KANCHANA",MovieGenre.THRILLER));
		movieDao.save(new Movie("JOKER",MovieGenre.REVENGE));
		movieDao.save(new Movie("AVENGERS EndGame",MovieGenre.COMIC));
		
	}

}
