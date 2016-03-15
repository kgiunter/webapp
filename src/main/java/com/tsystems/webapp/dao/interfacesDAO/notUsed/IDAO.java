package com.tsystems.webapp.dao.interfacesDAO.notUsed;

import java.io.Serializable;
import java.util.List;

//ok
public interface IDAO <E, K extends Serializable> {

    public void persist(E entity);
    public void merge(E entity);
    public void remove(E entity);
    public E getByID(K id);
    public List<E> getAll();


      //  E create(E entity);
       // E read(K id);
      //  E update(E entity);
      //  void delete(E entity);


}
