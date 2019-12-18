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
import com.vreserve.bus.model.Customer;
import com.vreserve.bus.repo.CustomerRepository;

@RestController
@RequestMapping("/api/customerdetails")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * Get all customer list.
	 *
	 * @return the list
	 */
	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	/**
	 * Gets users by id.
	 *
	 * @param userId the user id
	 * @return the users by id
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@GetMapping("/customer/{customer_id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable(value = "customer_id") Integer customerId)
			throws ResourceNotFoundException {
		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(() -> new ResourceNotFoundException("Customer not found on :: " + customerId));
		return ResponseEntity.ok().body(customer);
	}

	/**
	 * Create user user.
	 *
	 * @param user the user
	 * @return the user
	 */
	/*
	 * @PostMapping("/customers") public Customer createCustomer(@Valid @RequestBody
	 * Customer customer) { return customerRepository.save(customer); }
	 * 
	 *//**
		 * Update user response entity.
		 *
		 * @param userId      the user id
		 * @param userDetails the user details
		 * @return the response entity
		 * @throws ResourceNotFoundException the resource not found exception
		 */
	/*
	 * @PutMapping("/customer/{id}") public ResponseEntity<Customer> updateCustomer(
	 * 
	 * @PathVariable(value = "id") Integer customerId, @Valid @RequestBody Customer
	 * customerDetails) throws ResourceNotFoundException {
	 * 
	 * Customer customer = customerRepository .findById(customerId) .orElseThrow(()
	 * -> new ResourceNotFoundException("Customer not found on :: " + customerId));
	 * 
	 * 
	 * customer.setFirstname(customerDetails.getFirstname()); final Customer
	 * updatedCustomer = customerRepository.save(customer); return
	 * ResponseEntity.ok(updatedCustomer); }
	 * 
	 *//**
		 * Delete user map.
		 *
		 * @param userId the user id
		 * @return the map
		 * @throws Exception the exception
		 *//*
			 * @DeleteMapping("/customer/{id}") public Map<String, Boolean>
			 * deleteCustomer(@PathVariable(value = "id") Integer customerId) throws
			 * Exception { Customer customer = customerRepository .findById(customerId)
			 * .orElseThrow(() -> new ResourceNotFoundException("Customer not found on :: "
			 * + customerId));
			 * 
			 * customerRepository.delete(customer); Map<String, Boolean> response = new
			 * HashMap<>(); response.put("deleted", Boolean.TRUE); return response; }
			 */
}
