package net.bonvio.dao.entityImplementation;

import net.bonvio.dao.generic.GenericDAOImpl;
import net.bonvio.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Repository
public class TaskDaoImpl extends GenericDAOImpl<Task> {

/*    public List<Task> getList() {
        return entityManager.createQuery("SELECT entity FROM Task entity "
                //+                "join fetch entity.employeeExecutor"
                )
                .getResultList();
    }*/

}
