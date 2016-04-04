package com.tsystems.webapp.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

// update

@Entity
@Table(name = "train", schema = "test")
public class TrainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotNull
    @Column(name = "numberTrain")
    private Integer numberTrain;


    @NotEmpty
    @Column(name = "nameTrain")
    private String nameTrain;


    @NotEmpty
    @Column(name = "arrivalStation")
    private String arrivalStation;

    @NotNull
    @Column(name = "countPlaces")
    private Integer countPlaces;

    @Column(name="status")
    private Integer status;



    // constructors

    public TrainEntity(){}

    public TrainEntity(Integer numberTrain, String nameTrain, String arrivalStation, Integer countPlaces, Integer status) {
        this.numberTrain = numberTrain;
        this.nameTrain = nameTrain;
        this.arrivalStation = arrivalStation;
        this.countPlaces = countPlaces;
        this.status = status;
    }


    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(Integer numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getNameTrain() {
        return nameTrain;
    }

    public void setNameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Integer getCountPlaces() {
        return countPlaces;
    }

    public void setCountPlaces(Integer countPlaces) {
        this.countPlaces = countPlaces;
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

        TrainEntity that = (TrainEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numberTrain != null ? !numberTrain.equals(that.numberTrain) : that.numberTrain != null) return false;
        if (nameTrain != null ? !nameTrain.equals(that.nameTrain) : that.nameTrain != null) return false;
        if (arrivalStation != null ? !arrivalStation.equals(that.arrivalStation) : that.arrivalStation != null)
            return false;
        if (countPlaces != null ? !countPlaces.equals(that.countPlaces) : that.countPlaces != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numberTrain != null ? numberTrain.hashCode() : 0);
        result = 31 * result + (nameTrain != null ? nameTrain.hashCode() : 0);
        result = 31 * result + (arrivalStation != null ? arrivalStation.hashCode() : 0);
        result = 31 * result + (countPlaces != null ? countPlaces.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }


}
