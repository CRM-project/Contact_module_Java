package net.bonvio.service.entity;

import net.bonvio.model.Customer;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */
public interface CustomerService {

    void save(Customer customer);
    List<Customer> getList();
    void delete(Customer customer);
    void deleteById(Integer id);
    Customer getById(Integer id);
    void update(Customer customer);
}

