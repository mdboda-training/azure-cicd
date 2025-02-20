package com.mdsolutions.azure.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("Hello this is Azure CICD Learning welcome page", HttpStatus.OK);
	}
	
}
