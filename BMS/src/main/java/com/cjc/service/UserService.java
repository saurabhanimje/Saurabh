package com.cjc.service;

import com.cjc.model.User;

public interface UserService {

	public User saveUserData(User u);

	public User getUserData(int id);

}
