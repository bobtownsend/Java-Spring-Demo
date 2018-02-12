package com.wozu.springdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserNameController {
	
	@RequestMapping("/user/{userName}")
	public String getUserName(@PathVariable String userName) {
		return "You used the name " + userName;
	}
	
	@RequestMapping(value = "/user", method=RequestMethod.POST)
	public String postUserName(String userName) {
		return "Your friends name is " + userName;
	}
	
	//Uses model for parameter and post back
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public Person addPerson(Person person) {
		return person;
	}
}
