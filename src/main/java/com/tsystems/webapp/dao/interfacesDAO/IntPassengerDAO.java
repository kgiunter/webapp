package com.tsystems.webapp.dao.interfacesDAO;


import com.tsystems.webapp.model.PassengerModel;

import java.util.List;

public interface IntPassengerDAO {
    
    public List<PassengerModel> getAllPassengers(int scheduleId);
    public PassengerModel getPassengerById(int id );
}
