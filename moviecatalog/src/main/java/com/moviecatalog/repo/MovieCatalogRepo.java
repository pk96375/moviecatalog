package com.moviecatalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviecatalog.model.MovieCatalog;

@Repository
public interface MovieCatalogRepo extends JpaRepository<MovieCatalog, Long> {

}
