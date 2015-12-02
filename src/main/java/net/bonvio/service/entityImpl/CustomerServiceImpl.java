package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Customer;
import net.bonvio.service.entity.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private GenericDAO<Customer> customerGenericDAO;

    @Override
    public void save(Customer customer) {
        customerGenericDAO.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerGenericDAO.findAll();
    }

    @Override
    public void delete(Customer customer) {
        customerGenericDAO.delete(customer);
    }

    @Override
    public void deleteById(Integer id) {
        customerGenericDAO.deleteById(id);
    }

    @Override
    public Customer findById(Integer id) {
        return customerGenericDAO.findById(id);
    }

    @Override
    public void update(Customer customer) {
        customerGenericDAO.update(customer);
    }


}
