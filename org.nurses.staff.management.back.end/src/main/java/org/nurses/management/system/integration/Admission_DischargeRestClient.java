package org.nurses.management.system.integration;

import org.nurses.management.system.integration.dto.Admission_Discharge;

public interface Admission_DischargeRestClient {
	
	public void saveAdmission_Discharge(Admission_Discharge admission);
	public void updateAdmission_Discharge( Admission_Discharge admission);
	public void deleteAdmission_Discharge(Integer id);
	public void deleteAllAdmission_Discharge( Admission_Discharge admission);
	public Admission_Discharge [] getAllAdmission_Discharge( Admission_Discharge admission);
	public Admission_Discharge  findAdmission_Discharge(Integer id);
	
	public Admission_Discharge [] admissionOnly(Admission_Discharge admissionOnly);
	
	public Admission_Discharge [] dischargeOnly(Admission_Discharge dischargeOnly);

	public Admission_Discharge [] deathOnly(Admission_Discharge deathOnly);
	
	
	
	public Admission_Discharge[] maleMedical();
	
	public Admission_Discharge[] femaleSurgical();
	
	public Admission_Discharge[] maleSurgical();
	
	public Admission_Discharge[] childrens();
	
	public Admission_Discharge[] maternity();
	
	public Admission_Discharge[] generalWard();
	
	public Admission_Discharge[] nicu();
	
	public Admission_Discharge[] religious();
	
	public Admission_Discharge[] accident();
	
	public Admission_Discharge[] femaleMedical();
	public Admission_Discharge[] opd();
	
	
	
	
	
	/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>*/
	/*>>>>>>>>>>>>>>>>>>===================Deaths======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	/*<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/	
  
  public Admission_Discharge[] maleMedicalDeath();
	
	public Admission_Discharge[] femaleSurgicalDeath();
	
	public Admission_Discharge[] maleSurgicalDeath();
	
	public Admission_Discharge[] childrensDeath();
	
	public Admission_Discharge[] maternityDeath();
	
	public Admission_Discharge[] generalWardDeath();
	
	public Admission_Discharge[] nicuDeath();
	
	public Admission_Discharge[] religiousDeath();
	
	public Admission_Discharge[] accidentDeath();
	
	public Admission_Discharge[] femaleMedicalDeath();
	
	public Admission_Discharge[] opdDeath();
	
	
	
	
	
	
/*>>>>>>>>>>>>>>>>>>===================Discharge======================<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	
	public Admission_Discharge[] maleMedicalDischarge();
	
	public Admission_Discharge[] femaleSurgicalDischarge();
	
	public Admission_Discharge[] maleSurgicalDischarge();
	
	public Admission_Discharge[] childrensDischarge();
	
	public Admission_Discharge[] maternityDischarge();
	
	public Admission_Discharge[] generalWardDischarge();
	
	public Admission_Discharge[] nicuDischarge();
	
	public Admission_Discharge[] religiousDischarge();
	
	public Admission_Discharge[] accidentDischarge();
	
	public Admission_Discharge[] femaleMedicalDischarge();
	
	public Admission_Discharge[] opdDischarge();
	
	
	
/* counting admission in the various month in a year */
	


	public String countAdmissionJanuary();
	
	
	public String countAdmissionFebruary();
	
	
	public String countAdmissionMarch();
	
	
	public String countAdmissionApril();
	
	
	public String countAdmissionMay();
	
	
	public String countAdmissionJune();
	
	
	public String countAdmissionJuly();
	

	public String countAdmissionAugust();
	
	
	public String countAdmissionSeptember();
	
	
	public String countAdmissionOctober();
	
	
	public String countAdmissionNovember();
	
	
	public String countAdmissionDecember();
	
	
	
	
	
	/* counting discharges from various months */
	
	
	public String countDischargeJanuary();
	
	
	
	public String countDischargeFebruary();
	
	
	
	public String countDischargeMarch();
	
	
	public String countDischargeApril();
	
	
	public String countDischargeMay();
	
	
	public String countDischargeJune();
	

	public String countDischargeJuly();
	
	
	public String countDischargeAugust();
	
	
	public String countDischargeSeptember();
	
	
	public String countDischargeOctober();
	
	
	public String countDischargeNovember();
	
	
	public String countDischargeDecember();
			
	
	
	
	
