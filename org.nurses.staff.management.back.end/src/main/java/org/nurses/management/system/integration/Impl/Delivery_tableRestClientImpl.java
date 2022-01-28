package org.nurses.management.system.integration.Impl;

import java.util.HashMap;
import java.util.Map;

import org.nurses.management.system.integration.Delivery_tableRestClient;
import org.nurses.management.system.integration.dto.Delivery_table;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Delivery_tableRestClientImpl implements Delivery_tableRestClient {

	Delivery_table delivery = new Delivery_table();
	RestTemplate rest = new RestTemplate();

	@Override
	public void saveDelivery_table(Delivery_table labour) {
		
		
		delivery.setName(labour.getName());
		delivery.setGestation_of_pregnancy(labour.getGestation_of_pregnancy());
		delivery.setDate_of_delivery(labour.getDate_of_delivery());
		delivery.setTime_of_delivery(labour.getTime_of_delivery());
		delivery.setDate_labour_started(labour.getDate_labour_started());
		delivery.setTime_of_placenta(labour.getTime_of_placenta());
		delivery.setDuration_of_delivery(labour.getDuration_of_delivery());
		delivery.setCondition_of_placenta(labour.getCondition_of_placenta());
		delivery.setCondition_of_mother(labour.getCondition_of_mother());
		delivery.setType_of_delivery(labour.getType_of_delivery());
		delivery.setIndication_of_cs(labour.getIndication_of_cs());
		delivery.setCs_conducted_by(labour.getCs_conducted_by());
		delivery.setState_of_perineum(labour.getState_of_perineum());
		delivery.setMidwife_conducting_delivery(labour.getMidwife_conducting_delivery());
		delivery.setAssisstant(labour.getAssisstant());
		delivery.setComplication_of_delivery(labour.getComplication_of_delivery());
		
		rest.postForObject("http://localhost:8084/delivery/saveDelivery", delivery,
				Delivery_table.class);

	}

	@Override
	public void updateDelivery_table(Delivery_table discharge) {
		Map<String, Integer> updateDelivery_table = new HashMap<String, Integer>();
		updateDelivery_table.put("id", discharge.getDelivery_id());
		rest.put("http://localhost:8084/delivery/updateDelivery", discharge, updateDelivery_table);

	}

	@Override
	public void deleteDelivery_table(Integer id) {
		rest.delete("http://localhost:8084/delivery/deleteDelivery/" + id);

	}

	@Override
	public void deleteAllDelivery_table(Delivery_table discharge) {
		// TODO Auto-generated method stub

	}

	@Override
	public Delivery_table[] getAllDelivery_table(Delivery_table discharge) {
		Delivery_table[] getDelivery_table = rest
				.getForObject("http://localhost:8084/delivery/getAllDelivery", Delivery_table[].class);
		return getDelivery_table;
	}

	@Override
	public Delivery_table findDelivery_table(Integer id) {
		Delivery_table leave = rest.getForObject("http://localhost:8084/delivery/findDeliveryById/" + id,
				Delivery_table.class);
		return leave;
	}

	@Override
	public String countCs() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countCs", String.class);
	}

	@Override
	public String countSpontaneousVaginalDelivery() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countSpontaneousDelivery", String.class);
	}

	@Override
	public String countVacuumExtraction() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countVacuumExtraction", String.class);
	}

	@Override
	public String countSVDWithEpis() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countSVDWithEpis", String.class);
	}

	@Override
	public String SVDAugument() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countSVDAugument", String.class);
	}

	@Override
	public String countSVDInduce() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countSVDInduce", String.class);
	}

	@Override
	public String countDelivery() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDelivery", String.class);
	}

	@Override
	public String countDeliveryJanuary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryJanuary", String.class);
	}

	@Override
	public String countDeliveryFebruary() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryFebruary", String.class);
	}

	@Override
	public String countDeliveryMarch() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryMarch", String.class);
	}

	@Override
	public String countDeliveryApril() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryApril", String.class);
	}

	@Override
	public String countDeliveryMay() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryMay", String.class);
	}

	@Override
	public String countDeliveryJune() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryJune", String.class);
	}

	@Override
	public String countDeliveryJuly() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryJuly", String.class);
	}

	@Override
	public String countDeliveryAugust() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryAugust", String.class);
	}

	@Override
	public String countDeliverySeptember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliverySeptember", String.class);
	}

	@Override
	public String countDeliveryOctober() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryOctober", String.class);
	}

	@Override
	public String countDeliveryNovember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryNovember", String.class);
	}

	@Override
	public String countDeliveryDecember() {
		// TODO Auto-generated method stub
		return rest.getForObject("http://localhost:8084/delivery/countDeliveryDecember", String.class);
	}

	
}
