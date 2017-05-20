package com.solution.repository;

import com.solution.model.User;
import com.solution.repository.template.AbstractGenericRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class UserRepositoryImpl extends AbstractGenericRepository<User,Integer> implements UserRepository {

    private static final  String FIND_ALL="SELECT entity FROM User entity";


    @Override
    public List<User> findAll() {
        return entityManager.createQuery(FIND_ALL,entityClass).getResultList();
    }
}
