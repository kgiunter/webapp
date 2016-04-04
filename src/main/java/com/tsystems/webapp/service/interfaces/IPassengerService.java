package com.tsystems.webapp.service.interfaces;


import com.tsystems.webapp.entity.PassengerEntity1;

import java.util.List;

public interface IPassengerService {
    public List<PassengerEntity1> getListPassengers(Long id);
}
