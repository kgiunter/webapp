package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.PassengerEntity1;
import com.tsystems.webapp.entity.Schedule1Entity;
import com.tsystems.webapp.entity.ScheduleEntity;
import com.tsystems.webapp.entity.ScheduleEntity2;
import com.tsystems.webapp.service.interfaces.IPassengerService;
import com.tsystems.webapp.service.interfaces.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.ejb.Schedule;
import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/schedule")
public class ScheduleController {

    @Autowired
    private IScheduleService scheduleService;



    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView getSchedules(@PathVariable Long id,
                                   final RedirectAttributes redirectAttributes)
    {
        ModelAndView mav = new ModelAndView("schedules");
        List<Schedule1Entity> schedules = scheduleService.getSchedulesOfStation(id);
        mav.addObject("schedules", schedules);
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView newSchedulePage() {
        ModelAndView mav = new ModelAndView("schedule_create", "schedule", new ScheduleEntity2());
        return mav;
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView addSchedule(@ModelAttribute  ScheduleEntity2 scheduleEntity, BindingResult result,
                                   @RequestParam("nameDepartureStation") String nameDepartureStation,
                                   @RequestParam("nameArrivalStation") String nameArrivalStation,
                                   @RequestParam("numberTrain") Integer numberTrain,
                                   @RequestParam("departureDate") String departureDate,
                                    @RequestParam("departureTime") String departureTime,
                                   @RequestParam("arrivalDate") String arrivalDate,
                                    @RequestParam("arrivalTime") String arrivalTime,
                                   final RedirectAttributes redirectAttributes)

    {


        if (result.hasErrors())
        {
            return new ModelAndView("schedule_create", "schedule", new ScheduleEntity2()).addObject("message", "Field must not be empty!");
        }

        ModelAndView mav = new ModelAndView();


        // 2013-01-01
        // 13:10
        Integer depY = Integer.parseInt(departureDate.substring(0,4));
        Integer depM = Integer.parseInt(departureDate.substring(5,7));
        Integer depD = Integer.parseInt(departureDate.substring(8,10));

        Integer depH = Integer.parseInt(departureTime.substring(0,2));
        Integer depMm = Integer.parseInt(departureTime.substring(3,5));

        //String departureDate1 = departureDate +" "+departureTime;
        Date departureD = new Date(depY-1900,depM-1,depD,depH,depMm,00);

        //String arrivalDate1 = arrivalDate+ " "+arrivalTime;

        Integer arY = Integer.parseInt(arrivalDate.substring(0,4));
        Integer arM = Integer.parseInt(arrivalDate.substring(5,7));
        Integer arD = Integer.parseInt(arrivalDate.substring(8,10));

        Integer arH = Integer.parseInt(arrivalTime.substring(0,2));
        Integer arMm = Integer.parseInt(arrivalTime.substring(3,5));
        Date arrivalD = new Date(arY-1900,arM-1,arD,arH,arMm,00);

        try {
            scheduleService.addSchedule(nameDepartureStation, nameArrivalStation, numberTrain, departureD, arrivalD);
        } catch (Exception e)
        {mav.setViewName("redirect:/train/create.html");}
        mav.setViewName("redirect:/station/list.html");
        //  if (error != null) {
        //
        //   }

        //redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

}
