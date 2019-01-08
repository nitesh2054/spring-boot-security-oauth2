package com.nitesh.practise.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@PreAuthorize("hasAuthority('God')")
	@GetMapping
	public String test() {
		return "test";
	}
}
