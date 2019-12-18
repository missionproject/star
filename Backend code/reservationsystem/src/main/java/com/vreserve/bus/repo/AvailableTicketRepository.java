package com.vreserve.bus.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vreserve.bus.model.AvailableTicket;

public interface AvailableTicketRepository extends JpaRepository<AvailableTicket,Integer> {}
