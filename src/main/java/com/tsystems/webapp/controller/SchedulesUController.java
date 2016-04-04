package com.tsystems.webapp.controller;

import com.tsystems.webapp.entity.Schedule1Entity;
import com.tsystems.webapp.service.interfaces.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/scheduleU")
public class SchedulesUController {




        @Autowired
        private IScheduleService scheduleService;



        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public ModelAndView getSchedules(@PathVariable Long id,
                                         final RedirectAttributes redirectAttributes)
        {
            ModelAndView mav = new ModelAndView("schedulesU");
            List<Schedule1Entity> schedules = scheduleService.getSchedulesOfStation(id);
            mav.addObject("schedules", schedules);
            return mav;
        }





}
