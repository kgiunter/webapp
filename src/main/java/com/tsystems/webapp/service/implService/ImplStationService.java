package com.tsystems.webapp.service.implService;


import com.tsystems.webapp.entity.StationEntity;
import com.tsystems.webapp.repository.StationRepository;
import com.tsystems.webapp.service.interfaces.IStationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplStationService implements IStationService{

    @Resource
    private StationRepository stationRepository;

    @Transactional
    public void add(StationEntity stationEntity)
    {
        stationRepository.saveAndFlush(stationEntity);
    }

    @Transactional
    public List<StationEntity> getStationByName(String search)
    {
        if (search.equals("")) return null;
        return stationRepository.getStationByName(search);
    }

    @Transactional
    public List<StationEntity> getAllStations() {
        return stationRepository.findAll();
    }

    @Transactional
    public void addEntity(String nameStation)
    {
        stationRepository.addEntity(nameStation);
    }
}