	/* counting death from the various months */
	
	
	
	public String countDeathJanuary();
	
	
	
	public String countDeathFebruary();
	
	
	
	public String countDeathMarch();
	
	
	public String countDeathApril();
	
	
	public String countDeathMay();
	
	
	public String countDeathJune();
	
	
	public String countDeathJuly();
	
	
	public String countDeathAugust();
	
	
	public String countDeathSeptember();
	
	
	public String countDeathOctober();
	
	
	public String countDeathNovember();
	
	
	public String countDeathDecember();
	
	
	/* counting admission and discharge to date */
	
	
	public String countAdmissionToDate();
	
	public String countDischarge();
	
	public String countDeath();
	
	

	/* counting admission and discharge for today */
	
	
	public String countTodayAdmission();
	
	public String countTodayDischarge();
	
	
	public String countTodayDeath();
	
	
	/* counting admission and discharge for yesterday */
	
	public String countYesterdayAdmission();
	
	public String countYesterdayDischarge();
	
	
	public String countYesterdayDeath();
	
	
	public String bedOccupant();
	
	
	
	
	
	/* male medical counting */
	/* counting admission in the various month in a year */
		 
		public String countMaleMedicalAdmissionJanuary();
		 
		public String countMaleMedicalAdmissionFebruary();
		 
		public String countMaleMedicalAdmissionMarch();
		 
		public String countMaleMedicalAdmissionApril();
		 
		public String countMaleMedicalAdmissionMay();
		 
		public String countMaleMedicalAdmissionJune();
		 
		public String countMaleMedicalAdmissionJuly();
		 
		public String countMaleMedicalAdmissionAugust();
		 
		public String countMaleMedicalAdmissionSeptember();
		 
		public String countMaleMedicalAdmissionOctober();
		 
		public String countMaleMedicalAdmissionNovember();
		 
		public String countMaleMedicalAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countMaleMedicalDischargeJanuary();
		 
		public String countMaleMedicalDischargeFebruary();
		 
		public String countMaleMedicalDischargeMarch();
		 
		public String countMaleMedicalDischargeApril();
		 
		public String countMaleMedicalDischargeMay();
		 
		public String countMaleMedicalDischargeJune();
		 
		public String countMaleMedicalDischargeJuly();
		 
		public String countMaleMedicalDischargeAugust();
		 
		public String countMaleMedicalDischargeSeptember();
		 
		public String countMaleMedicalDischargeOctober();
		 
		public String countMaleMedicalDischargeNovember();
		 
		public String countMaleMedicalDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		 
		public String countMaleMedicalDeathJanuary();
		 
		public String countMaleMedicalDeathFebruary();
		 
		public String countMaleMedicalDeathMarch();
		 
		public String countMaleMedicalDeathApril();
		 
		public String countMaleMedicalDeathMay();
		 
		public String countMaleMedicalDeathJune();
		 
		public String countMaleMedicalDeathJuly();
		 
		public String countMaleMedicalDeathAugust();
		  
		public String countMaleMedicalDeathSeptember();
		 
		public String countMaleMedicalDeathOctober();
		 
		public String countMaleMedicalDeathNovember();
		 
		public String countMaleMedicalDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countMaleMedicalAdmissionToDate();
		 
		public String countMaleMedicalDischarge();
		 
		public String countMaleMedicalDeath();
		
		
		
		/* counting admission and discharge for today */
		
		 
		public String countMaleMedicalTodayAdmission();
		 
		public String countMaleMedicalTodayDischarge();
		
		 
		public String countMaleMedicalTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countMaleMedicalYesterdayAdmission();
		 
		public String countMaleMedicalYesterdayDischarge();
		 
		public String countMaleMedicalYesterdayDeath();
		
		
		/* female medical counting */
		
		
	/* counting admission in the various month in a year */
		 
		public String countFemaleMedicalAdmissionJanuary();
		 
		public String countFemaleMedicalAdmissionFebruary();
		 
		public String countFemaleMedicalAdmissionMarch();
		 
		public String countFemaleMedicalAdmissionApril();
		 
		public String countFemaleMedicalAdmissionMay();
		 
		public String countFemaleMedicalAdmissionJune();
		 
		public String countFemaleMedicalAdmissionJuly();
		 
		public String countFemaleMedicalAdmissionAugust();
	 
