package com.heb.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.heb.app.vo.Person;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value="/about", method= RequestMethod.GET)
	public String about(Locale locale, Model model){
		logger.info("About page with locale: "+ locale.toString());
		model.addAttribute("message", "This is about page.");
		return "about";
	}
	@RequestMapping(value="/international", method= RequestMethod.GET)
	public String inter(Locale locale, Model model){
		logger.info("internationalization"+ locale.toString());
		return "international";
	}
	
	@RequestMapping(value="/savePerson", method = RequestMethod.POST)
	public String savePerson(@ModelAttribute Person person, Model model, BindingResult result){
		logger.info("----save Person------");
		logger.info("----print--person---"+ person.getAddress());
		logger.info("----print--person---"+ person.getPersonName());
		
		return "viewresult";
	}
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String form(@ModelAttribute Person person,BindingResult result, Locale locale){
		logger.info("------form-------------");
		return "form";
	}
	@RequestMapping(value="/angular", method=RequestMethod.GET)
	public String angular(){
		return "angular";
	}
	
	
}
