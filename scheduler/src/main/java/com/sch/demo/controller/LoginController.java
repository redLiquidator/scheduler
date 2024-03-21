package com.sch.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sch.demo.model.User;
import com.sch.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController{
	
	@Autowired
	UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	@PostMapping("/member/login") // session : 로그인 유지
	public String login(@ModelAttribute User user, HttpSession session) {
		log.debug("user::" + user);
		log.debug("session::" + session);
		User loginResult = userService.login(user);
		String resultMessage = loginResult.getMessage();
		if (resultMessage.equals("AUTHENTICATION_SUCCESS")) {
			// login 성공
			//set the login user's userid to session
			session.setAttribute("userid", loginResult.getUserid());
			String userid = (String) session.getAttribute("userid");

			return "redirect:/scheduler";
		} else {
			// login 실패 login 으로 돌아간다
			return "redirect:/login";
		}
	}

	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		log.debug("++++++++logout++++++++++++++++");
		// ModelAndView mv = new ModelAndView("scheduler.html");
		// return mv;
		return "redirect:/scheduler";
	}
	@GetMapping("/login")   
	public ModelAndView contact() {
	      ModelAndView mv = new ModelAndView("login.html");
	    
	      return mv;
	}
}
