package net.bonvio.service.entityImplementation;


import net.bonvio.dao.generic.GenericDAO;
import net.bonvio.model.Customer;
import net.bonvio.service.entityInterface.CustomerService;
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
    public List<Customer> getList() {
        return customerGenericDAO.getList();
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
    public Customer getById(Integer id) {
        return customerGenericDAO.getById(id);
    }

    @Override
    public void update(Customer customer) {
        customerGenericDAO.update(customer);
    }


}
