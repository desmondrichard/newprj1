package com.example.projectdemo.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.projectdemo.Service.UserService;
import com.example.projectdemo.model.User;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/save-user")
	@Transactional
	@CrossOrigin
	public String registerUser(@RequestBody User user) {
		service.saveMyUser(user);
		return "Hello, "+user.getFirstname()+" Your Registration is sucessfull";
		
	}
	@GetMapping("/all-users")
	@CrossOrigin
	public Iterable<User> showAllUsers(){
		return service.showAllUsers();  
	}
	
	/*we call Controller method for delete*/
	@GetMapping("/delete/{username}")  /*to delete by username*/
	@Transactional
	@CrossOrigin
	public Iterable<User> deleteUser(@PathVariable String username){
		return service.deleteUserByUsername(username);
	}
	
	@GetMapping("/search/{username}") /*we call controller method for search by username*/
	@CrossOrigin
	public User searchUser(@PathVariable String username) {
		return service.findByUsername(username);
	}
}
