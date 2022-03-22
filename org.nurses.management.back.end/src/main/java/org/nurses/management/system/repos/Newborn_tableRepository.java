package org.nurses.management.system.repos;

import org.nurses.management.system.entity.Newborn_table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Newborn_tableRepository extends JpaRepository<Newborn_table, Integer> {
	
	
	
	@Query(value = "select sum(number_of_baby) from newborn_table where year(date_of_delivery) = year(current_date);", nativeQuery = true)
	public String countTotalNumberOfBabies();
	
	
/* counting number of babies in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (1)", nativeQuery = true)
	public String countNewbornJanuary();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (2)", nativeQuery = true)
	public String countNewbornFebruary();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (3)", nativeQuery = true)
	public String countNewbornMarch();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (4)", nativeQuery = true)
	public String countNewbornApril();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (5)", nativeQuery = true)
	public String countNewbornMay();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (6)", nativeQuery = true)
	public String countNewbornJune();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (7)", nativeQuery = true)
	public String countNewbornJuly();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (8)", nativeQuery = true)
	public String countNewbornAugust();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (9)", nativeQuery = true)
	public String countNewbornSeptember();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (10)", nativeQuery = true)
	public String countNewbornOctober();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (11)", nativeQuery = true)
	public String countNewbornNovember();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (12)", nativeQuery = true)
	public String countNewbornDecember();
	
	
	
	/* counting still/newborn deaths */
	
	
	
/* counting number of babies death in the various month in a year */
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (1)", nativeQuery = true)
	public String countNewbornDeathJanuary();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (2)", nativeQuery = true)
	public String countNewbornDeathFebruary();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (3)", nativeQuery = true)
	public String countNewbornDeathMarch();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (4)", nativeQuery = true)
	public String countNewbornDeathApril();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (5)", nativeQuery = true)
	public String countNewbornDeathMay();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (6)", nativeQuery = true)
	public String countNewbornDeathJune();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (7)", nativeQuery = true)
	public String countNewbornDeathJuly();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (8)", nativeQuery = true)
	public String countNewbornDeathAugust();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (9)", nativeQuery = true)
	public String countNewbornDeathSeptember();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (10)", nativeQuery = true)
	public String countNewbornDeathOctober();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (11)", nativeQuery = true)
	public String countNewbornDeathNovember();
	
	@Query(value = "select count(*) from "
			+ "newborn_table where condition_of_baby = 'death' and  "
			+ "year(date_of_delivery) = year(current_date) and "
			+ "month(date_of_delivery) in (12)", nativeQuery = true)
	public String countNewbornDeathDecember();

}
