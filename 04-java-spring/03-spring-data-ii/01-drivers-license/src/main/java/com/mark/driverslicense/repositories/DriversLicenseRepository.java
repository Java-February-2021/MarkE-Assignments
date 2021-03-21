package com.mark.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mark.driverslicense.models.Driver;
import com.mark.driverslicense.models.License;

@Repository
public interface DriversLicenseRepository extends CrudRepository<Driver, Long> {
	List<Driver> findAll();

	License save(License newLicense);
}