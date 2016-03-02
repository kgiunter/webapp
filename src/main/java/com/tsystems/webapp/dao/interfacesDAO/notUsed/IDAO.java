package com.tsystems.webapp.dao.interfacesDAO.notUsed;

import java.util.List;

//ok
public interface IDAO <E, K> {

    public void persist(E entity);
    public void merge(E entity);
    public void remove(E entity);
    public E getByID(K id);
    public List<E> getAll();

}