		public String countFemaleMedicalAdmissionSeptember() ;
		 
		public String countFemaleMedicalAdmissionOctober();
		 
		public String countFemaleMedicalAdmissionNovember();
		 
		public String countFemaleMedicalAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countFemaleMedicalDischargeJanuary();
		 
		public String countFemaleMedicalDischargeFebruary();
		 
		public String countFemaleMedicalDischargeMarch();
		 
		public String countFemaleMedicalDischargeApril();
		 
		public String countFemaleMedicalDischargeMay();
		 
		public String countFemaleMedicalDischargeJune();
		 
		public String countFemaleMedicalDischargeJuly();
		 
		public String countFemaleMedicalDischargeAugust();
		 
		public String countFemaleMedicalDischargeSeptember();
		 
		public String countFemaleMedicalDischargeOctober();
		
 		public String countFemaleMedicalDischargeNovember();
		 
		public String countFemaleMedicalDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		
		 
		public String countFemaleMedicalDeathJanuary();
		 
		public String countFemaleMedicalDeathFebruary();
		 
		public String countFemaleMedicalDeathMarch();
		 
		public String countFemaleMedicalDeathApril();
		 
		public String countFemaleMedicalDeathMay();
		 
		public String countFemaleMedicalDeathJune();
		 
		public String countFemaleMedicalDeathJuly();
		 
		public String countFemaleMedicalDeathAugust();
		 
		public String countFemaleMedicalDeathSeptember();
		 
		public String countFemaleMedicalDeathOctober();
		 
		public String countFemaleMedicalDeathNovember();
		 
		public String countFemaleMedicalDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countFemaleMedicalAdmissionToDate();
		 
		public String countFemaleMedicalDischarge();
 		public String countFemaleMedicalDeath();
		
		
		
		/* counting admission and discharge for today */
		 
		public String countFemaleMedicalTodayAdmission();
		 
		public String countFemaleMedicalTodayDischarge();
		 
		public String countFemaleMedicalTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countFemaleMedicalYesterdayAdmission();
		 
		public String countFemaleMedicalYesterdayDischarge();
		
		 
		public String countFemaleMedicalYesterdayDeath();
		
		
		
		
		/* male surgical counting */
		
	/* counting admission in the various month in a year */
		 
		public String countMaleSurgicalAdmissionJanuary();
		 
		public String countMaleSurgicalAdmissionFebruary();
		 
		public String countMaleSurgicalAdmissionMarch();
		 
		public String countMaleSurgicalAdmissionApril();
		 
		public String countMaleSurgicalAdmissionMay();
		 
		public String countMaleSurgicalAdmissionJune();
		 
		public String countMaleSurgicalAdmissionJuly();
		
		 
		public String countMaleSurgicalAdmissionAugust();
		
	 
		public String countMaleSurgicalAdmissionSeptember();
		
		 
		public String countMaleSurgicalAdmissionOctober();
		
	 
		public String countMaleSurgicalAdmissionNovember();
		
		 
		public String countMaleSurgicalAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		
	 
		public String countMaleSurgicalDischargeJanuary();
		
		
		 
		public String countMaleSurgicalDischargeFebruary();
		
		
	 
		public String countMaleSurgicalDischargeMarch();
		 
		public String countMaleSurgicalDischargeApril();
		
		 
		public String countMaleSurgicalDischargeMay();
		
		 
		public String countMaleSurgicalDischargeJune();
		
		 
		public String countMaleSurgicalDischargeJuly();
		
		 
		public String countMaleSurgicalDischargeAugust();
		
		 
		public String countMaleSurgicalDischargeSeptember();
		
		 
		public String countMaleSurgicalDischargeOctober();
		
		 
		public String countMaleSurgicalDischargeNovember();
		
		 
		public String countMaleSurgicalDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		
		 
		public String countMaleSurgicalDeathJanuary();
		
		
		 
		public String countMaleSurgicalDeathFebruary();
		
		
		 
		public String countMaleSurgicalDeathMarch();
		
		 
		public String countMaleSurgicalDeathApril();
		
		 
		public String countMaleSurgicalDeathMay();
		
		 
		public String countMaleSurgicalDeathJune();
		
		 
		public String countMaleSurgicalDeathJuly();
		 
		public String countMaleSurgicalDeathAugust();
		 
