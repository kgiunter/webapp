package com.tsystems.webapp.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;


// update

@Entity
@Table(name = "station", schema = "test")
public class StationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotEmpty
    @Column(name = "nameStation", nullable = false)
    private String nameStation;

    @Column(name = "status")
    private Integer status;



    //constructors

    public StationEntity(){}

    public StationEntity(String nameStation, Integer status) {
        this.nameStation = nameStation;
        this.status = status;
    }



    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
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

        StationEntity that = (StationEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nameStation != null ? !nameStation.equals(that.nameStation) : that.nameStation != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameStation != null ? nameStation.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

}
