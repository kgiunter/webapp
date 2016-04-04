package com.tsystems.webapp.entity;


import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ScheduleEntityPK implements Serializable{


    @Id
    private Long id;

    @Id
    private Long idTrain;

    @Id
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idStation", nullable = false)
    private Long idStation;

    @Id
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idRoute", nullable = false)
    private Long idRoute;





    //конструкторы
    public ScheduleEntityPK() {}

    public ScheduleEntityPK(Long id, Long idTrain, Long idStation, Long idRoute) {
        this.id = id;
        this.idTrain = idTrain;
        this.idStation = idStation;
        this.idRoute = idRoute;
    }

    // геттеры и сеттеры

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

    public Long getIdStation() {
        return idStation;
    }

    public void setIdStation(Long idStation) {
        this.idStation = idStation;
    }

    public Long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
    }

    // equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntityPK that = (ScheduleEntityPK) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idTrain != null ? !idTrain.equals(that.idTrain) : that.idTrain != null) return false;
        if (idStation != null ? !idStation.equals(that.idStation) : that.idStation != null) return false;
        return idRoute != null ? idRoute.equals(that.idRoute) : that.idRoute == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idTrain != null ? idTrain.hashCode() : 0);
        result = 31 * result + (idStation != null ? idStation.hashCode() : 0);
        result = 31 * result + (idRoute != null ? idRoute.hashCode() : 0);
        return result;
    }
}
