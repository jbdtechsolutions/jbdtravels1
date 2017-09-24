package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JbdMainController {
	

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("message", "This is Home page!");
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value = { "/newTrip" }, method = RequestMethod.GET)
	public ModelAndView newPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("newTrip");
		return model;
	}
	
	@RequestMapping(value = { "/getAllBalance" }, method = RequestMethod.GET)
	public ModelAndView getAllBalancePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("getBalance");
		return model;
	}
	
	@RequestMapping(value = { "/getAllCustomers" }, method = RequestMethod.GET)
	public ModelAndView getAllCustomers() {
		ModelAndView model = new ModelAndView();
		model.setViewName("getCustomer");
		return model;
	}
	
	@RequestMapping(value = { "/addNewCustomer" }, method = RequestMethod.GET)
	public ModelAndView addNewCustomer() {
		ModelAndView model = new ModelAndView();
		model.setViewName("addCustomer");
		return model;
	}
	
	

	/*	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Login Form - Database Authentication");
		model.addObject("message", "This page is for ROLE_ADMIN only!");
		model.setViewName("admin");

		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;

	}
	
	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

		ModelAndView model = new ModelAndView();
		
		//check if user is login
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);
		
			model.addObject("username", userDetail.getUsername());
			
		}
		
		model.setViewName("403");
		return model;
	}
	*/
}

		

