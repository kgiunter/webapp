package com.tsystems.webapp.model;


import javax.persistence.*;

//@Entity
//@Table(name = "train", schema = "dbtrain")
public class TrainModel {
    /*

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int trainNumber;
    @Column
    private String arrivalStation;
    @Column
    private int placesCount;

    public TrainModel(){}

    public TrainModel(int id, int trainNumber, String arrivalStation, int placesCount) {
        this.id = id;
        this.trainNumber = trainNumber;
        this.arrivalStation = arrivalStation;
        this.placesCount = placesCount;
    }

   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "trainNumber")
    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Basic
    @Column(name = "arrivalStation")
    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    @Basic
    @Column(name = "placesCount")
    public int getPlacesCount() {
        return placesCount;
    }

    public void setPlacesCount(int placesCount) {
        this.placesCount = placesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainModel that = (TrainModel) o;

        if (id != that.id) return false;
        if (trainNumber != that.trainNumber) return false;
        if (placesCount != that.placesCount) return false;
        return arrivalStation != null ? arrivalStation.equals(that.arrivalStation) : that.arrivalStation == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + trainNumber;
        result = 31 * result + (arrivalStation != null ? arrivalStation.hashCode() : 0);
        result = 31 * result + placesCount;
        return result;
    }
    */
}
