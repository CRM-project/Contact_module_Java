package net.bonvio.service.entityImpl;

import net.bonvio.dao.GenericDAO;
import net.bonvio.dao.entity.CompanyDao;
import net.bonvio.model.*;
import net.bonvio.service.entity.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 */

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private GenericDAO<Company> companyGenericDAO;

    @Override
    public void save(Company company) {
        companyGenericDAO.save(company);
    }

    @Override
    public List<Company> getAll() {
        return companyGenericDAO.findAll();
    }

    @Override
    public void delete(Company company) {
        companyGenericDAO.delete(company);
    }

    @Override
    public void deleteById(Integer id) {
        companyGenericDAO.deleteById(id);
    }

    @Override
    public Company findById(Integer id) {
        return companyGenericDAO.findById(id);
    }

    @Override
    public void update(Company company) {
        companyGenericDAO.update(company);
    }

    @Autowired
    CompanyDao companyDao;

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
