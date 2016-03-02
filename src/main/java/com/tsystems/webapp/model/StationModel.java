package com.tsystems.webapp.model;


import javax.persistence.*;

@Entity
@Table(name = "station", schema = "dbtrain")
public class StationModel {
    private int id;
    private String stationName;

    public StationModel(){}

    public StationModel(int id, String stationName) {
        this.id = id;
        this.stationName = stationName;
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
    @Column(name = "stationName")
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StationModel that = (StationModel) o;

        if (id != that.id) return false;
        return stationName != null ? stationName.equals(that.stationName) : that.stationName == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
        return result;
    }
}
