package com.aiti.spring.data.customerAddress.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.aiti.spring.data.customerAddress.dal.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
