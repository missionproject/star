package com.vreserve.bus.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vreserve.bus.exception.ResourceNotFoundException;


import com.vreserve.bus.repo.CustomerPhoneRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vreserve.bus.exception.ResourceNotFoundException;
import com.vreserve.bus.model.Bus;
import com.vreserve.bus.model.CustomerPhone;
import com.vreserve.bus.repo.BusRepository;

@RestController
@RequestMapping("/api/v3")
public class CustomerPhoneController {
	@Autowired
	 private CustomerPhoneRepository customerphonerepository;
	
	@GetMapping("/customerphone")
	  public List<CustomerPhone> getAllCustomerPhone() {
	    return customerphonerepository.findAll();
	  }
		
	@GetMapping("/customerphone/{phoneid}")
			public ResponseEntity<CustomerPhone> getById(@PathVariable(value="phoneid")Long phoneid)
			  throws ResourceNotFoundException{
				CustomerPhone customerphone=
						customerphonerepository
			            .findById(phoneid)
			            .orElseThrow(() -> new ResourceNotFoundException("Phone number not found on :: " + phoneid));
			    return ResponseEntity.ok().body(customerphone);
			}
		
	}

