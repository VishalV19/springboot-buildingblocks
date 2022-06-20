package com.springboot.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//Simple Method
	//URI - /helloworld
	//Get
	
//	@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	
	@GetMapping("/helloworld1")
	public String helloworld() {
		return "Hello World1";
	}
	
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Vishal", "Singh", "Lucknow");
	}
}
