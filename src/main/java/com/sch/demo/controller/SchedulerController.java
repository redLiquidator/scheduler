package com.sch.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sch.demo.model.User;
import com.sch.demo.service.SchedulerService;
import com.sch.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SchedulerController{
	
	private static final Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	@Autowired
	SchedulerService schedulerService;
	@Autowired
	UserService userService;
	
	@GetMapping("/scheduler")   
	public ModelAndView scheduler(HttpSession session) {
		
	      ModelAndView mv = new ModelAndView("scheduler.html");
	             
	      logger.info("+++++++++++scheduler page++++++++++++");
	      logger.info("login user :: "+session.getAttribute("userId"));
	      String userid = "dalkahn";
	      User user = userService.SelectUserInfo(userid);
	      mv.addObject("user", user);
	      logger.info("user : " + user);
		  	  
	      return mv;
	}
}
