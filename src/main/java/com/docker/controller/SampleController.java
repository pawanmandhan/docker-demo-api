package com.docker.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/hello")
public class SampleController {

	
	@GetMapping
	public String getAll() {
		return "Hello Pawan !!!";
	}

}

