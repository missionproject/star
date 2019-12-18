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
import com.vreserve.bus.model.AvailableTicket;
import com.vreserve.bus.repo.AvailableTicketRepository;



@RestController
@RequestMapping("/api/at")
public class AvailableTicketController {

  @Autowired
  private AvailableTicketRepository availableticketrepo;

  /**
   * Get all availableticket list.
   *
   * @return the list
   */
  @GetMapping("/availableticket")
  public List<AvailableTicket> getAllAvailableTicket() {
    return availableticketrepo.findAll();
  }

}