package com.vreserve.bus.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vreserve.bus.model.DriverPhone;

@Repository
public interface DriverPhoneRepository extends JpaRepository<DriverPhone, Long> {

}
