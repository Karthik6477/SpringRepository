package com.spring.onlineexam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.onlineexam.dao.UserRepository;
import com.spring.onlineexam.model.Users;
import com.spring.onlineexam.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserService userService;
	
	@GetMapping("home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		return modelAndView;
	}
	
	@PostMapping("loginservlet")
	public ModelAndView login(@RequestParam String email,String password,HttpServletRequest request) {
		Users user=(Users) userRepo.loginCheck(email, password);
		System.out.println(email+" "+password);
		ModelAndView modelAndView = userService.login(user, request);
		return modelAndView;
	}
}
