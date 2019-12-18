package com.vreserve.bus.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vreserve.bus.model.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
