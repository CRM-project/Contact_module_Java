package net.bonvio.mvc.entityController;

import net.bonvio.model.Task;
import net.bonvio.mvc.generic.GenericController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mil on 27.11.15.
 */

@Controller
@RequestMapping("/task")
public class TaskController extends GenericController<Task> {

}
