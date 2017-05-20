package com.solution.service;

import com.solution.model.Movie;
import com.solution.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie entity) {
        return movieRepository.save(entity);
    }

    @Override
    public Movie findOne(Integer primaryKey) {
        return movieRepository.findOne(primaryKey);
    }

    @Override
    public List<Movie> findAllWithoutRating() {
        return movieRepository.findAllWithoutRating();
    }

    @Override
    public void delete(Integer id) {
        Movie one = movieRepository.findOne(id);
        movieRepository.delete(one);
    }
}
