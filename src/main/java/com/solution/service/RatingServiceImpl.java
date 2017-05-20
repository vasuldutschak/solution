package com.solution.service;

import com.solution.model.Rating;
import com.solution.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;


@Transactional
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }

    @Override
    public int setCurrentDateForNullRatingDate() {
        Date currentDate=new Date();
        List<Rating> founded = ratingRepository.findAllWithNullValueForDate();
        founded.forEach(rating->rating.setRatingDate(currentDate));
        return founded.size();
    }

    @Override
    public Rating findOne(Integer id) {
        return ratingRepository.findOne(id);
    }

    @Override
    public List<Rating> findAllByRatingBetween(int first, int last) {
        List<Rating> founded = ratingRepository.findAllByRatingBetween(first, last);
        Collections.sort(founded, Comparator.comparing(Rating::getRatingDate));
        return founded;
    }
}
