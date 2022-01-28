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
	
	@Query(value = "select count(*) from students;", nativeQuery = true)
	public String countStudent();
	
	@Query(value = "select count(*) from students where sex='male';", nativeQuery = true)
	public String countStudentMale();
	
	@Query(value = "select count(*) from students where sex='female';", nativeQuery = true)
	public String countStudentFemale();
	
	public String findByLastName(String name);
	
	
	/* year 1 counting methods */
	
	@Query(value = "select count(*) from students where class='year 1';", nativeQuery = true)
	public String countYear1();
	
	@Query(value = "select count(*) from students where sex='male' and class='year 1';", nativeQuery = true)
	public String countYear1Male();
	
	@Query(value = "select count(*) from students where sex='female' and class='year 1';", nativeQuery = true)
	public String countYear1Female();
	
	
	
	/* year 2 counting methods */
	
	@Query(value = "select count(*) from students where class='year 2';", nativeQuery = true)
	public String countYear2();
	
	@Query(value = "select count(*) from students where sex='male' and class='year 2';", nativeQuery = true)
	public String countYear2Male();
	
	@Query(value = "select count(*) from students where sex='female' and class='year 2';", nativeQuery = true)
	public String countYear2Female();
	
	
	
	/* year 3 counting methods */
	
	@Query(value = "select count(*) from students where class='year 3';", nativeQuery = true)
	public String countYear3();
	
	@Query(value = "select count(*) from students where sex='male' and class='year 3';", nativeQuery = true)
	public String countYear3Male();
	
	@Query(value = "select count(*) from students where sex='female' and class='year 3';", nativeQuery = true)
	public String countYear3Female();
	
	
	

}
