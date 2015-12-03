package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Employee;
import net.bonvio.service.entity.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private GenericDAO<Employee> employeeGenericDAO;

    @Override
    public void save(Employee employee) {
        employeeGenericDAO.save(employee);
    }

    @Override
    public List<Employee> getList() {
        return employeeGenericDAO.findAll();
    }

    @Override
    public void delete(Employee employee) {
        employeeGenericDAO.delete(employee);
    }

    @Override
    public void deleteById(Integer id) {
        employeeGenericDAO.deleteById(id);
    }

    @Override
    public Employee getById(Integer id) {
        return employeeGenericDAO.getById(id);
    }

    @Override
    public void update(Employee employee) {
        employeeGenericDAO.update(employee);
    }
}
