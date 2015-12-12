package net.bonvio.service.implementations;

import net.bonvio.dao.implementations.PhoneDaoImpl;
import net.bonvio.dao.interfaces.IndividualDao;
import net.bonvio.model.*;
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

/*    @Autowired
    PhoneDaoImpl phoneDao;

    @Override
    public List<Phone> getPhoneListById(Integer id) {
        return phoneDao.listById(id, "contactInfo");
    }*/

    @Autowired
    IndividualDao individualDao;

    @Override
    public List<Phone> getPhoneListByPhoneId(Integer id) {
        return individualDao.getPhoneListByIndividualId(id);
    }

    @Override
    public List<Email> getEmailListByPhoneId(Integer id) {
        return individualDao.getEmailListByIndividualId(id);
    }

    @Override
    public List<Social> getSocialListByPhoneId(Integer id) {
        return individualDao.getSocialListByIndividualId(id);
    }

    @Override
    public List<Tag> getTagListByPhoneId(Integer id) {
        return individualDao.getTagListByIndividualId(id);
    }

    @Override
    public List<Website> getWebsiteListByPhoneId(Integer id) {
        return individualDao.getWebsiteListByIndividualId(id);
    }

}
