package com.ust.capstone.event.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import com.ust.capstone.user.model.User;

import com.ust.capstone.event.model.User;

@FeignClient(value = "user-service", url = "http://localhost:9098/user") // Replace "${user-service-url}" with the actual URL of the user microservice
public interface UserClient {

//	    @GetMapping("/fetch/{id}")
//	    User getUserById(@PathVariable("userId") String userId);
	    @RequestMapping(method= RequestMethod.GET, value= "/fetch/{id}", produces="application/json") 
		  public User getUserById(@PathVariable ("id") int id);
		  
	}

