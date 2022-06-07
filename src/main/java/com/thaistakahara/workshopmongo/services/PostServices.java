package com.thaistakahara.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thaistakahara.workshopmongo.domain.Post;
import com.thaistakahara.workshopmongo.repository.PostRepository;
import com.thaistakahara.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostServices {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));		
	}	
	
}
