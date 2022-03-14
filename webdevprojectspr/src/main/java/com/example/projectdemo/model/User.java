package com.example.projectdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   /*to connect to dbtable*/
@Table(name="mytablee")
public class User {
	
	@Id   /*to tell below id as primary key*/
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private int age;
	private String password;
	
	public User() {    	/*created default constructor*/
		
	}

	/*created parameterized constructor*/
	public User(int id, String firstname, String lastname, String username, int age, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.age = age;
		this.password = password;
	}

		/*getters and setters*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
	
	


	
	
}
