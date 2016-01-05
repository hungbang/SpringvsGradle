/**
 * 
 */
package com.heb.app.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.heb.app.service.PersonService;
import com.heb.app.vo.Person;

/**
 * @author hungbang
 *
 */
@Controller
public class ObjectController {
	private static final Logger logger = LoggerFactory.getLogger(ObjectController.class);
	
	@Autowired
	@Qualifier(value="personService")
	PersonService personService;
	
	@RequestMapping(value="/getJsonPersonList", method=RequestMethod.GET)
	public ResponseEntity<List<Person>> getPersonList(){
		List<Person> persons = personService.getAllPersonLst();
		logger.info(persons.get(0).getAddress());
		return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
	}
	
	
}
