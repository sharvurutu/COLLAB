package com.niit.collaboration.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;

@RestController
@EnableTransactionManagement
public class UserController {

	@Autowired
	User user;

	@Autowired
	UserDAO userDAO;

	// Get List of all users
	// http://localhost:8080/collaboration/allusers
	
	@RequestMapping(value = "/hello")
	public String sayHello()
	{
		return null;
	}
	

}
