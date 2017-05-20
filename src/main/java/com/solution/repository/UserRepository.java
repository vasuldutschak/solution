package com.solution.repository;

import com.solution.model.User;
import com.solution.repository.template.GenericRepository;

import java.util.List;


public interface UserRepository extends GenericRepository<User,Integer> {
    List<User> findAll();
}
