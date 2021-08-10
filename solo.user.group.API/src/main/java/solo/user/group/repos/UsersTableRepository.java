package solo.user.group.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import solo.user.group.users.UsersTable;

public interface UsersTableRepository extends JpaRepository<UsersTable, Integer> {
	
	

}
