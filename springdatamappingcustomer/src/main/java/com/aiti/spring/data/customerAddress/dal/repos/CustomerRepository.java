package com.aiti.spring.data.customerAddress.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.aiti.spring.data.customerAddress.dal.entities.CustomerDetails;

public interface CustomerRepository extends CrudRepository<CustomerDetails, Integer> {

}
