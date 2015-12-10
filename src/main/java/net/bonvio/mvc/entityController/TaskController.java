package net.bonvio.mvc.entityController;

import net.bonvio.model.Task;
import net.bonvio.mvc.generic.GenericController;
import net.bonvio.service.entityInterface.TaskService;
import net.bonvio.settings.ResponseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/task")
public class TaskController extends GenericController<Task> {

    @Autowired
    TaskService taskService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody Task task) {
        task.setDateCreate(new Date());
        task.setStatus(1);
        taskService.save(task);
        return new ResponseId(task.getId());
        //return t;
    }

    /**


     @Autowired
     CompanyService companyService;

     @RequestMapping(value = "", method = RequestMethod.POST)
     @ResponseBody
     public Object save(@RequestBody Company company) {
     company.setType("company");
     companyService.save(company);
     return new ResponseId(company.getId());
     //return t;
     }

     @RequestMapping(value = "", method = RequestMethod.PUT)
     @ResponseStatus(HttpStatus.OK)
     public void update(@RequestBody Company company) {
     company.setType("company");
     companyService.update(company);
     }

     */

}
