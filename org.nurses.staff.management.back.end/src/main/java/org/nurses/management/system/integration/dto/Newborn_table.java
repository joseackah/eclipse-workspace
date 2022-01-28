package org.nurses.management.system.integration.dto;

import java.sql.Date;

public class Newborn_table {
	

	private Integer newborn_id;
	private Integer delivery_id;
	private String baby_name;
	private String first_apgar_score;
	private String second_apgar_score;
	private String outcome_of_delivery;
	private String cause_of_death;
	private String sex;
	private Integer number_of_baby;
	private String resuscitation;
	private String condition_of_baby;
	private String head_circumference;
	private String full_length;
	private String congenital;
	private String type_of_abnormality;
	private String complication;
	private Date  date_of_delivery;
	
	
	public Newborn_table() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Newborn_table(Integer newborn_id, Integer delivery_id, String baby_name, String first_apgar_score,
			String second_apgar_score, String outcome_of_delivery, String cause_of_death, String sex,
			Integer number_of_baby, String resuscitation, String condition_of_baby, String head_circumference,
			String full_length, String congenital, String complication, String type_of_abnormality, Date date_of_delivery) {
		super();
		this.newborn_id = newborn_id;
		this.delivery_id = delivery_id;
		this.baby_name = baby_name;
		this.first_apgar_score = first_apgar_score;
		this.second_apgar_score = second_apgar_score;
		this.outcome_of_delivery = outcome_of_delivery;
		this.cause_of_death = cause_of_death;
		this.sex = sex;
		this.number_of_baby = number_of_baby;
		this.resuscitation = resuscitation;
		this.condition_of_baby = condition_of_baby;
		this.head_circumference = head_circumference;
		this.full_length = full_length;
		this.congenital = congenital;
		this.complication = complication;
		this.type_of_abnormality = type_of_abnormality;
		this.date_of_delivery = date_of_delivery;
	}


	

	public Date getDate_of_delivery() {
		return date_of_delivery;
	}



	public void setDate_of_delivery(Date date_of_delivery) {
		this.date_of_delivery = date_of_delivery;
	}



	public String getType_of_abnormality() {
		return type_of_abnormality;
	}



	public void setType_of_abnormality(String type_of_abnormality) {
		this.type_of_abnormality = type_of_abnormality;
	}



	public Integer getNewborn_id() {
		return newborn_id;
	}



	public void setNewborn_id(Integer newborn_id) {
		this.newborn_id = newborn_id;
	}



	public Integer getDelivery_id() {
		return delivery_id;
	}



	public void setDelivery_id(Integer delivery_id) {
		this.delivery_id = delivery_id;
	}



	public String getBaby_name() {
		return baby_name;
	}



	public void setBaby_name(String baby_name) {
		this.baby_name = baby_name;
	}



	public String getFirst_apgar_score() {
		return first_apgar_score;
	}



	public void setFirst_apgar_score(String first_apgar_score) {
		this.first_apgar_score = first_apgar_score;
	}



	public String getSecond_apgar_score() {
		return second_apgar_score;
	}



	public void setSecond_apgar_score(String second_apgar_score) {
		this.second_apgar_score = second_apgar_score;
	}



	public String getOutcome_of_delivery() {
		return outcome_of_delivery;
	}



	public void setOutcome_of_delivery(String outcome_of_delivery) {
		this.outcome_of_delivery = outcome_of_delivery;
	}



	public String getCause_of_death() {
		return cause_of_death;
	}



	public void setCause_of_death(String cause_of_death) {
		this.cause_of_death = cause_of_death;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public Integer getNumber_of_baby() {
		return number_of_baby;
	}



	public void setNumber_of_baby(Integer number_of_baby) {
		this.number_of_baby = number_of_baby;
	}



	public String getResuscitation() {
		return resuscitation;
	}



	public void setResuscitation(String resuscitation) {
		this.resuscitation = resuscitation;
	}



	public String getCondition_of_baby() {
		return condition_of_baby;
	}



	public void setCondition_of_baby(String condition_of_baby) {
		this.condition_of_baby = condition_of_baby;
	}



	public String getHead_circumference() {
		return head_circumference;
	}



	public void setHead_circumference(String head_circumference) {
		this.head_circumference = head_circumference;
	}



	public String getFull_length() {
		return full_length;
	}



	public void setFull_length(String full_length) {
		this.full_length = full_length;
	}



	public String getCongenital() {
		return congenital;
	}



	public void setCongenital(String congenital) {
		this.congenital = congenital;
	}



	public String getComplication() {
		return complication;
	}



	public void setComplication(String complication) {
		this.complication = complication;
	}



	@Override
	public String toString() {
		return "Newborn_table [newborn_id=" + newborn_id + ", delivery_id=" + delivery_id + ", baby_name=" + baby_name
				+ ", first_apgar_score=" + first_apgar_score + ", second_apgar_score=" + second_apgar_score
				+ ", outcome_of_delivery=" + outcome_of_delivery + ", cause_of_death=" + cause_of_death + ", sex=" + sex
				+ ", number_of_baby=" + number_of_baby + ", resuscitation=" + resuscitation + ", condition_of_baby="
				+ condition_of_baby + ", head_circumference=" + head_circumference + ", full_length=" + full_length
				+ ", congenital=" + congenital + ", type_of_abnormality=" + type_of_abnormality + ", complication="
				+ complication + ", date_of_delivery=" + date_of_delivery + "]";
	}
	
	
	
	
	

}
