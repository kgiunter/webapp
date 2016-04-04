package com.tsystems.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "route", schema="test")
public class RouteEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "idTrain")
    private Long idTrain;

    @Column(name = "arrivalStation")
    private String arrivalStation;

    @Column(name = "status")
    private Integer status;

    public RouteEntity(){}

    public RouteEntity(Long id, Long idTrain, String arrivalStation, Integer status) {
        this.id = id;
        this.idTrain = idTrain;
        this.arrivalStation = arrivalStation;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTrain() {
        return idTrain;
    }

    public void setIdTrain(Long idTrain) {
        this.idTrain = idTrain;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RouteEntity that = (RouteEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idTrain != null ? !idTrain.equals(that.idTrain) : that.idTrain != null) return false;
        if (arrivalStation != null ? !arrivalStation.equals(that.arrivalStation) : that.arrivalStation != null)
            return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idTrain != null ? idTrain.hashCode() : 0);
        result = 31 * result + (arrivalStation != null ? arrivalStation.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
