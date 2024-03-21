package com.sch.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sch.demo.model.User;
import com.sch.demo.service.SchedulerService;
import com.sch.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SchedulerController {

	private static final Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	@Autowired
	SchedulerService schedulerService;
	@Autowired
	UserService userService;

	@GetMapping("/scheduler")
	public ModelAndView scheduler(HttpSession session) {

		ModelAndView mv = new ModelAndView("scheduler.html");

		logger.info("+++++++++++scheduler page++++++++++++");
		logger.info("login user :: " + session.getAttribute("userid"));
		
		//get the user's session
		String userid = (String) session.getAttribute("userid");
		//get the user's schedule
		List<HashMap<String, String>> myList = new ArrayList<HashMap<String, String>>();
		
		mv.addObject("userid", userid);
		logger.info("userid : " + userid);
		return mv;
	}
	

	@PostMapping("/availability")
	public ArrayList<HashMap<String, String>> availability(@RequestBody User params) {  //@RequestBody doesn't work
		System.out.println("======SchedulerController.availability method called======");
		ArrayList<HashMap<String,String>> avail = new ArrayList<HashMap<String,String>>();
		avail = (ArrayList<HashMap<String, String>>) schedulerService.getUserSchedule(params.getUserid(),params.getStartDate());
		return avail;
	}
	
	
	
}