		public String countMaleSurgicalDeathSeptember();
		
		 
		public String countMaleSurgicalDeathOctober();
		
		 
		public String countMaleSurgicalDeathNovember();
		 
		public String countMaleSurgicalDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countMaleSurgicalAdmissionToDate();
		
		 
		public String countMaleSurgicalDischarge();
		
		 
		public String countMaleSurgicalDeath();
		
		
		
		/* counting admission and discharge for today */
		
		
		 
		public String countMaleSurgicalTodayAdmission();
		
		 
		public String countMaleSurgicalTodayDischarge();
		 
		public String countMaleSurgicalTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
	 
		public String countMaleSurgicalYesterdayAdmission();
	 
		public String countMaleSurgicalYesterdayDischarge();
		 
		public String countMaleSurgicalYesterdayDeath();
		
		
		
		
		/* female surgical counting */
		
		
	/* counting admission in the various month in a year */
		 
		public String countFemaleSurgicalAdmissionJanuary();
		 
		public String countFemaleSurgicalAdmissionFebruary();
		 
		public String countFemaleSurgicalAdmissionMarch();
		 
		public String countFemaleSurgicalAdmissionApril();
		 
		public String countFemaleSurgicalAdmissionMay();
		 
		public String countFemaleSurgicalAdmissionJune();
		 
		public String countFemaleSurgicalAdmissionJuly();
		 
		public String countFemaleSurgicalAdmissionAugust();
		 
		public String countFemaleSurgicalAdmissionSeptember();
		 
		public String countFemaleSurgicalAdmissionOctober();
		 
		public String countFemaleSurgicalAdmissionNovember();
		 
		public String countFemaleSurgicalAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countFemaleSurgicalDischargeJanuary();
		 
		public String countFemaleSurgicalDischargeFebruary();
		 
		public String countFemaleSurgicalDischargeMarch();
		 
		public String countFemaleSurgicalDischargeApril();
		 
		public String countFemaleSurgicalDischargeMay();
		 
		public String countFemaleSurgicalDischargeJune();
		 
		public String countFemaleSurgicalDischargeJuly();
		 
		public String countFemaleSurgicalDischargeAugust();
		 
		public String countFemaleSurgicalDischargeSeptember();
		 
		public String countFemaleSurgicalDischargeOctober();
		 
		public String countFemaleSurgicalDischargeNovember();
		 
		public String countFemaleSurgicalDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		
		 
		public String countFemaleSurgicalDeathJanuary();
		
		 
		public String countFemaleSurgicalDeathFebruary();
		 
		public String countFemaleSurgicalDeathMarch();
		 
		public String countFemaleSurgicalDeathApril();
		 
		public String countFemaleSurgicalDeathMay();
		 
		public String countFemaleSurgicalDeathJune();
		 
		public String countFemaleSurgicalDeathJuly();
		 
		public String countFemaleSurgicalDeathAugust();
		 
		public String countFemaleSurgicalDeathSeptember();
		 
		public String countFemaleSurgicalDeathOctober();
		 
		public String countFemaleSurgicalDeathNovember();
		 
		public String countFemaleSurgicalDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countFemaleSurgicalAdmissionToDate();
		 
		public String countFemaleSurgicalDischarge();
		 
		public String countFemaleSurgicalDeath();
		
		
		
		/* counting admission and discharge for today */
	 
		public String countFemaleSurgicalTodayAdmission();
		 
		public String countFemaleSurgicalTodayDischarge();
		
		 
		public String countFemaleSurgicalTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countFemaleSurgicalYesterdayAdmission();
 		public String countFemaleSurgicalYesterdayDischarge();
		
		
 		public String countFemaleSurgicalYesterdayDeath();
		
		
		
		
		/* maternity counting */
		
	/* counting admission in the various month in a year */
		
		 
		public String countMaternityAdmissionJanuary();
		
		 
		public String countMaternityAdmissionFebruary();
		 
		public String countMaternityAdmissionMarch();
		 
		public String countMaternityAdmissionApril();
		 
		public String countMaternityAdmissionMay();
		 
		public String countMaternityAdmissionJune();
		 
		public String countMaternityAdmissionJuly();
		 
		public String countMaternityAdmissionAugust();
		 
		public String countMaternityAdmissionSeptember();
		 
		public String countMaternityAdmissionOctober();
		 
