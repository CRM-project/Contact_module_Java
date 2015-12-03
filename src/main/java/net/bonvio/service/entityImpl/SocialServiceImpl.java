package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Social;
import net.bonvio.service.entity.SocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class SocialServiceImpl implements SocialService {

    @Autowired
    private GenericDAO<Social> userGenericDAO;

    @Override
    public void save(Social user) {
        userGenericDAO.save(user);
    }

    @Override
    public List<Social> getList() {
        return userGenericDAO.findAll();
    }

    @Override
    public void delete(Social user) {
        userGenericDAO.delete(user);
    }

    @Override
    public void deleteById(Integer id) {
        userGenericDAO.deleteById(id);
    }

    @Override
    public Social getById(Integer id) {
        return userGenericDAO.getById(id);
    }

    @Override
    public void update(Social user) {
        userGenericDAO.update(user);
    }


}
