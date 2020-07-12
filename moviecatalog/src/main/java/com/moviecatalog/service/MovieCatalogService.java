package com.moviecatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviecatalog.model.MovieCatalog;
import com.moviecatalog.repo.MovieCatalogRepo;

@Service
public class MovieCatalogService {

	@Autowired
	MovieCatalogRepo movieCatalogRepo;

	public String insertMovie(MovieCatalog catalog) {
		String response = "";
		try {
			movieCatalogRepo.save(catalog);
			response = "Record Inserted Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			response = "Error occured!.";
		}
		return response;
	}

	public List<MovieCatalog> getAllMovies() {

		return movieCatalogRepo.findAll();
	}
}
