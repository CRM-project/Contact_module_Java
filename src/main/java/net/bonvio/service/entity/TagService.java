package net.bonvio.service.entity;

import net.bonvio.model.Tag;

import java.util.List;

/**
 * Created by mil on 02.12.15.
 */
public interface TagService {

    void save(Tag tag);
    List<Tag> getAll();
    void delete(Tag tag);
    void deleteById(Integer id);
    Tag findById(Integer id);
    void update(Tag tag);
}
