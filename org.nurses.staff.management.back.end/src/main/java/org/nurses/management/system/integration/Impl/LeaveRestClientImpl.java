package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.LeaveRestClient;
import org.nurses.management.system.integration.dto.Leave;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class LeaveRestClientImpl implements LeaveRestClient {
	
	
	Leave leaves = new Leave();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveLeave(Leave leave) {
		//newborn.setId(leave.getId());
		leaves.setWard_name(leave.getWard_name());
		leaves.setStaff_id(leave.getStaff_id());
		leaves.setName(leave.getName());
		leaves.setStaff_cate(leave.getStaff_cate());
		leaves.setLeave_day_earn(leave.getLeave_day_earn());
		leaves.setLeave_days_apply(leave.getLeave_days_apply());
		leaves.setLeave_date(leave.getLeave_date());
		leaves.setLeave_type(leave.getLeave_type());
		leaves.setIncharge_recom(leave.getIncharge_recom());
		leaves.setIncharge_name(leave.getIncharge_name());
		leaves.setLeave_end_date(leave.getLeave_end_date());
		leaves.setResumption_date(leave.getResumption_date());
		leaves.setApproved_by(leave.getApproved_by());
		leaves.setDate_approved(leave.getDate_approved());
		leaves.setRemarks(leave.getRemarks());
		rest.postForObject("http://localhost:8084/leave/saveLeave", leave, Leave.class);

	}

	@Override
	public void updateLeave(Leave leave) {
		Map<String, Integer> updateLeaves = new HashMap<String, Integer>();
		updateLeaves.put("id", leave.getId());
		rest.put("http://localhost:8084/leave/updateLeave", leave, updateLeaves);
		

	}

	@Override
	public void deleteLeave(Integer id) {
		rest.delete("http://localhost:8084/leave/delete/"+id);

	}

	@Override
	public void deleteAll(Leave leave) {
		// TODO Auto-generated method stub

	}

	@Override
	public Leave[] getAllLeave(Leave leave) {
		Leave [] getLeave = rest.getForObject("http://localhost:8084/leave/getAllLeave", Leave[].class);
		return getLeave;
	}

	@Override
	public Leave find(Integer id) {
		Leave leave = rest.getForObject("http://localhost:8084/leave/findById/"+id, Leave.class);
		return leave;
	}

	@Override
	public Leave[] femaleSurgical() {
		Leave[] femaleSurgicalLeave = rest.getForObject("http://localhost:8084/leave/femaleSurgicalLeave", Leave[].class);
 		return femaleSurgicalLeave;
	}

	@Override
	public Leave[] femaleMedical() {
		Leave[] femaleMedicalLeave = rest.getForObject("http://localhost:8084/leave/femaleMedicalLeave", Leave[].class);
		return femaleMedicalLeave;
	}

	@Override
	public Leave[] maleSurgical() {
		Leave[] maleSurgicalLeave = rest.getForObject("http://localhost:8084/leave/maleSurgicalLeave", Leave[].class);
		return maleSurgicalLeave;
	}

	@Override
	public Leave[] maleMedical() {
		Leave[] maleMedicalLeave = rest.getForObject("http://localhost:8084/leave/maleMedicalLeave", Leave[].class);
		return maleMedicalLeave;
	}

	@Override
	public Leave[] childrenWard() {
		Leave[] childrenWardLeave = rest.getForObject("http://localhost:8084/leave/childrenWardLeave", Leave[].class);
		return childrenWardLeave;
	}

	@Override
	public Leave[] maternity() {
		Leave[] maternityLeave = rest.getForObject("http://localhost:8084/leave/maternityWardLeave", Leave[].class);
		return maternityLeave;
	}

	@Override
	public Leave[] generalWard() {
		Leave[] generalWardLeave = rest.getForObject("http://localhost:8084/leave/generalWardLeave", Leave[].class);
		return generalWardLeave;
	}

	@Override
	public Leave[] nicu() {
		Leave[] nicuLeave = rest.getForObject("http://localhost:8084/leave/nicuLeave", Leave[].class);
		return nicuLeave;
	}

	@Override
	public Leave[] religious() {
		Leave[] religiousWardLeave = rest.getForObject("http://localhost:8084/leave/religiousWardLeave", Leave[].class);
		return religiousWardLeave;
	}

	@Override
	public Leave[] accident() {
		Leave[] accidentLeave = rest.getForObject("http://localhost:8084/leave/accidentEmergencyLeave", Leave[].class);
		return accidentLeave;
	}

	@Override
	public Leave[] opd() {
		// TODO Auto-generated method stub
		Leave[] opdLeave = rest.getForObject("http://localhost:8084/leave/opdLeave", Leave[].class);
		return opdLeave;
	}

}
