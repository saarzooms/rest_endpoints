package com.allysoftsolutions.rest_endpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestEndpointsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestEndpointsApplication.class, args);
		System.out.println("project started");
		Test t = context.getBean(Test.class);
		Person p = context.getBean(Person.class);
		t.setP(p);
		System.out.println(t.displayInfo());
	}

	@RequestMapping(value = "/")
	public String displyMessage() {
		return "Welcome to my page";
	}

}
