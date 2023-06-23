package com.sch.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sch.demo.model.Quiz;
import com.sch.demo.service.SchedulerService;

@Controller
public class SchedulerController{
	
	private static final Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	@Autowired
	SchedulerService schedulerService;
	
	@GetMapping("/scheduler")   
	public ModelAndView scheduler() {
		//assign quiz.html file to mv
	      ModelAndView mv = new ModelAndView("scheduler.html");
	             
	      logger.info("+++++++++++scheduler++++++++++++");

	     // List<Quiz> quizList = quizService.SelectQuizList();

	     // mv.getModelMap().addAttribute("quizList", quizList);
		  //logger.info("quizList : " + quizList);
		  	  
	      return mv;
	}
}
