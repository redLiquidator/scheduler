package com.sch.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sch.demo.model.Quiz;
import com.sch.demo.model.User;
import com.sch.demo.service.schedulerService;
import com.sch.demo.service.UserService;

@Controller
public class SchedulerController{
	
	private static final Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	@Autowired
	schedulerService schedulerService;
	@Autowired
	UserService userService;
	
	@GetMapping("/scheduler")   
	public ModelAndView scheduler() {
		
	      ModelAndView mv = new ModelAndView("scheduler.html");
	             
	      logger.info("+++++++++++scheduler++++++++++++");
	      String userid = "dalkahn";
	      User user = userService.SelectUserInfo(userid);
	      mv.addObject("user", user);
	      logger.info("user : " + user);
		  	  
	      return mv;
	}
}
