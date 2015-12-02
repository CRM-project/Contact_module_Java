package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Individual;
import net.bonvio.service.entity.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class IndividualServiceImpl implements IndividualService {

    @Autowired
    private GenericDAO<Individual> individualGenericDAO;

    @Override
    public void save(Individual individual) {
        individualGenericDAO.save(individual);
    }

    @Override
    public List<Individual> getAll() {
        return individualGenericDAO.findAll();
    }

    @Override
    public void delete(Individual individual) {
        individualGenericDAO.delete(individual);
    }

    @Override
    public void deleteById(Integer id) {
        individualGenericDAO.deleteById(id);
    }

    @Override
    public Individual findById(Integer id) {
        return individualGenericDAO.findById(id);
    }

    @Override
    public void update(Individual individual) {
        individualGenericDAO.update(individual);
    }


}
