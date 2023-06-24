package com.ust.capstone.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.capstone.event.model.Event;

public interface EventRepo extends JpaRepository<Event,Long> {

}
