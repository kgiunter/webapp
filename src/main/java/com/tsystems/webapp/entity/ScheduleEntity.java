package com.tsystems.webapp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schedule", schema = "test")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "idTrain")
    private Long idTrain;

    @Column(name = "idStation")
    private Long idStation;

    @Column(name = "idRoute")
    private Long idRoute;

    @Temporal(TemporalType.DATE)
    @Column(name = "departureDate")
    private Date departureDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "arrivalDate")
    private Date arrivalDate;

    @Column(name = "countFreePlace")
    private Integer countFreePlace;

    @Column(name = "status")
    private Integer status;
}
