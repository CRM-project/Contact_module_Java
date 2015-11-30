package net.bonvio.dao;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 */
public interface GenericDAO<T> {
    List<T> findAll();
    T findById(Integer id);
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    void deleteById(Integer id);
    T getReference(Integer id);
}
