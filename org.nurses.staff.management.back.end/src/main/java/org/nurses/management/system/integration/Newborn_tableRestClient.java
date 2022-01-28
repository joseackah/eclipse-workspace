package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Newborn_table;

public interface Newborn_tableRestClient {
	
	public void saveNewborn_table(Newborn_table admission);
	public void updateNewborn_table( Newborn_table admission);
	public void deleteNewborn_table(Integer id);
	public void deleteAllNewborn_table( Newborn_table admission);
	public Newborn_table [] getAllNewborn_table( Newborn_table admission);
	public Newborn_table  findNewborn_table(Integer id);
	
	
	public String countTotalNumberOfBabies();
	
	
/* counting number of babies in the various month in a year */
	
	
	public String countNewbornJanuary();
	
	public String countNewbornFebruary();
	
	public String countNewbornMarch();
	
	public String countNewbornApril();
	
	public String countNewbornMay();
	
	public String countNewbornJune();
	
	public String countNewbornJuly();

	public String countNewbornAugust();
	
	public String countNewbornSeptember();
	
	public String countNewbornOctober();

	public String countNewbornNovember();
	
	public String countNewbornDecember();
}
