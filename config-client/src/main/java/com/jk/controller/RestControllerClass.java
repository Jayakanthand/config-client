package com.jk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk.dto.Person;
import com.jk.util.MessageProperty;

@RestController
@RequestMapping(value = "/jk")
public class RestControllerClass {
	
	@Autowired
	MessageProperty messageProperty;

	@GetMapping(value = "/getProfileData")
	public Person getProfileData() {
		Person person = new Person();
		person.setFirstName(messageProperty.getFirstName());
		person.setLastName(messageProperty.getLastName());
		return person;

	}
}
