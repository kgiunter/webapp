package com.tsystems.webapp.repository;


import com.tsystems.webapp.entity.Schedule1Entity;
import com.tsystems.webapp.entity.ScheduleEntity;
import com.tsystems.webapp.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {

    @Query(value = "SELECT station.nameStation, train.arrivalStation , " +
            "train.numberTrain, train.nameTrain, schedule.departureDate, schedule.arrivalDate, " +
            "schedule.status, schedule.id from station, train, schedule " +
            "where station.id = schedule.idDepartureStation and train.id = schedule.idTrain " +
            "and station.id = ?1", nativeQuery = true)
    public List<Schedule1Entity> getSchedulesOfStation(Long id);

    @Modifying
    @Query(value = "insert into schedule (idDepartureStation, idTrain, departureDate, arrivalDate) VALUES (?1, ?2, ?3, ?4)",
            nativeQuery = true)
    public void addSchedule(Long idDepartureStation, Long idTrain, Date departureDate, Date arrivalDate);


    @Query(value = "SELECT station.nameStation, train.arrivalStation, train.numberTrain, train.nameTrain, " +
            "schedule.departureDate, schedule.arrivalDate FROM station, train, schedule " +
            "WHERE station.id = schedule.idDepartureStation AND train.id = schedule.idTrain " +
            "AND station.nameStation = ?1 AND train.arrivalStation = ?2 AND " +
            "schedule.departureDate BETWEEN ?3 AND ?4", nativeQuery = true)
    List<TripEntity> getAllTrips(String departureStation, String arrivalStation, Date departureDate, Date arrivalDate);


}
