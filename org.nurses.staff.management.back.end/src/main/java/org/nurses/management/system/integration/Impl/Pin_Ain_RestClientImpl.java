package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nurses.management.system.integration.Pin_Ain_RestClient;
import org.nurses.management.system.integration.dto.Pin_Ain;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Pin_Ain_RestClientImpl implements Pin_Ain_RestClient {
	
	Pin_Ain pin = new Pin_Ain();
	RestTemplate rest = new RestTemplate();
	
	

	@Override
	public void savePinAin(Pin_Ain pin_Ain) {
		pin.setId(pin_Ain.getId());
		pin.setStaff_id(pin_Ain.getStaff_id());
		pin.setPin_ain_number(pin_Ain.getPin_ain_number());
		pin.setType(pin_Ain.getType());
		pin.setDate_issue(pin_Ain.getDate_issue());
		pin.setExpire_date(pin_Ain.getExpire_date());
		pin.setRenewal_date(pin_Ain.getRenewal_date());
		rest.postForObject("http://localhost:8084/pin_ain/savePin", pin_Ain, Pin_Ain.class);

	}

	@Override
	public void updatePinAin(Pin_Ain pin_Ain) {
		Map<String, Integer> pinAinUpdate = new HashMap<String, Integer>();
		pinAinUpdate.put("id", pin_Ain.getId());
		rest.put("http://localhost:8084/pin_ain/updatePin", pin_Ain, pinAinUpdate);

	}

	@Override
	public void deletePinAin(Integer id) {
		rest.delete("http://localhost:8084/pin_ain/deletePin/"+id);

	}

	@Override
	public void deleteAllPinAin(Pin_Ain pin_Ain) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pin_Ain[] getAllPinAin(Pin_Ain pin_Ain) {
		Pin_Ain[] pins= rest.getForObject("http://localhost:8084/pin_ain/getAllPin/", Pin_Ain[].class);
		return pins;
	}

	@Override
	public Pin_Ain find(Integer id) {
		Pin_Ain findPin = rest.getForObject("http://localhost:8084/pin_ain/getPinById/" + id, Pin_Ain.class);
		return findPin;
	}

	@Override
	public List<Pin_Ain> saveAll(List<Pin_Ain> pin) {
		
		//rest.postForObject("http://localhost:8084/pin_ain/saveMorePin", pin, Pin_Ain[].class);

		return (List<Pin_Ain>)rest.postForObject("http://localhost:8084/pin_ain/saveMorePin", pin, Pin_Ain.class);
	}
	
	
	
	

	/*
	 * @Override public List<Pin_Ain> saveAll(List<Pin_Ain> pin) { // TODO
	 * Auto-generated method stub return null; }
	 */

	

}
