package com.tsystems.webapp.repository;


import com.tsystems.webapp.entity.TrainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Long>
{

    @Query("select s from TrainEntity s where s.numberTrain = :numberTrain and s.arrivalStation = :arrivalStation")
    List<TrainEntity> getTrainByNumberAndArStation(@Param("numberTrain") Integer numberTrain,
                                                   @Param("arrivalStation") String arrivalStation);

    @Query("select s from TrainEntity s where s.nameTrain = :name")
    List<TrainEntity> getTrainByName(@Param("name") String name);

    @Modifying
    @Query(value = "insert into train (numberTrain, nameTrain, arrivalStation, countPlaces) values (?1, ?2, ?3, ?4)",
            nativeQuery = true)
    public void addEntity(Integer numberTrain, String nameTrain, String arrivalStation, Integer countPlaces);
}
