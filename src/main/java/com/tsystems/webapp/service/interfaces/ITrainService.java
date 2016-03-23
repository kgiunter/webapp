package com.tsystems.webapp.service.interfaces;


import com.tsystems.webapp.entity.TrainEntity;

import java.util.List;

public interface ITrainService
{
        public void add(TrainEntity trainEntity);
        public void edit(TrainEntity trainEntity);
        public void delete(Long trainId);
        public TrainEntity getTrain(Long trainId);
        public List<TrainEntity> getAllTrains();
}
