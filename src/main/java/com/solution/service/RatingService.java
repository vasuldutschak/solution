package com.solution.service;

import com.solution.model.Rating;

import java.util.List;


public interface RatingService {
    List<Rating> findAll();
    int setCurrentDateForNullRatingDate();
    Rating findOne(Integer id);
    List<Rating> findAllByRatingBetween(int first, int last);
}
