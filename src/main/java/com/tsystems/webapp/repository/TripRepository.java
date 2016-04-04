package com.tsystems.webapp.repository;


import com.tsystems.webapp.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


public interface TripRepository{

    /*
      @Query(value = "SELECT station.nameStation, train.arrivalStation, train.numberTrain, train.nameTrain, " +
            "schedule.departureDate, schedule.arrivalDate FROM station, train, schedule " +
            "WHERE station.id = schedule.idDepartureStation AND train.id = schedule.idTrain " +
            "AND station.nameStation = (?1) AND train.arrivalStation = (?2) AND " +
            "schedule.departureDate BETWEEN (?3) AND (?4)", nativeQuery = true)
    List<TripEntity> getAllTrips(String departureStation, String arrivalStation, Date departureDate, Date arrivalDate);
     */


}
