package com.niranjan.spring.web.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niranjan.spring.web.Dao.jobsadda;
import com.niranjan.spring.web.services.DaoServices;

@Controller
public class OffersController {
	private DaoServices service;
	
	/*
	@RequestMapping("/")
	public ModelAndView showHome() {
		
		ModelAndView mv = new ModelAndView("home");
		
		Map<String, Object> model = mv.getModel();
		
		model.put("name", "<b>River</b>");
		
		return mv;
	}
	*/
	@Autowired
	public void setService(DaoServices service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String showHome(Model model) {
		List<jobsadda> objects=service.GetViewData();
		model.addAttribute("name", objects);
		
		return "home";
	}
}
