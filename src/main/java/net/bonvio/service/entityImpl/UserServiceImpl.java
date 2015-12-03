package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.User;

import net.bonvio.service.entity.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private GenericDAO<User> userGenericDAO;

    @Override
    public void save(User user) {
        userGenericDAO.save(user);
    }

    @Override
    public List<User> getList() {
        return userGenericDAO.getList();
    }

    @Override
    public void delete(User user) {
        userGenericDAO.delete(user);
    }

    @Override
    public void deleteById(Integer id) {
        userGenericDAO.deleteById(id);
    }

    @Override
    public User getById(Integer id) {
        return userGenericDAO.getById(id);
    }

    @Override
    public void update(User user) {
        userGenericDAO.update(user);
    }


}
