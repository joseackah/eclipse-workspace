package com.school.system.front.end.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.school.system.front.end.integration.AccountsRestClient;
import com.school.system.front.end.integration.dto.Accounts;


@Component
public class AccountsRestClientImpl implements AccountsRestClient {
	
	RestTemplate rest = new RestTemplate();
	
	Accounts account = new Accounts();

	@Override
	public void saveAccount(Accounts accounts) {
		//account.setAccount_id(accounts.getAccount_id());
		account.setId(accounts.getId());
		account.setFirst_name(accounts.getFirst_name());
		account.setLast_name(accounts.getLast_name());
		account.setAmount_due(accounts.getAmount_due());
		account.setAmount_paid(accounts.getAmount_paid());
		account.setBalance(accounts.getBalance());
		//account.setDate_paid(accounts.getDate_paid());
		rest.postForObject("http://localhost:9095/accounts/saveAccounts", accounts, Accounts.class);

	}

	@Override
	public void updateAccount(Accounts accounts) {
		Map<String, Integer> updateAccount = new HashMap<String, Integer>();
		updateAccount.put("id", accounts.getAccount_id());
		rest.put("http://localhost:9095/accounts/updateAccounts", accounts, updateAccount);

	}

	@Override
	public void deleteAccount(Integer id) {
		rest.delete("http://localhost:9095/accounts/deleteAccounts/"+id);

	}

	@Override
	public void deleteAll(Accounts accounts) {
		// TODO Auto-generated method stub

	}

	@Override
	public Accounts[] getAllAccounts(Accounts accounts) {

		Accounts[] account = rest.getForObject("http://localhost:9095/accounts/allAccounts", Accounts[].class);
		return account;
	}

	@Override
	public Accounts find(Integer id) {
		Accounts account = rest.getForObject("http://localhost:9095/accounts/findById/"+id, Accounts.class);
		return account;
	}

	@Override
	public String lookLastId(String id) {
		
		return null;
	}

	@Override
	public Accounts findLastId(Accounts accounts) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countMale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countFemale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear1Male() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear1Female() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear2Male() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear2Female() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear3Male() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countYear3Female() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Accounts[] findAllById(Integer id) {
		Accounts[] accountss = rest.getForObject("http://localhost:9095/accounts/details/"+id, Accounts[].class);
		return accountss;
	}

}
