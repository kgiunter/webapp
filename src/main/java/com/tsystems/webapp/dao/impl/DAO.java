package com.tsystems.webapp.dao.impl;


import com.tsystems.webapp.UtilWeb;
import com.tsystems.webapp.dao.interfacesDAO.notUsed.IDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;


@Repository
public class DAO<E, K extends Serializable> implements IDAO<E, K> {
    private static final Logger LOGGER = Logger.getLogger(DAO.class.getName());

    Class<E> entityClass;

    @PersistenceContext
    EntityManager em;

    public DAO() {
        em = UtilWeb.getInstance().getEntityManager();
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[0];
    }

    public void persist(E entity) {
        try {
            em.persist(entity);
        } catch (Exception e) {
            LOGGER.error("Error on persist entity " + entityClass.getSimpleName());
        }
    }

    public void merge(E entity) {
        try {
            em.merge(entity);
        } catch (Exception e) {
            LOGGER.error("Error on merge entity " + entityClass.getSimpleName());
        }
    }

    public void remove(E entity) {
        try {
            em.remove(entity);
        } catch (Exception e) {
            LOGGER.error("Error on remove entity " + entityClass.getSimpleName());
        }

    }

    public E getByID(K id) {
        try {
            return em.find(entityClass, id);
        } catch (Exception e) {
            LOGGER.error("Error on load entity " + entityClass.getSimpleName());
        }
        return null;
    }

    public List<E> getAll() {
        List<E> entities;
        try {
            entities = em.createQuery("SELECT o FROM " + entityClass.getSimpleName() + " o").getResultList();
            return new ArrayList<E>(entities);
        } catch (Exception e) {
            LOGGER.error("Error on load entities " + entityClass.getSimpleName());
        }
        return null;
    }

}
