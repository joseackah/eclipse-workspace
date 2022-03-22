package org.nurses.management.system.repos;

import org.nurses.management.system.entity.Delivery_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Delivery_tableRepository extends JpaRepository<Delivery_table, Integer> {

	@Query(value = "select count(*) from delivery_table where type_of_delivery ='cesaerean Section'", nativeQuery = true)
	public String countCs();

	@Query(value = "select count(*) from delivery_table where type_of_delivery ='spontaneous V. delivery'", nativeQuery = true)
	public String countSpontaneousVaginalDelivery();

	@Query(value = "select count(*) from delivery_table where type_of_delivery ='Vacuum Extraction'", nativeQuery = true)
	public String countVacuumExtraction();

	@Query(value = "select count(*) from delivery_table where type_of_delivery ='SVD with episiotomy'", nativeQuery = true)
	public String countSVDWithEpis();

	@Query(value = "select count(*) from delivery_table where type_of_delivery ='SVD(Augumented)'", nativeQuery = true)
	public String SVDAugument();

	@Query(value = "select count(*) from delivery_table where type_of_delivery ='SVD(Induced)'", nativeQuery = true)
	public String countSVDInduce();

	@Query(value = "select count(*) from delivery_table where year(date_of_delivery) = year(current_date);", nativeQuery = true)
	public String countDelivery();

	/* counting Delivery in the various month in a year */

	@Query(value = "select count(*) from delivery_table where  year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (1)", nativeQuery = true)
	public String countDeliveryJanuary();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (2)", nativeQuery = true)
	public String countDeliveryFebruary();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (3)", nativeQuery = true)
	public String countDeliveryMarch();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (4)", nativeQuery = true)
	public String countDeliveryApril();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (5)", nativeQuery = true)
	public String countDeliveryMay();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (6)", nativeQuery = true)
	public String countDeliveryJune();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (7)", nativeQuery = true)
	public String countDeliveryJuly();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (8)", nativeQuery = true)
	public String countDeliveryAugust();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and month(date_of_delivery) in (9)", nativeQuery = true)
	public String countDeliverySeptember();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (10)", nativeQuery = true)
	public String countDeliveryOctober();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (11)", nativeQuery = true)
	public String countDeliveryNovember();

	@Query(value = "select count(*) from delivery_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (12)", nativeQuery = true)
	public String countDeliveryDecember();

}
