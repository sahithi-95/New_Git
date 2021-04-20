package com.ibm.boothello.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.boothello.repo.LoginRepository;
import com.ibm.boothhello.bean.Login;

@RestController

public class LoginController {
	
	@Autowired
	private LoginRepository repo;
	
	
	@PostMapping(value="/add",consumes="application/json")
	public String addUser(@RequestBody Login login) {
		repo.adduser(login);
		return "user added";
		
	}
	
	@GetMapping(value="/users",produces="application/json")
	public Collection<Login> getUsers(){
		return repo.getAllusers();
		
	}

	@GetMapping(value="/user/{id}",produces="application/json")
	public Login getUser(@PathVariable("id") String userid) {
		return repo.getuser(userid);
		
	}
}
