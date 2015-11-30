package net.bonvio.dao.entityImpl;

import net.bonvio.dao.GenericDAOImpl;
import net.bonvio.dao.entity.CompanyDao;
import net.bonvio.model.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mil on 26.11.15.
 */
@Repository
public class CompanyDaoImpl extends GenericDAOImpl<Company> implements CompanyDao {

    public CompanyDaoImpl() {
        System.out.println("Created CompanyDaoImpl");
    }

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Phone> getPhoneListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.phoneList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.phoneList;
    }

    @Override
    public List<Email> getEmailListByCompanyId(Integer id) {
        Company company = (Company)entityManager.createQuery("select c from Company c join fetch c.emailList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.emailList;
    }

    @Override
    public List<Social> getSocialListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.socialList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.socialList;
    }

    @Override
    public List<Tag> getTagListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.tagList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.tagList;
    }

    @Override
    public List<Website> getWebsiteListByCompanyId(Integer id) {
        Company company = (Company) entityManager.createQuery("select c from Company c join fetch c.websiteList where c.id = :id").setParameter("id", id).getSingleResult();
        return company.websiteList;
    }

}

