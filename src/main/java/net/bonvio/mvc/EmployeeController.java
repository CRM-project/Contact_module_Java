package net.bonvio.mvc;

import net.bonvio.model.Employee;
import net.bonvio.mvc.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/employee")

public class EmployeeController extends GenericController<Employee> {

}
