package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.TripEntity;
import com.tsystems.webapp.service.interfaces.ITripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/trip")
public class TripController {

    /*
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView newSchedulePage() {
        ModelAndView mav = new ModelAndView("schedule_create", "schedule", new ScheduleEntity2());
        return mav;
    }
     */

    @Autowired
    private ITripService tripService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public ModelAndView searchTrip(@ModelAttribute TripEntity tripEntity, BindingResult result,
                                    @RequestParam("departureStation") String departureStation,
                                    @RequestParam("arrivalStation") String arrivalStation ,
                                    @RequestParam("departureDate") String departureDate,
                                    @RequestParam("departureTime") String departureTime,
                                    @RequestParam("arrivalDate") String arrivalDate,
                                    @RequestParam("arrivalTime") String arrivalTime,
                                    final RedirectAttributes redirectAttributes)

    {

        if (result.hasErrors())
        {
            return new ModelAndView("trip", "trip", new TripEntity()).addObject("message", "Field must not be empty!");
        }

        ModelAndView mav = new ModelAndView("trips");


        // 2013-01-01
        // 13:10
        Integer depY = Integer.parseInt(departureDate.substring(0,4));
        Integer depM = Integer.parseInt(departureDate.substring(5,7));
        Integer depD = Integer.parseInt(departureDate.substring(8,10));

        Integer depH = Integer.parseInt(departureTime.substring(0,2));
        Integer depMm = Integer.parseInt(departureTime.substring(3,5));

        Date departureD = new Date(depY-1900,depM-1,depD,depH,depMm,00);

        Integer arY = Integer.parseInt(arrivalDate.substring(0,4));
        Integer arM = Integer.parseInt(arrivalDate.substring(5,7));
        Integer arD = Integer.parseInt(arrivalDate.substring(8,10));

        Integer arH = Integer.parseInt(arrivalTime.substring(0,2));
        Integer arMm = Integer.parseInt(arrivalTime.substring(3,5));
        Date arrivalD = new Date(arY-1900,arM-1,arD,arH,arMm,00);


        try {
            List<TripEntity> trips = tripService.getAllTrips(departureStation, arrivalStation, departureD, arrivalD);
            mav.addObject("trips", trips);
            mav.setViewName("trips");

        } catch (Exception e)
        {mav.setViewName("redirect:/trip/");}

        //  if (error != null) {
        //
        //   }

        //redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }




}
