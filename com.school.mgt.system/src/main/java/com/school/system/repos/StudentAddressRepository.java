package com.school.system.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.system.entities.StudentAddress;

public interface StudentAddressRepository extends JpaRepository<StudentAddress, Integer> {

}
