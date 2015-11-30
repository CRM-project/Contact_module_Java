package net.bonvio.dao.entityImpl;

import net.bonvio.dao.GenericDAOImpl;
import net.bonvio.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Repository
public class UserDaoImpl extends GenericDAOImpl<User> {}