		public String countMaternityAdmissionNovember();
		 
		public String countMaternityAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countMaternityDischargeJanuary();
		 
		public String countMaternityDischargeFebruary();
		 
		public String countMaternityDischargeMarch();
		 
		public String countMaternityDischargeApril();
		 
		public String countMaternityDischargeMay();
		 
		public String countMaternityDischargeJune();
		 
		public String countMaternityDischargeJuly();
		 
		public String countMaternityDischargeAugust();
		 
		public String countMaternityDischargeSeptember();
		 
		public String countMaternityDischargeOctober();
		 
		public String countMaternityDischargeNovember();
		 
		public String countMaternityDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		 
		public String countMaternityDeathJanuary();
		 
		public String countMaternityDeathFebruary();
		 
		public String countMaternityDeathMarch();
		 
		public String countMaternityDeathApril();
		 
		public String countMaternityDeathMay();
		 
		public String countMaternityDeathJune();
		 
		public String countMaternityDeathJuly();
		 
		public String countMaternityDeathAugust();
		 
		public String countMaternityDeathSeptember();
		 
		public String countMaternityDeathOctober();
		 
		public String countMaternityDeathNovember();
		 
		public String countMaternityDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countMaternityAdmissionToDate();
		 
		public String countMaternityDischarge();
 		public String countMaternityDeath();
		
		
		
		/* counting admission and discharge for today */
		 
		public String countMaternityTodayAdmission();
		 
		public String countMaternityTodayDischarge();
		
	 
		public String countMaternityTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countMaternityYesterdayAdmission();
 		public String countMaternityYesterdayDischarge();
 		public String countMaternityYesterdayDeath();
		
		
		/* nicu counting */
		
	/* counting admission in the various month in a year */
		 
		public String countNICUAdmissionJanuary();
		 
		public String countNICUAdmissionFebruary();
		 
		public String countNICUAdmissionMarch();
		 
		public String countNICUAdmissionApril();
		 
		public String countNICUAdmissionMay();
		 
		public String countNICUAdmissionJune();
		 
		public String countNICUAdmissionJuly();
		 
		public String countNICUAdmissionAugust();
		 
		public String countNICUAdmissionSeptember();
		 
		public String countNICUAdmissionOctober();
		 
		public String countNICUAdmissionNovember();
		 
		public String countNICUAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countNICUDischargeJanuary();
		 
		public String countNICUDischargeFebruary();
		 
		public String countNICUDischargeMarch();
		 
		public String countNICUDischargeApril();
		 
		public String countNICUDischargeMay();
		 
		public String countNICUDischargeJune();
		 
		public String countNICUDischargeJuly();
		 
		public String countNICUDischargeAugust();
		 
		public String countNICUDischargeSeptember();
		 
		public String countNICUDischargeOctober();
		 
		public String countNICUDischargeNovember();
		 
		public String countNICUDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		 
		public String countNICUDeathJanuary();
		 
		public String countNICUDeathFebruary();
		 
		public String countNICUDeathMarch();
		 
		public String countNICUDeathApril();
		 
		public String countNICUDeathMay();
		 
		public String countNICUDeathJune();
		 
		public String countNICUDeathJuly();
		 
		public String countNICUDeathAugust();
		 
		public String countNICUDeathSeptember();
		 
		public String countNICUDeathOctober();
		 
		public String countNICUDeathNovember();
		 
		public String countNICUDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countNICUAdmissionToDate();
		 
		public String countNICUDischarge();
 		public String countNICUDeath();
		
		
		
		/* counting admission and discharge for today */
 		public String countNICUTodayAdmission();
		 
		public String countNICUTodayDischarge();
		  
		public String countNICUTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countNICUYesterdayAdmission();
	 
		public String countNICUYesterdayDischarge();
		 
		public String countNICUYesterdayDeath();
		
		
		
		/* religious ward counting */
		
		
	/* counting admission in the various month in a year */
		 
		public String countReligiousWardAdmissionJanuary();
		 
		public String countReligiousWardAdmissionFebruary();
		 
		public String countReligiousWardAdmissionMarch();
		 
		public String countReligiousWardAdmissionApril();
		 
		public String countReligiousWardAdmissionMay();
		 
		public String countReligiousWardAdmissionJune();
		 
		public String countReligiousWardAdmissionJuly();
		 
