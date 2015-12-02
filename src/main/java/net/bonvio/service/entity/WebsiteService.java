package net.bonvio.service.entity;

import net.bonvio.model.Website;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface WebsiteService {

    void save(Website website);
    List<Website> getAll();
    void delete(Website website);
    void deleteById(Integer id);
    Website findById(Integer id);
    void update(Website website);
}

