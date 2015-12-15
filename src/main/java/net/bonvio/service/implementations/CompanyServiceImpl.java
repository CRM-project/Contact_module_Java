package net.bonvio.service.implementations;

import net.bonvio.dao.interfaces.CompanyDAO;
import net.bonvio.model.*;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.CompanyService;
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
public class CompanyServiceImpl extends GenericServiceImpl<Company> implements CompanyService {

    @Autowired
    CompanyDAO companyDao;

    @Override
    public List<Phone> getPhoneListByCompanyId(Integer id) {
        return companyDao.getPhoneListByCompanyId(id);
    }

    @Override
    public List<Email> getEmailListByCompanyId(Integer id) {
        return companyDao.getEmailListByCompanyId(id);
    }

    @Override
    public List<Social> getSocialListByCompanyId(Integer id) {
        return companyDao.getSocialListByCompanyId(id);
    }

    @Override
    public List<Tag> getTagListByCompanyId(Integer id) {
        return companyDao.getTagListByCompanyId(id);
    }

    @Override
    public List<Website> getWebsiteListByCompanyId(Integer id) {
        return companyDao.getWebsiteListByCompanyId(id);
    }

}
