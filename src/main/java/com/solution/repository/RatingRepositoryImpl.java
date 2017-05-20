package com.solution.repository;

import com.solution.model.Rating;
import com.solution.repository.template.AbstractGenericRepository;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RatingRepositoryImpl extends AbstractGenericRepository<Rating, Integer> implements RatingRepository {

    private static final String FIND_ALL = "SELECT entity FROM  Rating entity JOIN FETCH entity.user JOIN FETCH entity.movie";
    private static final String FIND_ALL_WITH_NULL_FOR_DATE = "SELECT entity FROM  Rating entity JOIN FETCH entity.user JOIN FETCH entity.movie WHERE entity.ratingDate=NULL";
    private static final String FIND_ALL_BY_RATING_BETWEEN = "SELECT entity  FROM Rating entity JOIN FETCH entity.movie WHERE entity.rating BETWEEN :first and :last";

    @Override
    public List<Rating> findAll() {
        return entityManager.createQuery(FIND_ALL, entityClass).getResultList();
    }

    @Override
    public List<Rating> findAllWithNullValueForDate() {
        return entityManager.createQuery(FIND_ALL_WITH_NULL_FOR_DATE, entityClass).getResultList();
    }

    @Override
    public List<Rating> findAllByRatingBetween(int first, int last) {
        return entityManager.createQuery(FIND_ALL_BY_RATING_BETWEEN, entityClass)
                .setParameter("first", first)
                .setParameter("last", last)
                .getResultList();

    }


}
