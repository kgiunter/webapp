package com.tsystems.webapp.repository;


import com.tsystems.webapp.entity.PassengerEntity;
import com.tsystems.webapp.entity.PassengerEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<PassengerEntity, Long> {

    @Query(value = "SELECT passenger.id, passenger.lastName, passenger.firstName, " +
            "passenger.birthday, " +
            "ticket.dateBuy, ticket.place FROM passenger, schedule, ticket " +
            "WHERE schedule.id = ticket.idSchedule AND ticket.idPassenger = passenger.id " +
            "AND schedule.id = ?1", nativeQuery = true)
    public List<PassengerEntity1> getListPassengers(Long id);
}
