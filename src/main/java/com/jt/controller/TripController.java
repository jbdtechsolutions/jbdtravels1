package com.jt.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jt.bean.trip.Trip;
import com.jt.service.trip.TripService;

@RestController
public class TripController {
	private final static Logger logger = Logger.getLogger(TripController.class);

	TripService tripService;

	public TripService getTripService() {
		return tripService;
	}

	public void setTripService(TripService tripService) {
		this.tripService = tripService;
	}

/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView landingPage() {
		logger.info("Load Create New Trip");
		ModelAndView model = new ModelAndView();
		JbdPropertyLoader jtConfig = new JbdPropertyLoader();
		model.setViewName(jtConfig.getJbdRootConfigDetails().getLandingPage());
		return model;
	}*/

	@RequestMapping(value = { "/addtrip" }, method = RequestMethod.POST)
	public String addNewTripController(@RequestBody Trip newtrip) {
		logger.info("Trip Controller's Add Trip method Called... " + newtrip.toString());
		String response = tripService.addTripService(newtrip);
		logger.info("Successfully Added a new Trip ...");
		return response;
	}


	@RequestMapping(value =  "/getalltrip", method = RequestMethod.GET, produces={"application/json"} )
	public List<Trip> getAllTrips() {
		System.out.println("Trip Controller's JsonPage method Called... ");
		List<Trip> trips = tripService.getAllTrips();
		System.out.println("Trip Details in Json page");
		return trips;

	}

	public static void main(String args[]) {
		TripController ctrlr = new TripController();
	}
}
