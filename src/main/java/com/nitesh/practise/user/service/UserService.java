package com.nitesh.practise.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitesh.practise.user.model.User;
import com.nitesh.practise.user.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	public User save(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
		
	}

}
