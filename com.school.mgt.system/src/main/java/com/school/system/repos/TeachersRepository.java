package com.school.system.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.system.entities.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Integer> {

}
