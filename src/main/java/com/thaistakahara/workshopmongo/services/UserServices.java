package com.thaistakahara.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistakahara.workshopmongo.domain.User;
import com.thaistakahara.workshopmongo.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
	
}
