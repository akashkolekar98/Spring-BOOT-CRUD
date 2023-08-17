package com.jsp.springbootcrudoperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrudoperations.dao.UserDao;
import com.jsp.springbootcrudoperations.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	public List<User> getAllUser() {
		return userDao.getAllUser();
	}
	
	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}
	
	public User updateUser(int id, User user) {
		User u = userDao.getUserById(id);
		u.setName(user.getName());
		u.setGmail(user.getGmail());
		if(u!=null) {
			return userDao.updateUser(id, u);
		}
	else {
			return null;
		}
		
	}
}
