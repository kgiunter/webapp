package com.tsystems.webapp.entity;

import javax.persistence.*;
import java.util.Date;


// update

@Entity
@Table (name = "ticket", schema = "ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "idSchedule")
    private Long idSchedule;

    @Column(name = "idPassenger")
    private Long idPassenger;

    @Column(name = "place")
    private String place;

    @Column(name = "price")
    private Float price;

    @Column(name = "dateBuy")
    @Temporal(TemporalType.DATE)
    private Date dateBuy;

    // constructors
    public TicketEntity(){}

    public TicketEntity(Long idSchedule, Long idPassenger, String place, Float price, Date dateBuy) {
        this.idSchedule = idSchedule;
        this.idPassenger = idPassenger;
        this.place = place;
        this.price = price;
        this.dateBuy = dateBuy;
    }

    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(Long idSchedule) {
        this.idSchedule = idSchedule;
    }

    public Long getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(Long idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(Date dateBuy) {
        this.dateBuy = dateBuy;
    }

    // equals and hashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketEntity that = (TicketEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idSchedule != null ? !idSchedule.equals(that.idSchedule) : that.idSchedule != null) return false;
        if (idPassenger != null ? !idPassenger.equals(that.idPassenger) : that.idPassenger != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        return dateBuy != null ? dateBuy.equals(that.dateBuy) : that.dateBuy == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idSchedule != null ? idSchedule.hashCode() : 0);
        result = 31 * result + (idPassenger != null ? idPassenger.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (dateBuy != null ? dateBuy.hashCode() : 0);
        return result;
    }

}
