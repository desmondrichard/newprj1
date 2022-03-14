package com.example.projectdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projectdemo.model.User;
import com.example.projectdemo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public UserService() {
	
	}
	
	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyUser(User user) {  /*to save*/
	 repo.save(user);	
	}

	public Iterable<User> showAllUsers(){   /*Created iteratable list to view all*/
		return repo.findAll();
	}
	public Iterable<User> deleteUserByUsername(String username){
		repo.deleteByUsername(username);
		return repo.findAll();
	}
	
	public User findByUsername(String username) {
		return repo.findByUsername(username);
	}
	
}
