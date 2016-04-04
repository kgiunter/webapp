package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.StationEntity;
import com.tsystems.webapp.service.interfaces.IStationService;
import com.tsystems.webapp.validation.StationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/station")
public class StationController {
    @Autowired
    private IStationService stationService;
//
   @Autowired
   private StationValidator validator;

/*
@InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }
 */



/*
    @Autowired
    public StationController(StationValidator validator) {
        this.validator = validator;
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
    public ModelAndView addStation(@ModelAttribute @Valid StationEntity stationEntity, BindingResult result,
                                   @RequestParam("nameStation") String nameStation,
                                   final RedirectAttributes redirectAttributes)
                               //    @RequestParam(value = "error", required = false) String error)
    {


        if (result.hasErrors())
        {
            return new ModelAndView("station_create", "station", new StationEntity()).addObject("message", "Name is required!");
        }





        ModelAndView mav = new ModelAndView();


        try {
            stationService.addEntity(nameStation);
        } catch (Exception e)
        {mav.setViewName("redirect:/station/list.html");}
        mav.setViewName("redirect:/station/list.html");
      //  if (error != null) {
        //
     //   }

        //redirectAttributes.addFlashAttribute("message", message);
        return mav;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchStation(@RequestParam("search") String search,
                                      final RedirectAttributes redirectAttributes)
    {
        ModelAndView mav = new ModelAndView("stations");
        List<StationEntity> stationList = new ArrayList<>();
        stationList.addAll(stationService.getStationByName(search));
        mav.addObject("stations", stationList);
        return mav;
    }
}
