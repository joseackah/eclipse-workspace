package com.school.system.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.school.system.entities.Parents;

public interface ParentsRepository extends JpaRepository<Parents, Integer> {
	
	@Query(value = "SELECT parent_id, first_name, last_name, occupation, contact, residence_number FROM parents ORDER BY parent_id DESC LIMIT 1;", nativeQuery = true)
	Parents findLastId(Parents students);

}
