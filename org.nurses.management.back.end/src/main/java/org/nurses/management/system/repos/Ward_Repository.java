package org.nurses.management.system.repos;

import org.nurses.management.system.entity.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Ward_Repository extends JpaRepository<Ward, Integer> {
	
@Query(value="select sum(bed_capacity) from ward;", nativeQuery=true)
public String bedCapacity();

 
 

}
