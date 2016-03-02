package com.tsystems.webapp.dao.impl;


import com.tsystems.webapp.dao.interfacesDAO.notUsed.ITrainDAO;
import com.tsystems.webapp.model.TrainModel;

import javax.persistence.EntityManager;

public class TrainDAO extends DAO<TrainModel, Integer> implements ITrainDAO<TrainModel, Integer>
{
    public TrainDAO(EntityManager em)
    {
        super(em, TrainModel.class);
    }
}
