package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.Newborn_tableRestClient;
import org.nurses.management.system.integration.dto.Newborn_table;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Newborn_tableRestClientImpl implements Newborn_tableRestClient {

	Newborn_table newborn = new Newborn_table();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveNewborn_table(Newborn_table newborns) {
	

		newborn.setDelivery_id(newborns.getDelivery_id());
		newborn.setBaby_name(newborns.getBaby_name());
		newborn.setSex(newborns.getSex());
		newborn.setFirst_apgar_score(newborns.getFirst_apgar_score());
		newborn.setSecond_apgar_score(newborns.getSecond_apgar_score());
		newborn.setOutcome_of_delivery(newborns.getOutcome_of_delivery());
		newborn.setNumber_of_baby(newborns.getNumber_of_baby());
		newborn.setCause_of_death(newborns.getCause_of_death());
		newborn.setResuscitation(newborns.getResuscitation());
		newborn.setCondition_of_baby(newborns.getCondition_of_baby());
		newborn.setHead_circumference(newborns.getHead_circumference());
		newborn.setFull_length(newborns.getFull_length());
		newborn.setCongenital(newborns.getCongenital());
		newborn.setType_of_abnormality(newborns.getType_of_abnormality());
		newborn.setComplication(newborns.getComplication());
		newborn.setDate_of_delivery(newborns.getDate_of_delivery());
		
		rest.postForObject("http://localhost:8084/newborn/saveNewborn", newborn, Newborn_table.class);

	}

	@Override
	public void updateNewborn_table(Newborn_table newborn) {
		Map<String, Integer> updatenewborn = new HashMap<String, Integer>();
		updatenewborn.put("id", newborn.getNewborn_id());
		rest.put("http://localhost:8084/newborn/updateNewborn", newborn, updatenewborn);

	}

	@Override
	public void deleteNewborn_table(Integer id) {
		rest.delete("http://localhost:8084/newborn/deleteNewborn/" + id);

	}

	@Override
	public void deleteAllNewborn_table(Newborn_table newborn) {
		// TODO Auto-generated method stub

	}

	@Override
	public Newborn_table[] getAllNewborn_table(Newborn_table newborn) {
		Newborn_table[] getAdmission_Discharge = rest
				.getForObject("http://localhost:8084/newborn/getAllNewborn", Newborn_table[].class);
		return getAdmission_Discharge;
	}

	@Override
	public Newborn_table findNewborn_table(Integer id) {
		Newborn_table leave = rest.getForObject("http://localhost:8084/newborn/findNewbornById/" + id,
				Newborn_table.class);
		return leave;
	}

	@Override
	public String countNewbornJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornJanuary", String.class);
	}

	@Override
	public String countNewbornFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornFebruary", String.class);
	}

	@Override
	public String countNewbornMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornMarch", String.class);
	}

	@Override
	public String countNewbornApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornApril", String.class);
	}

	@Override
	public String countNewbornMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornMay", String.class);
	}

	@Override
	public String countNewbornJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornJune", String.class);
	}

	@Override
	public String countNewbornJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornJuly", String.class);
	}

	@Override
	public String countNewbornAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornAugust", String.class);
	}

	@Override
	public String countNewbornSeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornSeptember", String.class);
	}

	@Override
	public String countNewbornOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornOctober", String.class);
	}

	@Override
	public String countNewbornNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornNovember", String.class);
	}

	@Override
	public String countNewbornDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countNewbornDecember", String.class);
	}

	@Override
	public String countTotalNumberOfBabies() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/newborn/countTotalNumberOfBabies", String.class);
	}
}
