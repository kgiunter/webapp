package com.tsystems.webapp.dao.impl;


import com.tsystems.webapp.dao.interfacesDAO.notUsed.IDAO;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;


public class DAO<E,K> implements IDAO<E,K> {
    private static final Logger LOGGER = Logger.getLogger(DAO.class.getName());

    Class<E> entityClass;
    EntityManager em;

    public DAO(EntityManager em, Class<E> entityClass) {
        this.em = em;
        this.entityClass = entityClass;
    }


    public void persist(E entity)
    {
        try
        {
            em.persist(entity);
        } catch (Exception e)
        {
            LOGGER.error("Error on persist entity " + entityClass.getSimpleName());
        }
    }

    public void merge(E entity) {
        try
        {
            em.merge(entity);
        } catch (Exception e)
        {
            LOGGER.error("Error on merge entity " + entityClass.getSimpleName());
        }
    }

    public void remove(E entity) {
        try
        {
            em.remove(entity);
        } catch (Exception e)
        {
            LOGGER.error("Error on remove entity " + entityClass.getSimpleName());
        }

    }

    public E getByID(K id)
    {
        try
        {
            return em.find(entityClass, id);
        } catch (Exception e)
        {
            LOGGER.error("Error on load entity " + entityClass.getSimpleName());
        }
        return null;
    }

    public List<E> getAll()
    {
        List<E> entities;
        try
        {
            entities = em.createQuery("SELECT o FROM " + entityClass.getSimpleName() + " o").getResultList();
            return new ArrayList<E>(entities);
        } catch (Exception e)
        {
            LOGGER.error("Error on load entities " + entityClass.getSimpleName());
        }
        return null;
    }


    /*
    public TrainEntity findByName(String nameTrain) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<TrainEntity> cq = builder.createQuery(TrainEntity.class);
        Root<TrainEntity> from = cq.from(TrainEntity.class);
        Predicate predicate = builder.equal(from.get("nameTrain"), nameTrain);
        cq.select(from).where(predicate);
        List<TrainEntity> result = em.createQuery(cq).getResultList();
        if (result.size() > 1) {
            log.warn("The number of search results of the train by name more than one");
            return result.get(0);
        }
        if (result.size() == 0) {
            log.warn("Train not found with this name");
            return null;
        }

        return result.get(0);
     */
}
