package com.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.main.User;
import com.registration.repository.RegistartionRepository;


@Service
public class RegistartionService {
	
	
	@Autowired
	private RegistartionRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
		
	}
	
	public User fetchUserByEmailId(String email) {
		
		return repo.findByEmailId(email);
		
	}
	
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		
		return repo.findByEmailIdAndPassword(email,password);
	}

}
