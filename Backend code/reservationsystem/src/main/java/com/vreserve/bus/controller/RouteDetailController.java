package com.vreserve.bus.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vreserve.bus.exception.ResourceNotFoundException;
import com.vreserve.bus.model.RouteDetail;
import com.vreserve.bus.repo.RouteDetailRepository;
import com.vreserve.bus.repo.UserRepository;

@RestController
@CrossOrigin(origins="*") 
@RequestMapping("/api/rd")

public class RouteDetailController {

	@Autowired
	private RouteDetailRepository routeDetailRepository;


	@GetMapping("/rod")
	public List<RouteDetail> getAllRouteDetail() {
		return routeDetailRepository.findAll();
	}
	/*
	 * @Bean public WebMvcConfigurer congigure() { return new WebMvcConfigurer() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/*").allowedOrigins("http://localhost:9090"); } }; }
	 */

	/**
	 * Gets users by id.
	 *
	 * @param userId the user id
	 * @return the users by id
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	/*
	 * @GetMapping("/routedetail/{routeid}") public ResponseEntity<User>
	 * getUsersById(@PathVariable(value = "routeid") Long userId) throws
	 * ResourceNotFoundException { User user =
	 * routeDetailRepository.findById(userId) .orElseThrow(() -> new
	 * ResourceNotFoundException("User not found on :: " + userId)); return
	 * ResponseEntity.ok().body(user); }
	 */

	/**
	 * Create user user.
	 *
	 * @param user the user
	 * @return the user
	 */
	/*
	 * @PostMapping("/users") public User createUser(@Valid @RequestBody User user)
	 * { return routeDetailRepository.save(user); }
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
	 * @PutMapping("/users/{id}") public ResponseEntity<User> updateUser(
	 * 
	 * @PathVariable(value = "id") Long userId, @Valid @RequestBody User
	 * userDetails) throws ResourceNotFoundException {
	 * 
	 * User user = routeDetailRepository .findById(userId) .orElseThrow(() -> new
	 * ResourceNotFoundException("User not found on :: " + userId));
	 * 
	 * user.setEmail(userDetails.getEmail());
	 * user.setLastName(userDetails.getLastName());
	 * user.setFirstName(userDetails.getFirstName()); user.setUpdatedAt(new Date());
	 * final User updatedUser = routeDetailRepository.save(user); return
	 * ResponseEntity.ok(updatedUser); }
	 * 
	 *//**
		 * Delete user map.
		 *
		 * @param userId the user id
		 * @return the map
		 * @throws Exception the exception
		 *//*
			 * @DeleteMapping("/user/{id}") public Map<String, Boolean>
			 * deleteUser(@PathVariable(value = "id") Long userId) throws Exception { User
			 * user = routeDetailRepository .findById(userId) .orElseThrow(() -> new
			 * ResourceNotFoundException("User not found on :: " + userId));
			 * 
			 * routeDetailRepository.delete(user); Map<String, Boolean> response = new
			 * HashMap<>(); response.put("deleted", Boolean.TRUE); return response; }
			 */
}
