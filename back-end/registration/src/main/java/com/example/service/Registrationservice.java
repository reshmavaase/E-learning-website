package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.Registrationsrepository;

@Service
public class Registrationservice {
	@Autowired
	private Registrationsrepository repo;
	public User saveUser(User user) {
		return repo.save(user);
	}
	public User fetchemail(String email) {
		return repo.findByEmail(email);
	}
	public  User fetchuseremailandpassword(String email,String password) {
		return repo.findByEmailAndPassword(email, password);
	}
	
}