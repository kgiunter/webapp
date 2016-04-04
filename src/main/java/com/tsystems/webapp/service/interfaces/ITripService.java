package com.tsystems.webapp.service.interfaces;


import com.tsystems.webapp.entity.TripEntity;

import java.util.Date;
import java.util.List;

public interface ITripService {
    List<TripEntity> getAllTrips(String departureStation, String arrivalStation, Date departureDate, Date arrivalDate);
}
