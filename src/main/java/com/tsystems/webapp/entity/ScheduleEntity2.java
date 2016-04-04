package com.tsystems.webapp.entity;


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;


public class ScheduleEntity2 {

    @NotEmpty
    private String nameDepartureStation;
    @NotEmpty
    private String nameArrivalStation;
    @NotNull
    private Integer numberTrain;

    @NotEmpty
    private String departureDate;
    @NotEmpty
    private String departureTime;
    @NotEmpty
    private String arrivalDate;
    @NotEmpty
    private String arrivalTime;
    @NotEmpty
    public ScheduleEntity2(){}

    public ScheduleEntity2(String nameDepartureStation, String nameArrivalStation, Integer numberTrain, String departureDate,
                           String departureTime, String arrivalDate, String arrivalTime) {
        this.nameDepartureStation = nameDepartureStation;
        this.nameArrivalStation = nameArrivalStation;
        this.numberTrain = numberTrain;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        this.nameDepartureStation = nameDepartureStation;
    }

    public String getNameArrivalStation() {
        return nameArrivalStation;
    }

    public void setNameArrivalStation(String nameArrivalStation) {
        this.nameArrivalStation = nameArrivalStation;
    }

    public Integer getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(Integer numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity2 that = (ScheduleEntity2) o;

        if (nameDepartureStation != null ? !nameDepartureStation.equals(that.nameDepartureStation) : that.nameDepartureStation != null)
            return false;
        if (nameArrivalStation != null ? !nameArrivalStation.equals(that.nameArrivalStation) : that.nameArrivalStation != null)
            return false;
        if (numberTrain != null ? !numberTrain.equals(that.numberTrain) : that.numberTrain != null) return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (departureTime != null ? !departureTime.equals(that.departureTime) : that.departureTime != null)
            return false;
        if (arrivalDate != null ? !arrivalDate.equals(that.arrivalDate) : that.arrivalDate != null) return false;
        return arrivalTime != null ? arrivalTime.equals(that.arrivalTime) : that.arrivalTime == null;

    }

    @Override
    public int hashCode() {
        int result = nameDepartureStation != null ? nameDepartureStation.hashCode() : 0;
        result = 31 * result + (nameArrivalStation != null ? nameArrivalStation.hashCode() : 0);
        result = 31 * result + (numberTrain != null ? numberTrain.hashCode() : 0);
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        return result;
    }
}
