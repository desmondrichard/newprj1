package com.example.projectdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.projectdemo.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	public Iterable<User> deleteByUsername(String username);
	public User findByUsername(String username); /*call this method from userservice class */
	
}
