package net.bonvio.dao.generic.implementations;

import net.bonvio.dao.generic.interfaces.GenericDAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
/**
 * Created by mil on 26.11.15.
 */

@Repository
public abstract class GenericDAOImpl<T extends Serializable> implements GenericDAO<T> {

    private Class<T> tClass;

    @SuppressWarnings("unchecked")
    public GenericDAOImpl() {
        tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<T> getList() { return entityManager.createQuery("SELECT entity FROM " + tClass.getSimpleName() + " entity").getResultList();
    }

    @Override
    public T getById(Integer id) { return entityManager.find(tClass, id);
    }

    @Override
    public void save(T entity) {
        entityManager.persist(entity);
    }

    @Override
    public void delete(T entity) {
        entityManager.remove(entity);
    }

    @Override
    public void deleteById(Integer id) {
        entityManager.remove(getReference(id));
    }

    @Override
    public void update(T entity) {
        entityManager.merge(entity);
    }

    @Override
    public T getReference(Integer id) {
        return entityManager.getReference(tClass, id);
    }
}
