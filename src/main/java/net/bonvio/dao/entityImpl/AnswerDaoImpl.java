package net.bonvio.dao.entityImpl;

import net.bonvio.dao.GenericDAOImpl;
import net.bonvio.dao.entity.AnswerDao;
import net.bonvio.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

/**
 * Created by mil on 02.12.15.
 */

@Repository
public class AnswerDaoImpl extends GenericDAOImpl<Answer> implements AnswerDao{

}
