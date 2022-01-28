package com.school.system.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.system.entities.UsersTable;



public interface UsersTableRepository extends JpaRepository<UsersTable, Integer> {
	
	

}
