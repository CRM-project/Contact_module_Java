package net.bonvio.service.entity;

import net.bonvio.model.Phone;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface PhoneService {

    void save(Phone phone);
    List<Phone> getAll();
    void delete(Phone phone);
    void deleteById(Integer id);
    Phone findById(Integer id);
    void update(Phone phone);
}

