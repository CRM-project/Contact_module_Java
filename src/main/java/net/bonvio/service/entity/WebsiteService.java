package net.bonvio.service.entity;

import net.bonvio.model.Website;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface WebsiteService {

    void save(Website website);
    List<Website> getList();
    void delete(Website website);
    void deleteById(Integer id);
    Website getById(Integer id);
    void update(Website website);
}

