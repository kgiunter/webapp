package com.tsystems.webapp.service.implService;

import com.tsystems.webapp.entity.TrainEntity;
import com.tsystems.webapp.repository.TrainRepository;
import com.tsystems.webapp.service.interfaces.ITrainService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplTrainService implements ITrainService{


    @Resource
    private TrainRepository trainRepository;

    @Transactional
    public void add(TrainEntity trainEntity)
    {
        trainRepository.saveAndFlush(trainEntity);
    }

    @Transactional
    public void edit(TrainEntity trainEntity)
    {
        trainRepository.saveAndFlush(trainEntity);
    }

    @Transactional
    public void delete(Long trainId)
    {
        trainRepository.delete(trainId);
    }

    @Transactional
    public TrainEntity getTrain(Long trainId)
    {
        return trainRepository.findOne(trainId);
    }

    @Transactional
    public List getAllTrains()
    {
        return trainRepository.findAll();
    }

    @Transactional
    public void addEntity(Integer numberTrain, String nameTrain, String arrivalStation, Integer countPlaces)
    {
        trainRepository.addEntity(numberTrain, nameTrain, arrivalStation, countPlaces);
    }

    @Transactional
    public List<TrainEntity> getTrainByNumberAndArStation(Integer numberTrain, String arrivalStation) {
        return trainRepository.getTrainByNumberAndArStation(numberTrain,arrivalStation);
    }

    @Transactional
    public List<TrainEntity> getTrainByName(String name)
    {
        return trainRepository.getTrainByName(name);
    }
}
