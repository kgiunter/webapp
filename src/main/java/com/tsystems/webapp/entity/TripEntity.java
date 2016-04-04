package com.tsystems.webapp.entity;


public class TripEntity {

    private String departureStation;
    private String arrivalStation;
    private String departureDate;
   // private String departureTime;
    private String arrivalDate;
   // private String arrivalTime;

    public TripEntity(){}

    public TripEntity(String departureStation, String arrivalStation, String departureDate, String departureTime,
                      String arrivalDate, String arrivalTime) {
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.departureDate = departureDate;
       // this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
       // this.arrivalTime = arrivalTime;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

  //  public String getDepartureTime() {
  //      return departureTime;
  //  }

   // public void setDepartureTime(String departureTime) {
   //     this.departureTime = departureTime;
   // }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

   // public String getArrivalTime() {
   //     return arrivalTime;
  //  }

  //  public void setArrivalTime(String arrivalTime) {
  //      this.arrivalTime = arrivalTime;
  //  }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripEntity that = (TripEntity) o;

        if (departureStation != null ? !departureStation.equals(that.departureStation) : that.departureStation != null)
            return false;
        if (arrivalStation != null ? !arrivalStation.equals(that.arrivalStation) : that.arrivalStation != null)
            return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        return arrivalDate != null ? arrivalDate.equals(that.arrivalDate) : that.arrivalDate == null;

    }

    @Override
    public int hashCode() {
        int result = departureStation != null ? departureStation.hashCode() : 0;
        result = 31 * result + (arrivalStation != null ? arrivalStation.hashCode() : 0);
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        return result;
    }
}
