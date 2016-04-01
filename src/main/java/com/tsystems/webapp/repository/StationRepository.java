package com.tsystems.webapp.repository;


import com.tsystems.webapp.entity.StationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<StationEntity, Long>
{
    @Query("select s from StationEntity s where s.nameStation = :name")
    StationEntity getStationByName(@Param("name") String name);

    @Modifying
    @Query(value = "insert into station (nameStation) values (?1)", nativeQuery = true)
    public void addEntity(String nameStation);
}
