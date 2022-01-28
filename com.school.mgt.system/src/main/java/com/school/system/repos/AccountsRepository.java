package com.school.system.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.system.entities.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {
	
	/*
	 * @Query(value="select * from accounts where student_id = student_id",
	 * nativeQuery=true ) List<Accounts> findAllByStudentId(Integer student_id);
	 */
	List<Accounts> findAllById(Integer id);

	//List<Accounts> findAllById(Integer id);

	//List<Accounts> findAllById(Integer student_id);
	

}
