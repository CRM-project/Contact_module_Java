package net.bonvio.service.implementations;

import net.bonvio.dao.implementations.PhoneDaoImpl;
import net.bonvio.model.Individual;
import net.bonvio.model.Phone;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 */

@Service
@Transactional
public class IndividualServiceImpl extends GenericServiceImpl<Individual> implements IndividualService {

    @Autowired
    PhoneDaoImpl phoneDao;

    @Override
    public List<Phone> getPhoneListById(Integer id) {
        return phoneDao.listById(id, "contactInfo");
    }
}
