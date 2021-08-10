package com.aiti.spring.data.customer.address.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.aiti.spring.data.customer.address.dal.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
