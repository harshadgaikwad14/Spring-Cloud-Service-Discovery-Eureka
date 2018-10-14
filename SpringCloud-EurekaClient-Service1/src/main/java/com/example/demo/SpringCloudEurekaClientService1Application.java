package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClientService1Application {

	/*
	 * Http Url : http://localhost:8888/getService1
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientService1Application.class, args);
	}
}
