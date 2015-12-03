package net.bonvio.dao.entityImpl;

import net.bonvio.dao.GenericDAOImpl;
import net.bonvio.model.Answer;
import org.springframework.stereotype.Repository;

/**
 * Created by mil on 02.12.15.
 */

@Repository
public class AnswerDaoImpl extends GenericDAOImpl<Answer> {

    public AnswerDaoImpl() {
        System.out.println("Created AnswerDaoImpl");
    }

}
