package com.ust.capstone.event.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.event.model.Event;
import com.ust.capstone.event.repository.EventRepo;
@CrossOrigin
@RestController
@RequestMapping("/api/events")
public class EventController {
	@Autowired
	EventRepo repo;

    private List<Event> events = new ArrayList<>();
    @CrossOrigin()
    @PostMapping("/assign")
    public ResponseEntity<Event> assignTask(@RequestBody Event event) {
        Event savedEvent = repo.save(event);
        return new ResponseEntity<>(savedEvent, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/view")
    public ResponseEntity<List<Event>> viewTasks() {
        List<Event> events = repo.findAll();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>updateTask(@PathVariable long id,@RequestBody Event event){
		return ResponseEntity.ok().body(repo.save(event));
    	
    }
    @DeleteMapping("/delete/{id}")
      public void deleteEvent(@PathVariable long id) {
    	  repo.deleteById(id);
    	
    }

}