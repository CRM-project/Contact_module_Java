package net.bonvio.dao.implementations;

import net.bonvio.dao.generic.implementations.GenericDAOImpl;
import net.bonvio.dao.interfaces.CompanyDAO;
import net.bonvio.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 * banana
 */

@Repository
public class CompanyDAOImpl extends GenericDAOImpl<Company> implements CompanyDAO {

    @Override
    public List<Phone> getPhoneListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.phoneList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.getPhoneList();
    }

    @Override
    public List<Email> getEmailListByCompanyId(Integer id) {
        Company company = (Company)entityManager.createQuery("select c from Company c join fetch c.emailList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.getEmailList();
    }

    @Override
    public List<Social> getSocialListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.socialList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.getSocialList();
    }

    @Override
    public List<Tag> getTagListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.tagList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.getTagList();
    }

    @Override
    public List<Website> getWebsiteListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.websiteList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.getWebsiteList();
    }

}

