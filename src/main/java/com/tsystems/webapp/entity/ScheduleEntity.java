package com.tsystems.webapp.entity;

import javax.persistence.*;
import java.util.Date;


// update

@Entity
@Table(name = "schedule", schema = "test")
public class ScheduleEntity {

    // 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // 2
    //@OneToMany(fetch = FetchType.LAZY)
    @Column(name = "idDepartureStation")
    private Long idDepartureStation;

    // 3
    //@OneToMany(fetch = FetchType.LAZY)
    @Column(name = "idTrain")
    private Long idTrain;

    // 4
    @Temporal(TemporalType.DATE)
    @Column(name = "departureDate")
    private Date departureDate;

    // 5
    @Temporal(TemporalType.DATE)
    @Column(name = "arrivalDate")
    private Date arrivalDate;

    // 6
    @Column(name = "status")
    private Integer status;


    // constructors

    public ScheduleEntity(){}

    public ScheduleEntity(Long idDepartureStation, Long idTrain, Date departureDate, Date arrivalDate, Integer status) {
        this.idDepartureStation = idDepartureStation;
        this.idTrain = idTrain;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.status = status;
    }



    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdDepartureStation() {
        return idDepartureStation;
    }

    public void setIdDepartureStation(Long idDepartureStation) {
        this.idDepartureStation = idDepartureStation;
    }

    public Long getIdTrain() {
        return idTrain;
    }

    public void setIdTrain(Long idTrain) {
        this.idTrain = idTrain;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



    // equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity that = (ScheduleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idDepartureStation != null ? !idDepartureStation.equals(that.idDepartureStation) : that.idDepartureStation != null)
            return false;
        if (idTrain != null ? !idTrain.equals(that.idTrain) : that.idTrain != null) return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (arrivalDate != null ? !arrivalDate.equals(that.arrivalDate) : that.arrivalDate != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idDepartureStation != null ? idDepartureStation.hashCode() : 0);
        result = 31 * result + (idTrain != null ? idTrain.hashCode() : 0);
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }


}
