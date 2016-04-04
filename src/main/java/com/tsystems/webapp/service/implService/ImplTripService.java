package com.tsystems.webapp.service.implService;


import com.tsystems.webapp.entity.TripEntity;
import com.tsystems.webapp.repository.ScheduleRepository;
import com.tsystems.webapp.repository.TripRepository;
import com.tsystems.webapp.service.interfaces.ITripService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ImplTripService implements ITripService{

    @Resource
    private ScheduleRepository scheduleRepository;


    @Transactional
    public List<TripEntity> getAllTrips(String departureStation, String arrivalStation, Date departureDate, Date arrivalDate) {
        return scheduleRepository.getAllTrips(departureStation, arrivalStation, departureDate, arrivalDate);
    }
}
