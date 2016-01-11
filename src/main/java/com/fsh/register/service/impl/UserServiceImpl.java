package com.fsh.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsh.register.dao.UserDao;
import com.fsh.register.model.User;
import com.fsh.register.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao ;
	
	@Override
	public User getUserById(int userId) {
		 return this.userDao.selectByPrimaryKey(userId);  
	}
	
	@Override
	public int updateUser(User user) {
		return userDao.updateByPrimaryKey(user);
	}
	
	

}
