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
import com.sch.demo.service.Message;
import com.sch.demo.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(SchedulerController.class);

	@Autowired
	UserService userService;

	Message message;

	@GetMapping("/login")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("login.html");

		return mv;
	}

	@PostMapping("/member/login") // session : 로그인 유지
	public String login(@ModelAttribute User user, HttpSession session) {
		log.debug("user::" + user);
		log.debug("session::" + session);
		User loginResult = userService.login(user);
		String resultMessage = loginResult.getMessage();
		if (resultMessage.equals("AUTHENTICATION_SUCCESS")) {
			// login 성공
			session.setAttribute("userid", loginResult.getUserid());
			String userid = (String) session.getAttribute("userid");

			//ModelAndView mv = new ModelAndView("scheduler.html");
			//mv.addObject("userid", userid);
			//logger.info("userid : " + userid);
			
			  return "redirect:/scheduler";
		} else {
			// login 실패
			//ModelAndView mv = new ModelAndView("login.html");
			 return "redirect:/login";
		}
	}

	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		log.debug("++++++++logout++++++++++++++++");
		//ModelAndView mv = new ModelAndView("scheduler.html");
		//return mv;
		 return "redirect:/scheduler";
	}
}
