package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.User;
import com.cjc.repo.UserRepository;
import com.cjc.service.UserService;
@Service
public class UserServiceImpl implements UserService
{
@Autowired private UserRepository ur;
	@Override
	public User saveUserData(User u) {
		
		return ur.save(u);
	}
	@Override
	public User getUserData(int id) {
		
		return ur.findById(id).get();
	}

}
