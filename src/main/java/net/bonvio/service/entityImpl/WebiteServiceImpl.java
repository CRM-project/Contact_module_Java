package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Website;
import net.bonvio.service.entity.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class WebiteServiceImpl implements WebsiteService {

    @Autowired
    private GenericDAO<Website> websiteGenericDAO;

    @Override
    public void save(Website website) {
        websiteGenericDAO.save(website);
    }

    @Override
    public List<Website> getList() {
        return websiteGenericDAO.findAll();
    }

    @Override
    public void delete(Website website) {
        websiteGenericDAO.delete(website);
    }

    @Override
    public void deleteById(Integer id) {
        websiteGenericDAO.deleteById(id);
    }

    @Override
    public Website getById(Integer id) {
        return websiteGenericDAO.getById(id);
    }

    @Override
    public void update(Website website) {
        websiteGenericDAO.update(website);
    }


}
