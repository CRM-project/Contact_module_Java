package net.bonvio.service.entity;

import net.bonvio.model.Social;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface SocialService {

    void save(Social social);
    List<Social> getAll();
    void delete(Social social);
    void deleteById(Integer id);
    Social findById(Integer id);
    void update(Social social);
}

