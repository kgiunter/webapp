package com.tsystems.webapp;


import com.tsystems.webapp.dao.impl.DAO;
import com.tsystems.webapp.dao.impl.TrainDAO;
import com.tsystems.webapp.dao.interfacesDAO.notUsed.ITrainDAO;
import com.tsystems.webapp.model.TrainModel;
import com.tsystems.webapp.model.UserModel;
import com.tsystems.webapp.service.TrainService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {

    private static class Singleton {
        private static final Util INSTANCE = new Util();
    }

    private static final String PERSISTENCE_UNIT = "PersistenceUnit";

    private volatile EntityManagerFactory entityManagerFactory;
    private volatile EntityManager entityManager;

    /* DAOs */
    private volatile DAO<UserModel, Integer> userDAO;
    private volatile ITrainDAO<TrainModel, Integer> trainDAO;


    /* Services */
   // private volatile UserService userService;
    private volatile TrainService trainService;


    private Util() {
    }

    public static Util getInstance() {
        return Singleton.INSTANCE;
    }


    public EntityManagerFactory getEntityManagerFactory() {
        EntityManagerFactory localInstance = entityManagerFactory;
        if (entityManagerFactory == null) {
            synchronized (this) {
                localInstance = entityManagerFactory;
                if (entityManagerFactory == null) {
                    entityManagerFactory = localInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
                }
            }
        }
        return localInstance;
    }

    public EntityManager getEntityManager() {
        EntityManager localInstance = entityManager;
        if (localInstance == null || !localInstance.isOpen()) {
            synchronized (this) {
                localInstance = entityManager;
                if (localInstance == null || !localInstance.isOpen()) {
                    entityManager = localInstance = getEntityManagerFactory().createEntityManager();
                }
            }
        }
        return localInstance;
    }

    public ITrainDAO<TrainModel, Integer> getTrainDAO() {
        ITrainDAO<TrainModel, Integer> localInstance = trainDAO;
        if (localInstance == null) {
            synchronized (this) {
                localInstance = trainDAO;
                if (localInstance == null) {
                    trainDAO = localInstance = new TrainDAO(getEntityManager());
                }
            }
        }
        return localInstance;
    }

}
