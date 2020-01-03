package com.demo.microservices.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservices.entity.Address;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressRepo repo;
	
	@GetMapping("/{aid}")
	public Address getAddress(@PathVariable("aid") int aid){
		
		return repo.findById(aid).get() ;
		
	}
}
