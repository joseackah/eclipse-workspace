package com.school.system.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.system.entities.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

	@Query(value = "SELECT student_id, first_name, last_name, sex, age, class FROM students ORDER BY student_id DESC LIMIT 1;", nativeQuery = true)
	Students findLastId(Students students);
	
	@Query(value = "SELECT student_id FROM students ORDER BY student_id DESC LIMIT 1;", nativeQuery = true)
	String lookLastId(String student_id);
	
	@Query(value = "SELECT * FROM students where student_id LIKE '%%' OR first_name LIKE '%ao%' OR last_name LIKE '%?1%'", nativeQuery = true)
	List<Students> search(String name);

}