package com.demo.microservices.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.microservices.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
