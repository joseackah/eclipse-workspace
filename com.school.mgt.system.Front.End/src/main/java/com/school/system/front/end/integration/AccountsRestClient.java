package com.school.system.front.end.integration;

import com.school.system.front.end.integration.dto.Accounts;

public interface AccountsRestClient {
	
	public void saveAccount(Accounts accounts);
	public void updateAccount( Accounts accounts);
	public void deleteAccount(Integer id);
	public void deleteAll( Accounts accounts);
	public Accounts [] getAllAccounts( Accounts accounts);
	public Accounts  find(Integer id);
	public String lookLastId(String id);
	public Accounts  findLastId( Accounts accounts);
	
	public String count();
	public String countMale();
	public String countFemale();
	
/* year 1 counting methods */
	
	
	public String countYear1();
	
	
	public String countYear1Male();
	
	
	public String countYear1Female();
	
	
	
	/* year 2 counting methods */
	
	
	public String countYear2();
	
	
	public String countYear2Male();
	
	
	public String countYear2Female();
	
	
	
	/* year 3 counting methods */
	
	
	public String countYear3();
	
	
	public String countYear3Male();
	
	
	public String countYear3Female();
	
	public Accounts[] findAllById(Integer id);

	

}
