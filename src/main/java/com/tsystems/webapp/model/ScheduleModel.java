package com.tsystems.webapp.model;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "schedule", schema = "dbtrain")
public class ScheduleModel {
    private int id;
    private int station_id;
    private int train_id;
    private Date departureDate;
    private Date arrivalDate;
    private int status; // if status==0 -> schedule was deleted, if ==1 -> schedule is active

    public ScheduleModel(){}

    public ScheduleModel(int id, int station_id, int train_id, Date departureDate, Date arrivalDate, int status) {
        this.id = id;
        this.station_id = station_id;
        this.train_id = train_id;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @ManyToOne
    @JoinColumn(name = "Station_id")
    //@Column(name = "Station_id")
    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    @Basic
    //@Column(name = "Train_id")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Train_id")
    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    @Basic
    @Temporal (TemporalType.DATE)
    @Column(name = "departureDate")

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Column(name = "arrivalDate")
    @Temporal(TemporalType.DATE)
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleModel that = (ScheduleModel) o;

        if (id != that.id) return false;
        if (station_id != that.station_id) return false;
        if (train_id != that.train_id) return false;
        if (status != that.status) return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        return arrivalDate != null ? arrivalDate.equals(that.arrivalDate) : that.arrivalDate == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + station_id;
        result = 31 * result + train_id;
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }

}
