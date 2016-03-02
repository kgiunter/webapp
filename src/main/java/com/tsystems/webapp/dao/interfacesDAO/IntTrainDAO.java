package com.tsystems.webapp.dao.interfacesDAO;


import com.tsystems.webapp.model.TrainModel;

import java.util.List;

public interface IntTrainDAO {

    public void addTrain( TrainModel train );
    public void deleteTrain( int id );
    public void updateTrain( TrainModel train );
    public List<TrainModel> getAllTrains();
    public TrainModel getTrainById( int id );

}
