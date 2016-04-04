package com.tsystems.webapp.service.implService;


import com.tsystems.webapp.entity.PassengerEntity1;
import com.tsystems.webapp.repository.PassengerRepository;
import com.tsystems.webapp.service.interfaces.IPassengerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImplPassengerService implements IPassengerService{

    @Resource
    PassengerRepository passengerRepository;

    @Transactional
    public List<PassengerEntity1> getListPassengers(Long id) {
        return passengerRepository.getListPassengers(id);
    }
}
