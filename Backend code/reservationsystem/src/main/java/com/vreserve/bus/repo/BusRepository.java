package com.vreserve.bus.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vreserve.bus.model.Bus;
@Repository
public interface BusRepository extends JpaRepository<Bus , Long> {

}
