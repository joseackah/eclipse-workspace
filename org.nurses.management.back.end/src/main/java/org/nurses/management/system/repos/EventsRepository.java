package org.nurses.management.system.repos;

import java.util.List;

import org.nurses.management.system.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EventsRepository extends JpaRepository<Events, Long> {
	
	
	
	@Query(value = "select * from events", nativeQuery = true)
	public List<Events> all();

}
