package com.mark.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mark.driverslicense.models.Driver;
import com.mark.driverslicense.models.License;
import com.mark.driverslicense.repositories.DriversLicenseRepository;
import com.mark.driverslicense.repositories.LicenseRepository;



@Service
public class DriversLicenseService {
	private DriversLicenseRepository dRepo;
	private LicenseRepository licRepo;
	
	public DriversLicenseService(DriversLicenseRepository repo, LicenseRepository lRepo) {
		this.dRepo = repo;
		this.licRepo = lRepo;
	}
	
	public Driver getOneDriver(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	public List<Driver> getAll() {
		return this.dRepo.findAll();
	}

	public Driver createDriver(Driver newDriver) {
		return this.dRepo.save(newDriver);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return licRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = licRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}