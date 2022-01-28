package com.school.system.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.system.entities.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Integer> {
	
	
	@Query(value = "select count(*) from teachers;", nativeQuery = true)
	public String countTeachers();
	
	@Query(value = "select count(*) from teachers where gender='male';", nativeQuery = true)
	public String countTeacherMale();
	
	@Query(value = "select count(*) from teachers where gender='female';", nativeQuery = true)
	public String countTeacherFemale();
	

}
