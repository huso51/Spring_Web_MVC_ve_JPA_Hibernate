package com.mimaraslan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	//    http://localhost:8080/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		model.addAttribute("mesaj1", "SELAM" );
		model.addAttribute("mesaj2", "SPRING" );
		model.addAttribute("mesaj3", "MVC" );
		
		return "home";
	}
	
}
