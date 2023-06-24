package com.ust.capstone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.capstone.repository.userRepository;
import com.ust.capstone.user.model.User;

@Service
public class UserService {
	@Autowired
	userRepository repo;

	public Object create(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public User getUser(Long id) {
		Optional <User> opl=repo.findById(id);
		if(opl.isPresent()) {
			return opl.get();
		}else
			return null;
		
	}

	

	public void deleteEntry(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	public Object update(long id, User user) {
		Optional<User> op=repo.findById(id);
		if(op.isPresent()) {
			op.get();
			return repo.save(user);
		
		}
		return null;
	}
		
	

	public java.util.List<User> getUsers() {
	
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	

}
