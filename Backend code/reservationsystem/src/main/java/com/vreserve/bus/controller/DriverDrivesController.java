package com.vreserve.bus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vreserve.bus.model.DriverDrives;
import com.vreserve.bus.repo.DriverDrivesRepository;

@RestController
@RequestMapping("/api/driverdrives")
public class DriverDrivesController {


	@Autowired
	private DriverDrivesRepository driverdrivesRepository;

	/**
	 * Get all driver list.
	 *
	 * @return the list
	 */
	@GetMapping("/dd")
	public List<DriverDrives> getAllDriverDrives() {
		return driverdrivesRepository.findAll();
	}
}
