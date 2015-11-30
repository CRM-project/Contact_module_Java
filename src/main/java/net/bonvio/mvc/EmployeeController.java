package net.bonvio.mvc;

import net.bonvio.model.Employee;
import net.bonvio.service.entity.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

        view.setViewName("hello");

        return view;
    }

    /**
     * partition for EMPLOYEE
     * @return
     */
    @RequestMapping(value="employee", method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> getEmployees() {
        List<Employee> list = employeeService.getAll();
        return list;
    }

}
