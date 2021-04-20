package com.ibm.boothello.repo;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ibm.boothhello.bean.Login;

@Repository
public class LoginRepository {
	
	private Map<String, Login> users;

	public LoginRepository() {
		users= new HashMap<String, Login>();
		users.put("duke", new Login("duke","java"));
		users.put("polo", new Login("polo","gems"));
	}
	
	public void adduser(Login login) {
		users.put(login.getUserid(),login);
	}
	
	public Login getuser(String userid) {
		return users.get(userid);
		
	}
	
	public Collection<Login> getAllusers(){
		return users.values();
	}
}
