package net.bonvio.service.entityImplementation;

import net.bonvio.model.Task;
import net.bonvio.service.entityInterface.TaskService;
import net.bonvio.service.generic.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class TaskServiceImpl extends GenericServiceImpl<Task> implements TaskService {

}
