package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping(value = "/getService2", method = RequestMethod.GET)
	public String getStudents() {
		System.out.println("SpringCloud-EurekaClient-Service2 ServiceController Called");

		return "Response From SpringCloud-EurekaClient-Service2";
	}
}