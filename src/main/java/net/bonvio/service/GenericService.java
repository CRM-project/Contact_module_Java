package net.bonvio.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 03.12.15.
 */

@Transactional
public interface GenericService<T> {
    List<T> getList();
    T getById(Integer id);
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    void deleteById(Integer id);
    //T getReference(Integer id);
}
