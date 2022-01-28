package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Delivery_table;

public interface Delivery_tableRestClient {

	public void saveDelivery_table(Delivery_table admission);

	public void updateDelivery_table(Delivery_table admission);

	public void deleteDelivery_table(Integer id);

	public void deleteAllDelivery_table(Delivery_table admission);

	public Delivery_table[] getAllDelivery_table(Delivery_table admission);

	public Delivery_table findDelivery_table(Integer id);

	public String countCs();
	public String countSpontaneousVaginalDelivery();
	public String countVacuumExtraction();
	public String countSVDWithEpis();
	public String SVDAugument();
	public String countSVDInduce();
	public String countDelivery();
	
	
/* counting Delivery in the various month in a year */
	
	public String countDeliveryJanuary();
	
	public String countDeliveryFebruary();
	
	public String countDeliveryMarch();
	
	public String countDeliveryApril();
	
	public String countDeliveryMay();
	
	public String countDeliveryJune();
	
	public String countDeliveryJuly();
	
	public String countDeliveryAugust();
	
	public String countDeliverySeptember();

	public String countDeliveryOctober();

	public String countDeliveryNovember();
	
	public String countDeliveryDecember();
}