		public String countReligiousWardAdmissionAugust();
		 
		public String countReligiousWardAdmissionSeptember();
		 
		public String countReligiousWardAdmissionOctober();
		 
		public String countReligiousWardAdmissionNovember();
		 
		public String countReligiousWardAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countReligiousWardDischargeJanuary();
		 
		public String countReligiousWardDischargeFebruary();
		 
		public String countReligiousWardDischargeMarch();
		 
		public String countReligiousWardDischargeApril();
		 
		public String countReligiousWardDischargeMay();
		 
		public String countReligiousWardDischargeJune();
		 
		public String countReligiousWardDischargeJuly();
		 
		public String countReligiousWardDischargeAugust();
		 
		public String countReligiousWardDischargeSeptember();
		 
		public String countReligiousWardDischargeOctober();
		 
		public String countReligiousWardDischargeNovember();
		 
		public String countReligiousWardDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		 
		public String countReligiousWardDeathJanuary();
		 
		public String countReligiousWardDeathFebruary();
		 
		public String countReligiousWardDeathMarch();
		 
		public String countReligiousWardDeathApril();
		 
		public String countReligiousWardDeathMay();
		 
		public String countReligiousWardDeathJune();
		 
		public String countReligiousWardDeathJuly();
		 
		public String countReligiousWardDeathAugust();
		 
		public String countReligiousWardDeathSeptember();
		 
		public String countReligiousWardDeathOctober();
		 
		public String countReligiousWardDeathNovember();
		 
		public String countReligiousWardDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countReligiousWardAdmissionToDate();
		 
		public String countReligiousWardDischarge();
		
 		public String countReligiousWardDeath();
		
		
		
		/* counting admission and discharge for today */
		
		
		 
		public String countReligiousWardTodayAdmission();
		 
		public String countReligiousWardTodayDischarge();
		  
		public String countReligiousWardTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countReligiousWardYesterdayAdmission();
 		public String countReligiousWardYesterdayDischarge();
 		public String countReligiousWardYesterdayDeath();
		
		
		
		/* general ward counting */
		
	/* counting admission in the various month in a year */
		 
		public String countGeneralWardAdmissionJanuary();
		 
		public String countGeneralWardAdmissionFebruary();
		 
		public String countGeneralWardAdmissionMarch();
		 
		public String countGeneralWardAdmissionApril();
		 		public String countGeneralWardAdmissionMay();
		 
		public String countGeneralWardAdmissionJune();
		 
		public String countGeneralWardAdmissionJuly();
		 
		public String countGeneralWardAdmissionAugust();
		 
		public String countGeneralWardAdmissionSeptember();
		 
		public String countGeneralWardAdmissionOctober();
		 
		public String countGeneralWardAdmissionNovember();
		 
		public String countGeneralWardAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countGeneralWardDischargeJanuary();
		 
		public String countGeneralWardDischargeFebruary();
		 
		public String countGeneralWardDischargeMarch();
		 
		public String countGeneralWardDischargeApril();
		 
		public String countGeneralWardDischargeMay();
		 
		public String countGeneralWardDischargeJune();
		 
		public String countGeneralWardDischargeJuly();
		 
		public String countGeneralWardDischargeAugust();
		 
		public String countGeneralWardDischargeSeptember();
		 
		public String countGeneralWardDischargeOctober();
		 
		public String countGeneralWardDischargeNovember();
		 
		public String countGeneralWardDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		 
		public String countGeneralWardDeathJanuary();
		 
		public String countGeneralWardDeathFebruary();
		 
		public String countGeneralWardDeathMarch();
		 
		public String countGeneralWardDeathApril();
		 
		public String countGeneralWardDeathMay();
		 
		public String countGeneralWardDeathJune();
		 
		public String countGeneralWardDeathJuly();
		 
		public String countGeneralWardDeathAugust();
		 
		public String countGeneralWardDeathSeptember();
		 
		public String countGeneralWardDeathOctober();
		 
		public String countGeneralWardDeathNovember();
		 
		public String countGeneralWardDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		
 		public String countGeneralWardAdmissionToDate();
		 
		public String countGeneralWardDischarge();
 		public String countGeneralWardDeath();
		
		
		
		/* counting admission and discharge for today */
		
		 
		public String countGeneralWardTodayAdmission();
		 
