/**
 * 
 */
package com.heb.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heb.app.service.PersonService;
import com.heb.app.utils.Helper;
import com.heb.app.vo.Person;

/**
 * @author hungbang
 *
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> getAllPersonLst() {
		return Helper.createDB();
	}

}
