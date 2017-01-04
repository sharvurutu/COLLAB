package com.niit.collaboration.test;

import static org.junit.Assert.*;



import org.junit.Before;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;

import junit.framework.Assert;

public class UserTestCases {

	@Autowired
	User user;
	
	@Autowired
	UserDAO userDAO;
	
	AnnotationConfigApplicationContext context;
	
	
	@Before
	public void init()
	{	
		System.out.println("In INIT Method...");
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");
		user= (User) context.getBean("user");
	}
	
	@Test
	public void CreateUserTestCase(){
		System.out.println("Trying to create a new user");
		user.setId("102");
		user.setEmail("rutu956@gmail.com");
		user.setName("Rutuja");
		user.setMobile("9561774800");
		user.setPassword("sharvurutu");
		user.setRole("Admin");
		user.setReason("No Reason");
		user.setIsOnline('N');
		user.setStatus("N");
boolean status = userDAO.save(user);
		
		Assert.assertEquals("CreateUserTestCase", true, status);
		

	}
	
	/*//@Test
	public void GetuserTestCase() {
		User user = userDAO.get("rutu956177@gmail.com");
		System.out.println(user.getPassword());
		Assert.assertEquals("Get One user Test Case", null, userDAO.get("rutu956177@gmail.com"));
	}

	
	@Test
	public void ListuserTestCase() {
		Assert.assertEquals("Get One user Test Case", null, userDAO.list());
	}
	
	*/
	
}