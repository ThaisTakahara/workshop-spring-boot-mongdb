package com.thaistakahara.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thaistakahara.workshopmongo.domain.User;
import com.thaistakahara.workshopmongo.dto.UserDTO;
import com.thaistakahara.workshopmongo.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserServices service; 
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {		
		List<User> lista = service.findAll();
		List<UserDTO> listaDTO = lista.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());				
		return ResponseEntity.ok().body(listaDTO);		
	};
	

}
