package com.tsystems.webapp.service.implService;

import com.tsystems.webapp.entity.Schedule1Entity;
import com.tsystems.webapp.entity.ScheduleEntity;
import com.tsystems.webapp.entity.StationEntity;
import com.tsystems.webapp.entity.TrainEntity;
import com.tsystems.webapp.repository.ScheduleRepository;
import com.tsystems.webapp.repository.StationRepository;
import com.tsystems.webapp.repository.TrainRepository;
import com.tsystems.webapp.service.interfaces.IScheduleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class ImplScheduleService implements IScheduleService{

    @Resource
    private ScheduleRepository scheduleRepository;

    @Resource
    private TrainRepository trainRepository;

    @Resource
    private StationRepository stationRepository;

    @Transactional
    public List<Schedule1Entity> getSchedulesOfStation(Long id) {

        return scheduleRepository.getSchedulesOfStation(id);
    }

    @Transactional
    public void addSchedule(String nameDepartureStation, String nameArrivalStation,
                            Integer numberTrain, Date departureDate, Date arrivalDate) {
        //(`id`, `idDepartureStation`, `idTrain`, `departureDate`, `arrivalDate`, `status`)

        List<TrainEntity> list = trainRepository.getTrainByNumberAndArStation(numberTrain, nameArrivalStation);

        Long idTrain = (list.get(0)).getId();


        Long idDepartureStation = (stationRepository.getStationByName(nameDepartureStation).get(0)).getId();

        scheduleRepository.addSchedule(idDepartureStation,idTrain,departureDate,arrivalDate);


    }


    // @Override
   // public void addSchedule(Long idDepartureStation, Long idTrain, Date departureDate, Date arrivalDate) {

   // }
}
