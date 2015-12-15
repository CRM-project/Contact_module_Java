package net.bonvio.service.implementations;

import net.bonvio.dao.implementations.ContactDAOImpl;
import net.bonvio.dao.implementations.ContactInfoDAOImpl;
import net.bonvio.model.Contact;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by igorjan on 14.12.15.
 * banana
 */

@Service
@Transactional
public class ContactServiceImpl extends GenericServiceImpl<Contact> implements ContactService {
    @Autowired
    ContactDAOImpl contactDAO;
    @Autowired
    ContactInfoDAOImpl contactInfoDAO;

    @Override
    public void addFriend(Integer fromId, Integer toId) throws Exception {
        if (!fromId.equals(toId))
            contactDAO.save(new Contact(contactInfoDAO.getReference(fromId), contactInfoDAO.getReference(toId)));
        else
            throw new Exception("Произошла какая-то ошибка");
    }
}
