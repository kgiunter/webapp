package com.tsystems.webapp.model;

import javax.persistence.*;

@Entity
@Table(name = "ticket", schema = "dbtrain")
public class TicketModel {

    private int id;
    private int Schedule_id;
    private int Passenger_id;
    private int Train_id;
    private int placeNumber;

    public TicketModel(){}

    public TicketModel(int id, int schedule_id, int passenger_id, int train_id, int placeNumber) {
        this.id = id;
        Schedule_id = schedule_id;
        Passenger_id = passenger_id;
        Train_id = train_id;
        this.placeNumber = placeNumber;
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
    @JoinColumn(name = "Schedule_id")
    public int getSchedule_id() {
        return Schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        Schedule_id = schedule_id;
    }

    @Basic
    @ManyToOne
    @JoinColumn(name = "Passenger_id")
    public int getPassenger_id() {
        return Passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        Passenger_id = passenger_id;
    }

    @Basic
    @ManyToOne
    @JoinColumn(name = "Train_id")
    public int getTrain_id() {
        return Train_id;
    }

    public void setTrain_id(int train_id) {
        Train_id = train_id;
    }

    @Basic
    @Column(name = "placeNumber")
    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketModel that = (TicketModel) o;

        if (id != that.id) return false;
        if (Schedule_id != that.Schedule_id) return false;
        if (Passenger_id != that.Passenger_id) return false;
        if (Train_id != that.Train_id) return false;
        return placeNumber == that.placeNumber;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Schedule_id;
        result = 31 * result + Passenger_id;
        result = 31 * result + Train_id;
        result = 31 * result + placeNumber;
        return result;
    }
}
