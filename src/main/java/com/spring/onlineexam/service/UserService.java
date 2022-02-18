package com.spring.onlineexam.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.onlineexam.model.Users;

@Service
public class UserService {
	public ModelAndView login(Users user,HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		if(user == null) {
			modelAndView.setViewName("login.jsp");
			modelAndView.addObject("loginerror", "Invalid username or password");
		}
		else {
			if(user.getRole().equals("student")) {
				modelAndView.setViewName("userMain.jsp");
				request.getSession().setAttribute("userid", user.getId());
				modelAndView.addObject("profile", user.getProfilePicture());
			}
			else if(user.getRole().equals("admin")) {
				modelAndView.setViewName("adminMain.jsp");
			}
		}
		return modelAndView;
	}
}