		public String countGeneralWardTodayDischarge();
 		public String countGeneralWardTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countGeneralWardYesterdayAdmission();
		 
		public String countGeneralWardYesterdayDischarge();
		 
		public String countGeneralWardYesterdayDeath();
		
		
		
		
		/*
		 * children's ward counting
		 */		
		
	/* counting admission in the various month in a year */
		 
		public String countChildrensWardAdmissionJanuary();
		 
		public String countChildrensWardAdmissionFebruary();
		 
		public String countChildrensWardAdmissionMarch();
		 
		public String countChildrensWardAdmissionApril();
		 
		public String countChildrensWardAdmissionMay();
		 
		public String countChildrensWardAdmissionJune();
		 
		public String countChildrensWardAdmissionJuly();
		 
		public String countChildrensWardAdmissionAugust();
		 
		public String countChildrensWardAdmissionSeptember();
		 
		public String countChildrensWardAdmissionOctober();
		 
		public String countChildrensWardAdmissionNovember();
		 
		public String countChildrensWardAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		 
		public String countChildrensWardDischargeJanuary();
		 
		public String countChildrensWardDischargeFebruary();
		 
		public String countChildrensWardDischargeMarch();
		 
		public String countChildrensWardDischargeApril();
		 
		public String countChildrensWardDischargeMay();
		 
		public String countChildrensWardDischargeJune();
		 
		public String countChildrensWardDischargeJuly();
		 
		public String countChildrensWardDischargeAugust();
		 
		public String countChildrensWardDischargeSeptember();
		 
		public String countChildrensWardDischargeOctober();
		 
		public String countChildrensWardDischargeNovember();
		 
		public String countChildrensWardDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		 
		public String countChildrensWardDeathJanuary();
		 
		public String countChildrensWardDeathFebruary();
		 
		public String countChildrensWardDeathMarch();
		 
		public String countChildrensWardDeathApril();
		 
		public String countChildrensWardDeathMay();
		 
		public String countChildrensWardDeathJune();
		 
		public String countChildrensWardDeathJuly();
		 
		public String countChildrensWardDeathAugust();
		 
		public String countChildrensWardDeathSeptember();
		 
		public String countChildrensWardDeathOctober();
		 
		public String countChildrensWardDeathNovember();
		 
		public String countChildrensWardDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		 
		public String countChildrensWardAdmissionToDate();
		 
		public String countChildrensWardDischarge();
		 
 		public String countChildrensWardDeath();
		
		
		
		/* counting admission and discharge for today */
		
		
	 
		public String countChildrensWardTodayAdmission();
		
		 
		public String countChildrensWardTodayDischarge();
		
		
		 
		public String countChildrensWardTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		 
		public String countChildrensWardYesterdayAdmission();
		
		 
		public String countChildrensWardYesterdayDischarge();
		
		
		 
		public String countChildrensWardYesterdayDeath();
		
		
		
		/* accident/emergency counting */
		
		
	/* counting admission in the various month in a year */
		
	 
		public String countAccidentEmergencyAdmissionJanuary();
		
		 
		public String countAccidentEmergencyAdmissionFebruary();
		
		 
		public String countAccidentEmergencyAdmissionMarch();
		
	 
		public String countAccidentEmergencyAdmissionApril();
		
		 
		public String countAccidentEmergencyAdmissionMay();
		
	 
		public String countAccidentEmergencyAdmissionJune();
		
		 
		public String countAccidentEmergencyAdmissionJuly();
		
		 
		public String countAccidentEmergencyAdmissionAugust();
		
	 
		public String countAccidentEmergencyAdmissionSeptember();
		
	 
		public String countAccidentEmergencyAdmissionOctober();
		
 
		public String countAccidentEmergencyAdmissionNovember();
		
	 
		public String countAccidentEmergencyAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		
		 
		public String countAccidentEmergencyDischargeJanuary();
		
		
	 
		public String countAccidentEmergencyDischargeFebruary();
		
		 
		public String countAccidentEmergencyDischargeMarch();
		
		 
		public String countAccidentEmergencyDischargeApril();
		
		 
		public String countAccidentEmergencyDischargeMay();
		
		 
		public String countAccidentEmergencyDischargeJune();
		
		 
		public String countAccidentEmergencyDischargeJuly();
		
	 
		public String countAccidentEmergencyDischargeAugust();
		
	 
		public String countAccidentEmergencyDischargeSeptember();
		
	 
		public String countAccidentEmergencyDischargeOctober();
		
		 
		public String countAccidentEmergencyDischargeNovember();
		
 
		public String countAccidentEmergencyDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		
		
		
		public String countAccidentEmergencyDeathJanuary();
		
		
	
