package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.StationEntity;
import com.tsystems.webapp.service.interfaces.IStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/stationsU")
public class ScheduleForUserController {

    @Autowired
    private IStationService stationService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView stationListPage() {
        ModelAndView mav = new ModelAndView("stationsU");
        List<StationEntity> stationList = stationService.getAllStations();
        mav.addObject("stations", stationList);
        return mav;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchStation(@RequestParam("search") String search,
                                      final RedirectAttributes redirectAttributes)
    {
        ModelAndView mav = new ModelAndView("stationsU");
        List<StationEntity> stationList = stationService.getStationByName(search);
        mav.addObject("stations", stationList);
        return mav;
    }

}
