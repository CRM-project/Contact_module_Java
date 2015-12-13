package net.bonvio.dao.implementations;

import net.bonvio.dao.generic.implementations.GenericDAOImpl;
import net.bonvio.dao.generic.implementations.GenericDAOImplListById;
import net.bonvio.dao.interfaces.IndividualDao;
import net.bonvio.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mil on 02.12.15.
 * banana
 */

@Repository
public class IndividualDaoImpl extends GenericDAOImplListById<Individual> implements IndividualDao{

    @Override
    public List<Phone> getPhoneListByIndividualId(Integer id) {
        Individual individual = (Individual) entityManager.createQuery("select c from Individual c join fetch c.phoneList where c.id = :id").setParameter("id", id).getSingleResult();
        return individual.getPhoneList();
    }

    @Override
    public List<Email> getEmailListByIndividualId(Integer id) {
        Individual individual = (Individual)entityManager.createQuery("select c from Individual c join fetch c.emailList where c.id = :id").setParameter("id", id).getSingleResult();
        return individual.getEmailList();
    }

    @Override
    public List<Social> getSocialListByIndividualId(Integer id) {
        Individual individual = (Individual) entityManager.createQuery("select c from Individual c join fetch c.socialList where c.id = :id").setParameter("id", id).getSingleResult();
        return individual.getSocialList();
    }

    @Override
    public List<Tag> getTagListByIndividualId(Integer id) {
        Individual individual = (Individual) entityManager.createQuery("select c from Individual c join fetch c.tagList where c.id = :id").setParameter("id", id).getSingleResult();
        return individual.getTagList();
    }

    @Override
    public List<Website> getWebsiteListByIndividualId(Integer id) {
        Individual individual = (Individual) entityManager.createQuery("select c from Individual c join fetch c.websiteList where c.id = :id").setParameter("id", id).getSingleResult();
        return individual.getWebsiteList();
    }
}
