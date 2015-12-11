package net.bonvio.dao.generic.interfaces;

import java.util.List;

/**
 * Created by igorjan on 11.12.15.
 */
public interface GenericDAOListById<T> extends GenericDAO<T> {
    List<T> listById(Integer id, String name);
}
