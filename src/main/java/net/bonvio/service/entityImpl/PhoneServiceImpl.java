package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Phone;
import net.bonvio.service.entity.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private GenericDAO<Phone> phoneGenericDAO;

    @Override
    public void save(Phone phone) {
        phoneGenericDAO.save(phone);
    }

    @Override
    public List<Phone> getAll() {
        return phoneGenericDAO.findAll();
    }

    @Override
    public void delete(Phone phone) {
        phoneGenericDAO.delete(phone);
    }

    @Override
    public void deleteById(Integer id) {
        phoneGenericDAO.deleteById(id);
    }

    @Override
    public Phone findById(Integer id) {
        return phoneGenericDAO.findById(id);
    }

    @Override
    public void update(Phone phone) {
        phoneGenericDAO.update(phone);
    }


}
