package net.bonvio.service.entity;

import net.bonvio.model.User;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface UserService {

    void save(User user);
    List<User> getAll();
    void delete(User user);
    void deleteById(Integer id);
    User findById(Integer id);
    void update(User user);
}

