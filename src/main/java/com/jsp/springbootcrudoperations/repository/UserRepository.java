package com.jsp.springbootcrudoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrudoperations.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
