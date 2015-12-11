package net.bonvio.dao.generic.implementations;

import net.bonvio.dao.generic.interfaces.GenericDAOListById;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by igorjan on 11.12.15.
 * banana
 */

public abstract class GenericDAOImplListById<T extends Serializable> extends GenericDAOImpl<T> implements GenericDAOListById<T> {

    private Class<T> tClass;

    @SuppressWarnings("unchecked")
    public GenericDAOImplListById() {
        tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public List<T> listById(Integer id, String name) {
        return entityManager.createQuery("select entity from " + tClass.getSimpleName() + " entity where entity." + name + ".id = :id").setParameter("id", id).getResultList();
    }
}
