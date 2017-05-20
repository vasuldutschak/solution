package com.solution.repository.template;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractGenericRepository<T,ID extends Serializable> implements GenericRepository<T,ID> {

    @Autowired
    protected EntityManager entityManager;

    protected final Class<T> entityClass;

    public AbstractGenericRepository() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    @Override
    public <S extends T> S save(S entity) {
        return entityManager.merge(entity);
    }

    @Override
    public T findOne(ID primaryKey) {
        return entityManager.find(entityClass,primaryKey);
    }

    @Override
    public void delete(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public boolean exists(ID primaryKey) {
        return findOne(primaryKey)!=null;
    }
}
