package com.solution.repository;

import com.solution.model.Movie;
import com.solution.repository.template.GenericRepository;

import java.util.List;


public interface MovieRepository extends GenericRepository<Movie,Integer> {
    List<Movie> findAll();
    List<Movie> findAllWithoutRating();
}
