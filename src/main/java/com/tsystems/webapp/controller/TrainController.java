package com.tsystems.webapp.controller;


import com.tsystems.webapp.entity.TrainEntity;
import com.tsystems.webapp.service.interfaces.ITrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value="/train")
public class TrainController {

	@Autowired
	private ITrainService trainService;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView newTrainPage() {
		ModelAndView mav = new ModelAndView("train_create", "train", new TrainEntity());
		return mav;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewTrain(@ModelAttribute TrainEntity train,
									   BindingResult result,
									   final RedirectAttributes redirectAttributes) {

		if (result.hasErrors())
			return new ModelAndView("train_create");

		ModelAndView mav = new ModelAndView();
		String message = "New train " + train.getNameTrain() + " was successfully created.";

		trainService.add(train);
		mav.setViewName("redirect:/index.html");

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView trainListPage() {
		ModelAndView mav = new ModelAndView("train_list");
		List<TrainEntity> trainList = trainService.getAllTrains();
		mav.addObject("trainList", trainList);
		return mav;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editTrainPage(@PathVariable Long id) {
		ModelAndView mav = new ModelAndView("train_edit");
		TrainEntity trainEntity = trainService.getTrain(id);
		mav.addObject("train", trainEntity);
		return mav;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public ModelAndView editTrain(@ModelAttribute TrainEntity trainEntity,
								  BindingResult result,
								  @PathVariable Long id,
								  final RedirectAttributes redirectAttributes) {

		if (result.hasErrors())
			return new ModelAndView("train_edit");

		ModelAndView mav = new ModelAndView("redirect:/index.html");
		String message = "Train was successfully updated.";

		trainService.edit(trainEntity);

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView deleteShop(@PathVariable Long id,
								   final RedirectAttributes redirectAttributes) {

		ModelAndView mav = new ModelAndView("redirect:/index.html");

		trainService.delete(id);
		String message = "The train " + "was successfully deleted.";

		redirectAttributes.addFlashAttribute("message", message);
		return mav;
	}
}