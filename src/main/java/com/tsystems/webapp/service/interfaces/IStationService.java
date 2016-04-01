package com.tsystems.webapp.service.interfaces;


import com.tsystems.webapp.entity.StationEntity;

import java.util.List;

public interface IStationService
{

//public void delete(Long Id);


    public void add(StationEntity stationEntity);
    public StationEntity getStationByName(String search);
    public List<StationEntity> getAllStations();
    public void addEntity(String nameStation);
}
