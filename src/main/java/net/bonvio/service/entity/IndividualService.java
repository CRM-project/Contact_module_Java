package net.bonvio.service.entity;

import net.bonvio.model.Individual;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface IndividualService {

    void save(Individual individual);
    List<Individual> getList();
    void delete(Individual individual);
    void deleteById(Integer id);
    Individual getById(Integer id);
    void update(Individual individual);
}

