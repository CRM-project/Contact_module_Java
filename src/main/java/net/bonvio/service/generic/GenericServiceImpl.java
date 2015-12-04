package net.bonvio.service.generic;

import net.bonvio.dao.generic.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mil on 03.12.15.
 */

@Service
@Transactional
public abstract class GenericServiceImpl<T extends Serializable> implements GenericService<T> {

    @Autowired
    public GenericDAO<T> tGenericDAO;

    public GenericDAO<T> gettGenericDAO() {
        return tGenericDAO;
    }

    public void settGenericDAO(GenericDAO<T> tGenericDAO) {
        this.tGenericDAO = tGenericDAO;
    }

    @Transactional
    @Override
    public List<T> getList() {
        return tGenericDAO.getList();
    }

    @Transactional
    @Override
    public void save(T entity) {
        tGenericDAO.save(entity);
    }

    @Override
    public void delete(T entity) {
        tGenericDAO.delete(entity);
    }

    @Override
    public void deleteById(Integer id) {
        tGenericDAO.deleteById(id);
    }

    @Override
    public T getById(Integer id) {
        return tGenericDAO.getById(id);
    }

    @Override
    public void update(T entity) {
        tGenericDAO.update(entity);
    }

    /*
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
    */

}
