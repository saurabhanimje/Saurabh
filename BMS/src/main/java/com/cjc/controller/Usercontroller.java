package com.cjc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;



@RestController
public class Usercontroller 
{
	private static final Logger Log=LoggerFactory.getLogger(User.class);
	
	@PostMapping("/post")
	public ResponseEntity<User> oncreateuserdata(@RequestBody User u)
	{
		Log.debug(u.toString());
		return new ResponseEntity<User> (u,HttpStatus.CREATED);
	}

}