		public String countAccidentEmergencyDeathFebruary();
		
		

		public String countAccidentEmergencyDeathMarch();
		
	
		public String countAccidentEmergencyDeathApril();
		
		
		public String countAccidentEmergencyDeathMay();
		
		
		public String countAccidentEmergencyDeathJune();
		
		
		public String countAccidentEmergencyDeathJuly();
		
		
		public String countAccidentEmergencyDeathAugust();
		
		
		public String countAccidentEmergencyDeathSeptember();
		
		
		public String countAccidentEmergencyDeathOctober();
		
	
		public String countAccidentEmergencyDeathNovember();
		
		
		public String countAccidentEmergencyDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		
		
		public String countAccidentEmergencyAdmissionToDate();
		
		
		public String countAccidentEmergencyDischarge();
		
		
		public String countAccidentEmergencyDeath();
		
		
		
		/* counting admission and discharge for today */
		
		
		
		public String countAccidentEmergencyTodayAdmission();
		
		
		public String countAccidentEmergencyTodayDischarge();
		
		
		
		public String countAccidentEmergencyTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		
		
		public String countAccidentEmergencyYesterdayAdmission();
		
		
		public String countAccidentEmergencyYesterdayDischarge();
		
		
		
		public String countAccidentEmergencyYesterdayDeath();
		
		
		/* opd counting */
		
	/* counting admission in the various month in a year */
		
		
		public String countOpdAdmissionJanuary();
		
	
		public String countOpdAdmissionFebruary();
		
		
		public String countOpdAdmissionMarch();
		
		
		public String countOpdAdmissionApril();
		
		
		public String countOpdAdmissionMay();
		
		
		public String countOpdAdmissionJune();
		
		
		public String countOpdAdmissionJuly();
		
	
		public String countOpdAdmissionAugust();
		
		
		public String countOpdAdmissionSeptember();
		
		
		public String countOpdAdmissionOctober();
		
	
		public String countOpdAdmissionNovember();
		
	
		public String countOpdAdmissionDecember();
		
		
		
		
		
		/* counting discharges from various months */
		
		
		public String countOpdDischargeJanuary();
		
		
		
		public String countOpdDischargeFebruary();
		
		
	
		public String countOpdDischargeMarch();
		
	
		public String countOpdDischargeApril();
		
		
		public String countOpdDischargeMay();
		
		
		public String countOpdDischargeJune();
		
		
		public String countOpdDischargeJuly();
		
	
		public String countOpdDischargeAugust();
		
		
		public String countOpdDischargeSeptember();
		
		
		public String countOpdDischargeOctober();
	
		
		public String countOpdDischargeNovember();
		
		
		public String countOpdDischargeDecember();
				
		
		
		
		
		/* counting death from the various months */
		
		
		
		public String countOpdDeathJanuary();
		
		

		public String countOpdDeathFebruary();
		
		
		
		public String countOpdDeathMarch();
		
		
		public String countOpdDeathApril();
		
		
		public String countOpdDeathMay();
		
	
		public String countOpdDeathJune();
		
	
		public String countOpdDeathJuly();
		

		public String countOpdDeathAugust();
		
		
		public String countOpdDeathSeptember();
		
		
		public String countOpdDeathOctober();
		
		
		public String countOpdDeathNovember();
		
		
		public String countOpdDeathDecember();
		
		
		
		/* counting admission and discharge up to date */
		
	
		public String countOpdAdmissionToDate();
		
	
		public String countOpdDischarge();
		
	
		public String countOpdDeath();
		
		
		
		/* counting admission and discharge for today */
		
		
		
		public String countOpdTodayAdmission();
		
	
		public String countOpdTodayDischarge();
		
		
		
		public String countOpdTodayDeath();
		
		
		/* counting admission and discharge for yesterday */
		

		public String countOpdYesterdayAdmission();
		
		
		public String countOpdYesterdayDischarge();
		
		
	
		public String countOpdYesterdayDeath();
	
}
