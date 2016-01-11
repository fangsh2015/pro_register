package com.fsh.register.service;

import com.fsh.register.model.User;

public interface UserService {
	 public User getUserById(int userId);
	 
	 public int updateUser(User user) ;
}
