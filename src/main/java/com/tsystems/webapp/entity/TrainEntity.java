package com.tsystems.webapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "train", schema = "test")
public class TrainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private Integer numberTrain;
    private String nameTrain;
    private Integer countPlace;

    public TrainEntity(){}

    public TrainEntity(Integer numberTrain, String nameTrain, Integer countPlace) {
        this.numberTrain = numberTrain;
        this.nameTrain = nameTrain;
        this.countPlace = countPlace;
    }

    public Long getId() {
        return id;
    }

    public Integer getNumberTrain() {
        return numberTrain;
    }

    public String getNameTrain() {
        return nameTrain;
    }

    public Integer getCountPlace() {
        return countPlace;
    }

    public void setNumberTrain(Integer numberTrain) {
        this.numberTrain = numberTrain;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNameTrain(String nameTrain) {
        this.nameTrain = nameTrain;
    }

    public void setCountPlace(Integer countPlace) {
        this.countPlace = countPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainEntity that = (TrainEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numberTrain != null ? !numberTrain.equals(that.numberTrain) : that.numberTrain != null) return false;
        if (nameTrain != null ? !nameTrain.equals(that.nameTrain) : that.nameTrain != null) return false;
        return countPlace != null ? countPlace.equals(that.countPlace) : that.countPlace == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (numberTrain != null ? numberTrain.hashCode() : 0);
        result = 31 * result + (nameTrain != null ? nameTrain.hashCode() : 0);
        result = 31 * result + (countPlace != null ? countPlace.hashCode() : 0);
        return result;
    }
}
