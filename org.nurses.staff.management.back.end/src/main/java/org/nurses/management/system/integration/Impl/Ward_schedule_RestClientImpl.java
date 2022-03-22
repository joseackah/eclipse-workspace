package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.Ward_schedule_RestClient;
import org.nurses.management.system.integration.dto.Ward_schedule;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Ward_schedule_RestClientImpl implements Ward_schedule_RestClient {
	
	
	Ward_schedule schedule = new Ward_schedule();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveWardSchedule(Ward_schedule wardSchedule) {
		schedule.setId(wardSchedule.getId());
		schedule.setStaff_id(wardSchedule.getStaff_id());
		schedule.setWard_name(wardSchedule.getWard_name());
		schedule.setNurse_cate(wardSchedule.getNurse_cate());
		rest.postForObject("http://localhost:8084/ward_schedule/saveSchedule", wardSchedule, Ward_schedule.class);

	}

	@Override
	public void updateWardSchedule(Ward_schedule wardSchedule) {
		Map<String, Integer> scheduleUpdate = new HashMap<String, Integer>();
		scheduleUpdate.put("id", wardSchedule.getId());
		rest.put("http://localhost:8084/ward_schedule/updateSchedule", wardSchedule, scheduleUpdate);

	}

	@Override
	public void deleteWardSchedule(Integer id) {
		rest.delete("http://localhost:8084/ward_schedule/"+id);

	}

	@Override
	public void deleteAllWardSchedule(Ward_schedule wardSchedule) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ward_schedule[] getAllWardSchedule(Ward_schedule wardSchedule) {
		Ward_schedule [] schedule = rest.getForObject("http://localhost:8084/ward_schedule/getAllSchedule", Ward_schedule[].class);
		return schedule;
	}

	@Override
	public Ward_schedule find(Integer id) {
		Ward_schedule findSchedule = rest.getForObject("http://localhost:8084/ward_schedule/findById/"+id, Ward_schedule.class);
		return findSchedule;
	}
	
	
	
	
	@Override
	public Ward_schedule[] femaleSurgical() {
		Ward_schedule[] femaleSurgicalSchedule = rest.getForObject("http://localhost:8084/ward_schedule/femaleSurgicalSchedule", Ward_schedule[].class);
 		return femaleSurgicalSchedule;
	}

	@Override
	public Ward_schedule[] femaleMedical() {
		Ward_schedule[] femaleMedicalSchedule = rest.getForObject("http://localhost:8084/ward_schedule/femaleMedicalSchedule", Ward_schedule[].class);
		return femaleMedicalSchedule;
	}

	@Override
	public Ward_schedule[] maleSurgical() {
		Ward_schedule[] maleSurgicalSchedule = rest.getForObject("http://localhost:8084/ward_schedule/maleSurgicalSchedule", Ward_schedule[].class);
		return maleSurgicalSchedule;
	}

	@Override
	public Ward_schedule[] maleMedical() {
		Ward_schedule[] maleMedicalSchedule = rest.getForObject("http://localhost:8084/ward_schedule/maleMedicalSchedule", Ward_schedule[].class);
		return maleMedicalSchedule;
	}

	@Override
	public Ward_schedule[] childrens() {
		Ward_schedule[] childrenWardSchedule = rest.getForObject("http://localhost:8084/ward_schedule/childrenWardSchedule", Ward_schedule[].class);
		return childrenWardSchedule;
	}

	@Override
	public Ward_schedule[] maternity() {
		Ward_schedule[] maternitySchedule = rest.getForObject("http://localhost:8084/ward_schedule/maternityWardSchedule", Ward_schedule[].class);
		return maternitySchedule;
	}

	@Override
	public Ward_schedule[] generalWard() {
		Ward_schedule[] generalWardSchedule = rest.getForObject("http://localhost:8084/ward_schedule/generalWardSchedule", Ward_schedule[].class);
		return generalWardSchedule;
	}

	@Override
	public Ward_schedule[] nicu() {
		Ward_schedule[] nicuSchedule = rest.getForObject("http://localhost:8084/ward_schedule/nicuSchedule", Ward_schedule[].class);
		return nicuSchedule;
	}

	@Override
	public Ward_schedule[] religious() {
		Ward_schedule[] religiousWardSchedule = rest.getForObject("http://localhost:8084/ward_schedule/religiousWardSchedule", Ward_schedule[].class);
		return religiousWardSchedule;
	}

	@Override
	public Ward_schedule[] accident() {
		Ward_schedule[] accidentSchedule = rest.getForObject("http://localhost:8084/ward_schedule/accidentEmergencySchedule", Ward_schedule[].class);
		return accidentSchedule;
	}

	@Override
	public Ward_schedule[] opd() {
		
		Ward_schedule[] opdSchedule = rest.getForObject("http://localhost:8084/ward_schedule/opdSchedule", Ward_schedule[].class);
		return opdSchedule;
	}

	@Override
	public String countNurseInMaternity() {
		
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInMaternity", String.class);
	}

	@Override
	public String countNurseInMaleMedical() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInMaleMedical", String.class);
	}

	@Override
	public String countNurseInMaleSurgical() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInMaleSurgical", String.class);
	}

	@Override
	public String countNurseInFemaleMedical() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInFemaleMedical", String.class);
	}

	@Override
	public String countNurseInFemaleSurgical() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInFemaleSurgical", String.class);
	}

	@Override
	public String countNurseInReligiousWard() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInReligiousWard", String.class);
	}

	@Override
	public String countNurseInChildrensWard() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInChildrensWard", String.class);
	}

	@Override
	public String countNurseInGeneralWard() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInGeneralWard", String.class);
	}

	@Override
	public String countNurseInNICU() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInNICU", String.class);
	}

	@Override
	public String countNurseInOpd() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInOpd", String.class);
	}

	@Override
	public String countNurseInAccidentEmergency() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/ward_schedule/nurseInAccidentEmergency", String.class);
	}

}
