package net.bonvio.dao.entityImpl;

import net.bonvio.dao.GenericDAOImpl;
import net.bonvio.model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mil on 24.11.2015.
 */

@Repository
public class EmployeeDaoImpl extends GenericDAOImpl<Employee> {}
