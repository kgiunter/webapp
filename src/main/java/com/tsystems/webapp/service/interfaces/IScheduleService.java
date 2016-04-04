package com.tsystems.webapp.service.interfaces;

import com.tsystems.webapp.entity.Schedule1Entity;
import com.tsystems.webapp.entity.ScheduleEntity;

import java.util.Date;
import java.util.List;


public interface IScheduleService {
    List<Schedule1Entity> getSchedulesOfStation(Long id);
    void addSchedule(String nameDepartureStation, String nameArrivalStation, Integer numberTrain, Date departureDate, Date arrivalDate);
}
