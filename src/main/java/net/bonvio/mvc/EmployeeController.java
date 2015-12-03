package net.bonvio.mvc;

import net.bonvio.model.Employee;
import net.bonvio.service.entity.EmployeeService;
import net.bonvio.settings.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/employee")

public class EmployeeController {

    /**
     * Autowired
     */
    @Autowired
    EmployeeService employeeService;

    /**
     *
     * @param view
     * @return hello
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getCustomerd(ModelAndView view) {
        view.setViewName("index");
        return view;
    }

    /**
     * get employees list
     * @return employees list
     */
    @RequestMapping(value="employee", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> getemployees() {
        List<Employee> list = employeeService.getList();
        return list;
    }

    /**
     * get employee by id
     * @param id
     * @return employee by id
     */
    @RequestMapping(value = "employee/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getemployee(@PathVariable Integer id) {
        return employeeService.getById(id);
    }

    /**
     * create employee
     * @param employee
     * @return employee id (or employee, if uncommented "return employee")
     */
    @RequestMapping(value = "employee", method = RequestMethod.POST)
    @ResponseBody
    public Object addemployee(@RequestBody Employee employee) {
        System.err.println(employee);
        employeeService.save(employee);
        return new Id(employee.getId());
        //return employee;
    }

    /**
     * update employee
     * @param employee
     */
    @RequestMapping(value = "employee", method = RequestMethod.PUT)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void updateemployee(@RequestBody Employee employee) {
        System.out.println(employee);
        employeeService.update(employee);
    }

    /**
     * delete employee by id
     * @param id
     */
    @RequestMapping(value = "employee/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteemployee(@PathVariable Integer id) {
        System.out.println("remove employee by id = " + id);
        employeeService.deleteById(id);
    }
}
