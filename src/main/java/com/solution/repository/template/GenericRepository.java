package com.solution.repository.template;

import java.io.Serializable;


public interface GenericRepository<T, ID extends Serializable> {
    <S extends T> S save(S entity);
    T findOne(ID primaryKey);
    void delete(T entity);
    boolean exists(ID primaryKey);
}
