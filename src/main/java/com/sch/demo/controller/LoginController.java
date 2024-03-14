package com.sch.demo.controller;

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
	
	@GetMapping("/login")   
	public ModelAndView contact() {
	      ModelAndView mv = new ModelAndView("login.html");
	    
	      return mv;
	}
	
	@PostMapping("/member/login") // session : 로그인 유지
    public String login(@ModelAttribute User user, HttpSession session) {
		log.debug("user::"+user.getUserid());
		log.debug("session::"+session);
        User loginResult = userService.login(user);
        if (loginResult != null) {
            // login 성공
            session.setAttribute("userid", loginResult.getUserid());
            //schedule 페이지로 이동
            return "redirect:/scheduler";
        } else {
            // login 실패
            return "login";
        }
    }
}
