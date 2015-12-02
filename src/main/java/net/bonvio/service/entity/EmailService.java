package net.bonvio.service.entity;

import net.bonvio.model.Email;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface EmailService {

    void save(Email email);
    List<Email> getAll();
    void delete(Email email);
    void deleteById(Integer id);
    Email findById(Integer id);
    void update(Email email);
}

