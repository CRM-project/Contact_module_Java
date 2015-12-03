package net.bonvio.service.entity;

import net.bonvio.model.User;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface UserService {

    void save(User user);
    List<User> getList();
    void delete(User user);
    void deleteById(Integer id);
    User getById(Integer id);
    void update(User user);
}

