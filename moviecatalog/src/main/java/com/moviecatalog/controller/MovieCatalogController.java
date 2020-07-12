package com.moviecatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.moviecatalog.model.MovieCatalog;
import com.moviecatalog.service.MovieCatalogService;

@Controller
public class MovieCatalogController {

	@Autowired
	MovieCatalogService movieService;

	@PostMapping("/insertmovie")
	public ResponseEntity<String> insertMovies(@RequestBody MovieCatalog catalog) {
		String resp = movieService.insertMovie(catalog);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	@GetMapping("/allmovies")
	public ResponseEntity<List<MovieCatalog>> allMovies() {
		return new ResponseEntity<List<MovieCatalog>>(movieService.getAllMovies(), HttpStatus.OK);
	}
}
