package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Contact;
import net.bonvio.service.entity.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private GenericDAO<Contact> contactGenericDAO;

    @Override
    public void save(Contact contact) {
        contactGenericDAO.save(contact);
    }

    @Override
    public List<Contact> getList() {
        return contactGenericDAO.getList();
    }

    @Override
    public void delete(Contact contact) {
        contactGenericDAO.delete(contact);
    }

    @Override
    public void deleteById(Integer id) {
        contactGenericDAO.deleteById(id);
    }

    @Override
    public Contact getById(Integer id) {
        return contactGenericDAO.getById(id);
    }

    @Override
    public void update(Contact contact) {
        contactGenericDAO.update(contact);
    }


}
