package net.bonvio.service.implementations;

import net.bonvio.dao.implementations.PhoneDAOImpl;
import net.bonvio.dao.interfaces.IndividualDAO;
import net.bonvio.model.*;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 * banana
 */

@Service
@Transactional
public class IndividualServiceImpl extends GenericServiceImpl<Individual> implements IndividualService {

    /**
     * Эта фигня работает, то некорректно. Так как делает запрос на общую таблицу contactInfo и получает все ее Айдюки
     */
    @Autowired
    PhoneDAOImpl phoneDao;

    @Override
    public List<Phone> getPhoneListById(Integer id) {
        return phoneDao.listById(id, "contactInfo");
    }


    /**
     * Данные методы сделаны с целью получения корректных запросов, если получится их переделать на генерик, то хорошо!
     */
    @Autowired
    IndividualDAO individualDao;

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
