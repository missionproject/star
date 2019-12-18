package com.vreserve.bus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vreserve.bus.model.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {}
