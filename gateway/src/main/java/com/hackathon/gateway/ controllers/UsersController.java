package com.hackathon.gateway.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "*")
public class UsersController {

	@GetMapping("/users/statistics")
	public ResponseEntity<String> getStatistics() {
        return new ResponseEntity<>("Yo mark", HttpStatus.OK);
	}

}