package com.ust.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.capstone.user.model.User;

public interface userRepository extends JpaRepository<User,Long> {

}
