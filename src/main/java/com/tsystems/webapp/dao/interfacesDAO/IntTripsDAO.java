package com.tsystems.webapp.dao.interfacesDAO;


import com.tsystems.webapp.model.TripModel;

import java.util.Date;
import java.util.List;

public interface IntTripsDAO {
    public List<TripModel> getAllTrips(String stationName, String arrivalStation, long date1, long date2);
}
