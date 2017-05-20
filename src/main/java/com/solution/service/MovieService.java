package com.solution.service;

import com.solution.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie save(Movie entity);
    Movie findOne(Integer primaryKey);
    List<Movie> findAllWithoutRating();
    void delete(Integer id);
}
