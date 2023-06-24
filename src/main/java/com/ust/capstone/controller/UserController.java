package com.ust.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.service.UserService;
import com.ust.capstone.user.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	@PostMapping
	@RequestMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody User user){
		
		return new ResponseEntity<>(service.create(user),HttpStatus.CREATED);
		
	}
	@GetMapping("/fetch/{id}")
	public User getUser(@PathVariable Long id) {
		return service.getUser(id);
	}
	@GetMapping("/fetchAll")
	public List<User> getStudents(){
		return service.getUsers();
		
	}
		
//	@DeleteMapping("/delete/{id}")
//	public void deleteUser(@PathVariable Long id) {
//		service.deleteEntry(id);
//	}
//	@PutMapping("/update/{id}")
//	public ResponseEntity<?>updateStd(@PathVariable long id, @RequestBody User user){
//		return new ResponseEntity<>(service.update(id,user),HttpStatus.ACCEPTED);
//	}
	

}
