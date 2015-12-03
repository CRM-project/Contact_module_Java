package net.bonvio.service.entityImpl;


import net.bonvio.dao.GenericDAO;
import net.bonvio.model.Answer;
import net.bonvio.service.entity.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private GenericDAO<Answer> answerGenericDAO;

    @Override
    public void save(Answer answer) {
        answerGenericDAO.save(answer);
    }

    @Override
    public List<Answer> getList() {
        return answerGenericDAO.getList();
    }

    @Override
    public void delete(Answer answer) {
        answerGenericDAO.delete(answer);
    }

    @Override
    public void deleteById(Integer id) {
        answerGenericDAO.deleteById(id);
    }

    @Override
    public Answer getById(Integer id) {
        return answerGenericDAO.getById(id);
    }

    @Override
    public void update(Answer answer) {
        answerGenericDAO.update(answer);
    }


}
