package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.Ward_Bed_StateRestClient;
import org.nurses.management.system.integration.dto.Ward_Bed_State;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Ward_Bed_StateRestClientImpl implements Ward_Bed_StateRestClient {
	
	
	Ward_Bed_State bedState = new Ward_Bed_State();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveWard_Bed_State(Ward_Bed_State state) {
		//newborn.setId(leave.getId());
		bedState.setWard_name(state.getWard_name());
		bedState.setDate(state.getDate());
		bedState.setTotal_admission(state.getTotal_admission());
		bedState.setTotal_discharge(state.getTotal_discharge());
		bedState.setTotal_trans_in(state.getTotal_trans_in());
		bedState.setTotal_trans_out(state.getTotal_trans_out());
		bedState.setTotal_deaths(state.getTotal_deaths());
		bedState.setTotal_critical_ill(state.getTotal_critical_ill());
		bedState.setTotal_floor_patient(state.getTotal_floor_patient());
		bedState.setTotal_absconded(state.getTotal_absconded());
		bedState.setTotal_insured(state.getTotal_insured());
		bedState.setTotal_non_insured(state.getTotal_non_insured());
		bedState.setTotal_remain_at_midnight(state.getTotal_remain_at_midnight());
		bedState.setNurse_incharge(state.getNurse_incharge());
		
		rest.postForObject("http://localhost:8084/bedState/saveWard_Bed_State", state, Ward_Bed_State.class);

	}

	@Override
	public void updateWard_Bed_State(Ward_Bed_State bedState) {
		Map<String, Integer> updateWard_Bed_State = new HashMap<String, Integer>();
		updateWard_Bed_State.put("id", bedState.getId());
		rest.put("http://localhost:8084/bedState/updateWard_Bed_State", bedState, updateWard_Bed_State);
		

	}

	@Override
	public void deleteWard_Bed_State(Integer id) {
		rest.delete("http://localhost:8084/bedState/deleteWard_Bed_State/"+id);

	}

	@Override
	public void deleteAllWard_Bed_State(Ward_Bed_State bedState) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ward_Bed_State[] getAllWard_Bed_State(Ward_Bed_State bedState) {
		Ward_Bed_State [] getLeave = rest.getForObject("http://localhost:8084/bedState/getAllWard_Bed_State", Ward_Bed_State[].class);
		return getLeave;
	}

	@Override
	public Ward_Bed_State find(Integer id) {
		Ward_Bed_State state = rest.getForObject("http://localhost:8084/bedState/findById/"+id, Ward_Bed_State.class);
		return state;
	}


	
	@Override
	public Ward_Bed_State[] femaleSurgical() {
		Ward_Bed_State[] femaleSurgicalBedState = rest.getForObject("http://localhost:8084/bedState/femaleSurgicalBedState", Ward_Bed_State[].class);
 		return femaleSurgicalBedState;
	}

	@Override
	public Ward_Bed_State[] femaleMedical() {
		Ward_Bed_State[] femaleMedicalLeave = rest.getForObject("http://localhost:8084/bedState/femaleMedicalBedState", Ward_Bed_State[].class);
		return femaleMedicalLeave;
	}

	@Override
	public Ward_Bed_State[] maleSurgical() {
		Ward_Bed_State[] maleSurgicalLeave = rest.getForObject("http://localhost:8084/bedState/maleSurgicalBedState", Ward_Bed_State[].class);
		return maleSurgicalLeave;
	}

	@Override
	public Ward_Bed_State[] maleMedical() {
		Ward_Bed_State[] maleMedicalLeave = rest.getForObject("http://localhost:8084/bedState/femaleMedicalBedState", Ward_Bed_State[].class);
		return maleMedicalLeave;
	}

	@Override
	public Ward_Bed_State[] childrens() {
		Ward_Bed_State[] childrenWardLeave = rest.getForObject("http://localhost:8084/bedState/childrenWardBedState", Ward_Bed_State[].class);
		return childrenWardLeave;
	}

	@Override
	public Ward_Bed_State[] maternity() {
		Ward_Bed_State[] maternityLeave = rest.getForObject("http://localhost:8084/bedState/maternityWardBedState", Ward_Bed_State[].class);
		return maternityLeave;
	}

	@Override
	public Ward_Bed_State[] generalWard() {
		Ward_Bed_State[] generalWardLeave = rest.getForObject("http://localhost:8084/bedState/generalWardBedState", Ward_Bed_State[].class);
		return generalWardLeave;
	}

	@Override
	public Ward_Bed_State[] nicu() {
		Ward_Bed_State[] nicuLeave = rest.getForObject("http://localhost:8084/bedState/nicuBedState", Ward_Bed_State[].class);
		return nicuLeave;
	}

	@Override
	public Ward_Bed_State[] religious() {
		Ward_Bed_State[] religiousWardLeave = rest.getForObject("http://localhost:8084/bedState/religiousWardBedState", Ward_Bed_State[].class);
		return religiousWardLeave;
	}

	@Override
	public Ward_Bed_State[] accident() {
		Ward_Bed_State[] accidentLeave = rest.getForObject("http://localhost:8084/bedState/accidentEmergencyBedState", Ward_Bed_State[].class);
		return accidentLeave;
	}

	@Override
	public Ward_Bed_State[] opd() {
		// TODO Auto-generated method stub
		Ward_Bed_State[] opdLeave = rest.getForObject("http://localhost:8084/bedState/opdBedState", Ward_Bed_State[].class);
		return opdLeave;
	}

	@Override
	public String countRemainAtMidnight() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/bedState/remainMidnight", String.class);
	}

	@Override
	public String countTotalCriticalIll() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/bedState/criticalPatient", String.class);
	}

	@Override
	public String countTotalFloorPatient() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/bedState/floorPatient", String.class);
	}

	@Override
	public String countAbsconded() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/bedState/abscondedPatient", String.class);
	}

	

}
