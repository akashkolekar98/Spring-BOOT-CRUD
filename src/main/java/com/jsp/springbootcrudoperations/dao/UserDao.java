package com.jsp.springbootcrudoperations.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrudoperations.dto.User;
import com.jsp.springbootcrudoperations.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public User getUserById(int id) {
		Optional<User> user = repository.findById(id);
		if (user != null) {
			return user.get();
		} else {
			return null;
		}
	}

	public List<User> getAllUser() {
		return repository.findAll();
	}

	public boolean deleteUserById(int id) {
		Optional<User> user = repository.findById(id);
		if (user != null) {
			repository.delete(user.get());
			return true;
		} else {
			return false;
		}
	}

	public User updateUser(int id, User user) {
		Optional<User> opt = repository.findById(id);
		if (opt.isPresent()) {
			return repository.save(user);
		} else {
			return null;
		}
	}
}
