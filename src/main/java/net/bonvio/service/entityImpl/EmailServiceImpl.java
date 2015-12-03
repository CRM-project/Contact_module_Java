package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Email;
import net.bonvio.service.entity.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class EmailServiceImpl implements EmailService {

    @Autowired
    private GenericDAO<Email> emailGenericDAO;

    @Override
    public void save(Email email) {
        emailGenericDAO.save(email);
    }

    @Override
    public List<Email> getList() {
        return emailGenericDAO.getList();
    }

    @Override
    public void delete(Email email) {
        emailGenericDAO.delete(email);
    }

    @Override
    public void deleteById(Integer id) {
        emailGenericDAO.deleteById(id);
    }

    @Override
    public Email getById(Integer id) {
        return emailGenericDAO.getById(id);
    }

    @Override
    public void update(Email email) {
        emailGenericDAO.update(email);
    }


}
