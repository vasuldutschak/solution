package com.solution.repository;

import com.solution.model.Rating;
import com.solution.repository.template.GenericRepository;

import java.util.List;


public interface RatingRepository extends GenericRepository<Rating,Integer> {
    List<Rating> findAll();
    List<Rating> findAllWithNullValueForDate();
    List<Rating> findAllByRatingBetween(int first, int last);
}
