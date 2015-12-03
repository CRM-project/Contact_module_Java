package net.bonvio.service.entity;

import net.bonvio.model.Contact;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface ContactService {

    void save(Contact contact);
    List<Contact> getList();
    void delete(Contact contact);
    void deleteById(Integer id);
    Contact getById(Integer id);
    void update(Contact contact);
}

