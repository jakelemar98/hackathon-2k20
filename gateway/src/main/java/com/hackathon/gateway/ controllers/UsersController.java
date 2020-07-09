package com.hackathon.gateway.controllers;
import com.google.protobuf.util.*;

import org.springframework.http.ResponseEntity;

import com.hackathon.gateway.grpc.users.UsersClient;
import com.grpc.services.users.UserResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.util.StringUtils;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "*")
public class UsersController {

	UsersClient uc = new UsersClient();


	@GetMapping("/users/statistics")
	public ResponseEntity<String> getStatistics() {
		UserResponse messageResponse = uc.userData();
		String jsonString = serializeReturn(messageResponse);
        return new ResponseEntity<>(jsonString, HttpStatus.OK);
	}

	private String serializeReturn(UserResponse req) {
        String res = "";
        try {
            res = JsonFormat.printer().print(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}