package com.tsystems.webapp;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class UtilWeb {

    private static UtilWeb instance = null;
    private final EntityManagerFactory emf;
    private EntityManager em;

    private UtilWeb()
    {
        emf = Persistence.createEntityManagerFactory("PersistenceWebApp");
        em = emf.createEntityManager();
    }

    public static UtilWeb getInstance()
    {
        if (instance == null) { instance = new UtilWeb();}
        return instance;
    }

    public static void closeEmf()
    {
        if (instance != null) {instance.emf.close();}
    }

    public EntityManagerFactory getEntityManagerFactory()
    {
        return emf;
    }

    public EntityManager getEntityManager()
    {
        return em;
    }

    // here should be
    // dao's .....
    // services ....


}