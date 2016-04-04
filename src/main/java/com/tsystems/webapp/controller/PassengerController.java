package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.PassengerEntity1;
import com.tsystems.webapp.service.interfaces.IPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/passenger")
public class PassengerController {

    @Autowired
    private IPassengerService passengerService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView getPassengers(@PathVariable Long id,
                                      final RedirectAttributes redirectAttributes)
    {
        ModelAndView mav = new ModelAndView("passengers");
        List<PassengerEntity1> passengers = passengerService.getListPassengers(id);
        mav.addObject("passengers", passengers);
        return mav;
    }
}
