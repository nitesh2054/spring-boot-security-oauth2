package com.nitesh.practise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nitesh.practise.user.model.User;
import com.nitesh.practise.user.service.UserService;

@SpringBootApplication
public class SpringBootSecurityOauth2Application implements CommandLineRunner {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityOauth2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		if(this.userService.findByUserName("ram")== null) {
			
			User user = new User();
			user.setName("Sushant");
			user.setUsername("ram");
			user.setPassword(passwordEncoder.encode("hari"));
			user.setAuthorities(Arrays.asList("God"));
			
			this.userService.save(user);
			
		}
		
	}

}

