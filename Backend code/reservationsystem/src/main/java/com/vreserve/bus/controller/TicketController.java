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



import com.vreserve.bus.model.Ticket;

import com.vreserve.bus.repo.TicketRepository;

@RestController
@RequestMapping("/api/v4")


public class TicketController {
	@Autowired
	  private TicketRepository ticketrepository;
	
	@GetMapping("/ticket")
	  public List<Ticket> getAllTicket() {
	    return ticketrepository.findAll();
	  }
	
	@GetMapping("/ticket/{ticketid}")
	  public ResponseEntity<Ticket> getTicketById(@PathVariable(value = "ticketid") Long ticketid)
	      throws ResourceNotFoundException {
	    Ticket ticket =
	        ticketrepository
	            .findById(ticketid)
	            .orElseThrow(() -> new ResourceNotFoundException("ticket not found on :: " + ticketid));
	    return ResponseEntity.ok().body(ticket);
	  }

}
