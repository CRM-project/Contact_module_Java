package net.bonvio.service.entity;

import net.bonvio.model.Tag;

import java.util.List;

/**
 * Created by mil on 02.12.15.
 */
public interface TagService {

    void save(Tag tag);
    List<Tag> getList();
    void delete(Tag tag);
    void deleteById(Integer id);
    Tag getById(Integer id);
    void update(Tag tag);
}
