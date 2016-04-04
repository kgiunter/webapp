package com.tsystems.webapp.entity;


import java.util.Date;


public class Schedule1Entity {

    private String nameStation;
    private String arrivalStation;
    private Integer numberTrain;
    private String nameTrain;
    private Date departureDate;
    private Date arrivalDate;
    private Integer status;

    public Schedule1Entity(){}

    public Schedule1Entity(String nameStation, String arrivalStation, Integer numberTrain,
                           String nameTrain, Date departureDate, Date arrivalDate, Integer status)
    {
        this.nameStation = nameStation;
        this.arrivalStation = arrivalStation;
        this.numberTrain = numberTrain;
        this.nameTrain = nameTrain;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.status = status;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule1Entity that = (Schedule1Entity) o;

        if (nameStation != null ? !nameStation.equals(that.nameStation) : that.nameStation != null) return false;
        if (arrivalStation != null ? !arrivalStation.equals(that.arrivalStation) : that.arrivalStation != null)
            return false;
        if (numberTrain != null ? !numberTrain.equals(that.numberTrain) : that.numberTrain != null) return false;
        if (nameTrain != null ? !nameTrain.equals(that.nameTrain) : that.nameTrain != null) return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (arrivalDate != null ? !arrivalDate.equals(that.arrivalDate) : that.arrivalDate != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = nameStation != null ? nameStation.hashCode() : 0;
        result = 31 * result + (arrivalStation != null ? arrivalStation.hashCode() : 0);
        result = 31 * result + (numberTrain != null ? numberTrain.hashCode() : 0);
        result = 31 * result + (nameTrain != null ? nameTrain.hashCode() : 0);
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
