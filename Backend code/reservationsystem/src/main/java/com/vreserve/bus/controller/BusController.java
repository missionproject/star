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
import com.vreserve.bus.model.User;
import com.vreserve.bus.repo.BusRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vreserve.bus.exception.ResourceNotFoundException;
import com.vreserve.bus.model.Bus;

import com.vreserve.bus.repo.BusRepository;

@RestController
@RequestMapping("/api/v2")

public class BusController {
	@Autowired
	private BusRepository busRepository;

	@GetMapping("/bus")
	public List<Bus> getAllBus() {
		return busRepository.findAll();
	}

	@GetMapping("/bus/{busId}")
	public ResponseEntity<Bus> getBusById(@PathVariable(value = "busId") Long busId) throws ResourceNotFoundException {
		Bus bus = busRepository.findById(busId)
				.orElseThrow(() -> new ResourceNotFoundException("Bus not found on :: " + busId));
		return ResponseEntity.ok().body(bus);
	}

	/*
	 * import java.util.Date; import java.util.HashMap; import java.util.List;
	 * import java.util.Map;
	 * 
	 * import javax.validation.Valid;
	 * 
	 * import org.springframework.beans.factory.annotation.Autowired; import
	 * org.springframework.http.ResponseEntity; import
	 * org.springframework.web.bind.annotation.DeleteMapping; import
	 * org.springframework.web.bind.annotation.GetMapping; import
	 * org.springframework.web.bind.annotation.PathVariable; import
	 * org.springframework.web.bind.annotation.PostMapping; import
	 * org.springframework.web.bind.annotation.PutMapping; import
	 * org.springframework.web.bind.annotation.RequestBody; import
	 * org.springframework.web.bind.annotation.RequestMapping; import
	 * org.springframework.web.bind.annotation.RestController;
	 * 
	 * import com.vreserve.bus.exception.ResourceNotFoundException; import
	 * com.vreserve.bus.model.User; import com.vreserve.bus.repo.UserRepository;
	 * 
	 * 
	 * @PutMapping("/bus/{id}") public ResponseEntity<Bus> updateBus(
	 * 
	 * @PathVariable(value = "id") Long busId, @Valid @RequestBody Bus busDetail)
	 * throws ResourceNotFoundException {
	 * 
	 * Bus bus = busRepository .findById(busId) .orElseThrow(() -> new
	 * ResourceNotFoundException("Bus not found on :: " + busId));
	 * 
	 * bus.setbusName(busDetail.getbusName());
	 * bus.setbusType(busDetail.getbusType());
	 * bus.setpassengerNumber(busDetail.getpassengerNumber());
	 * bus.settotalSeat(busDetail.gettotalSeat()); final Bus updatedBusr =
	 * busRepository.save(bus); return ResponseEntity.ok(updatedBus); }
	 * 
	 * 
	 * 
	 * 
	 * @DeleteMapping("/bus/{id}") public Map<String, Boolean>
	 * deleteBus(@PathVariable(value = "id") Long busId) throws Exception { Bus bus
	 * = busRepository .findById(busId) .orElseThrow(() -> new
	 * ResourceNotFoundException("Bus not found on :: " + busId));
	 * 
	 * busRepository.delete(bus); Map<String, Boolean> response = new HashMap<>();
	 * response.put("deleted", Boolean.TRUE); return response; }
	 */

}
