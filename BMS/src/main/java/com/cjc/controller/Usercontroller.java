package com.cjc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;
import com.cjc.service.UserService;



@RestController
public class Usercontroller 
{
	private static final Logger Log=LoggerFactory.getLogger(User.class);
	@Autowired private UserService userService;
	
	@PostMapping("/post")
	public ResponseEntity<User> oncreateuserdata(@RequestBody User u)
	{      User user = userService.saveUserData(u);
		Log.debug(u.toString());
		return new ResponseEntity<User> (user,HttpStatus.CREATED);
	}
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUserData(@PathVariable int id)
	{
		User us = userService.getUserData(id);
		return new ResponseEntity<User>(us,HttpStatus.OK);
	}
	

}
