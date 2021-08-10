package com.school.system.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.system.entities.StudentsStudentTest;

public interface StudentsStudentTestRepository extends JpaRepository<StudentsStudentTest, String> {

	@Query(value = "SELECT student_id, first_name, last_name, sex, age, class FROM error_testing ORDER BY student_id DESC LIMIT 1;", nativeQuery = true)
	StudentsStudentTest findLastId(StudentsStudentTest studentTest);
	
	@Query(value = "SELECT student_id FROM error_testing ORDER BY student_id DESC LIMIT 1;", nativeQuery = true)
	String lookLastId(String student_id);
	
	@Query(value = "SELECT * FROM error_testing where student_id LIKE '%%' OR first_name LIKE '%ao%' OR last_name LIKE '%?1%'", nativeQuery = true)
	List<StudentsStudentTest> search(String name);

}
