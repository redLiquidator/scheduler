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
	      logger.info("login user :: "+session.getAttribute("userid"));
	      //테스트값
	      //String userid = "dalkahn";
	      
	      String userid = (String) session.getAttribute("userid");
	  
	      mv.addObject("userid", userid);	
	      logger.info("userid : " + userid);  
	      return mv;
	}
}
