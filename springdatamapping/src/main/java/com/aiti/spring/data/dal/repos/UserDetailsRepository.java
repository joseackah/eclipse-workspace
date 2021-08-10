package com.aiti.spring.data.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.aiti.spring.data.dal.entities.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {

}
