package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.StationEntity;
import com.tsystems.webapp.service.interfaces.IStationService;
import com.tsystems.webapp.validation.StationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/station")
public class StationController {
    @Autowired
    private IStationService stationService;

    private StationValidator validator;

    @Autowired
    public StationController(StationValidator validator) {
        this.validator = validator;
    }


/*
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView createNewStation(@ModelAttribute StationEntity stationEntity,
                                       BindingResult result,
                                       final RedirectAttributes redirectAttributes) {

        if (result.hasErrors())
            return new ModelAndView("station_create");

        ModelAndView mav = new ModelAndView();
        String message = "New station " + stationEntity.getNameStation() + " was successfully created.";

        //stationService.add(stationEntity);
        stationService.addEntity("nameStation");
        mav.setViewName("redirect:/station");

        redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }
*/
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView stationListPage() {
        ModelAndView mav = new ModelAndView("stations");
        List<StationEntity> stationList = stationService.getAllStations();
        mav.addObject("stations", stationList);
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView newStationPage() {
        ModelAndView mav = new ModelAndView("station_create", "station", new StationEntity());
        return mav;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView addStation(@ModelAttribute StationEntity stationEntity, BindingResult result,
                                   @RequestParam("nameStation") String nameStation,
                                   final RedirectAttributes redirectAttributes)
    {
        if (result.hasErrors())
            return new ModelAndView("station_create");

        ModelAndView mav = new ModelAndView();
        String message = "New station " + stationEntity.getNameStation() + " was successfully created.";

        try {
            stationService.addEntity(nameStation);
        } catch (Exception e)
        {mav.setViewName("redirect:/station/list.html");}
        mav.setViewName("redirect:/station/list.html");

        //redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchStation(@RequestParam("search") String search,
                                      final RedirectAttributes redirectAttributes)
    {
        ModelAndView mav = new ModelAndView("stations");
        List<StationEntity> stationList = new ArrayList<>();
        stationList.add(stationService.getStationByName(search));
        mav.addObject("stations", stationList);
        return mav;
    }
}
