/**
 * 
 */
package com.heb.app.utils;

import java.util.ArrayList;
import java.util.List;

import com.heb.app.vo.Person;

/**
 * @author hungbang
 *
 */
public class Helper {
	public static List<Person> createDB(){
		List<Person> persons = new ArrayList<Person>();
		Person person = null;
		for(int i = 0; i < 10; i++){
			person = new Person();
			person.setId(String.valueOf(i));
			person.setPersonName("Name-"+ i);
			person.setAddress("Da Nang");
			persons.add(person);
		}
		return persons;
	}
	
}
