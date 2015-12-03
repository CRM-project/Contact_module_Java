package net.bonvio.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
/**
 * Created by mil on 26.11.15.
 */
public class GenericDAOImpl<T extends Serializable> implements GenericDAO<T> {

    private Class<T> type;

    @SuppressWarnings("unchecked")
    public GenericDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<T> findAll() { return entityManager.createQuery("SELECT entity FROM " + type.getSimpleName() + " entity").getResultList();
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
    public T getById(Integer id) { return entityManager.find(type, id);
    }

    @Override
    public T getReference(Integer id) {
        return entityManager.getReference(type, id);
    }
}
