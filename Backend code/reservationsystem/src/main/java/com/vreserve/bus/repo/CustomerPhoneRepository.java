package com.vreserve.bus.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vreserve.bus.model.CustomerPhone;
@Repository
public interface CustomerPhoneRepository extends JpaRepository<CustomerPhone, Long>{

}
