package com.aiti.spring.data.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.aiti.spring.data.dal.entities.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
