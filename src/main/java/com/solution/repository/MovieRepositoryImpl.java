package com.solution.repository;

import com.solution.model.Movie;
import com.solution.repository.template.AbstractGenericRepository;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MovieRepositoryImpl extends AbstractGenericRepository<Movie,Integer> implements MovieRepository {
    private static final  String FIND_ALL="SELECT entity FROM Movie entity";
    private static final  String FIND_ALL_WITHOUT_RATING="SELECT entity FROM Movie entity LEFT JOIN FETCH entity.ratings r where r=NULL";

    @Override
    public List<Movie> findAll() {
        return entityManager.createQuery(FIND_ALL,entityClass).getResultList();
    }

    @Override
    public List<Movie> findAllWithoutRating() {
        return entityManager.createQuery(FIND_ALL_WITHOUT_RATING,entityClass).getResultList();
    }

}
