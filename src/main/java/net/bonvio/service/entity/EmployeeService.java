package net.bonvio.service.entity;

import net.bonvio.model.Employee;

import java.util.List;

/**
 * Created by vano on 17.11.15.
 */
public interface EmployeeService {

    void save(Employee employee);
    List<Employee> getAll();
    void delete(Employee employee);
    void deleteById(Integer id);
    Employee findById(Integer id);
    void update(Employee employee);
}
