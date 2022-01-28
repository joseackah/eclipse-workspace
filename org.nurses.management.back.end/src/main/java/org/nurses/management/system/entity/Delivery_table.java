package org.nurses.management.system.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery_table {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer delivery_id;
	private String name;
	private String gestation_of_pregnancy;
	private Date date_of_delivery;
	private String time_of_delivery;
	private Date date_labour_started;
	private String duration_of_delivery;
	private String time_of_placenta;
	private String condition_of_mother;
	private String condition_of_placenta;
	private String type_of_delivery;
	private String indication_of_cs;
	private String cs_conducted_by;
	private String state_of_perineum;
	private String midwife_conducting_delivery;
	private String assisstant;
	private String complication_of_delivery;
	
	
	
	public Delivery_table() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Delivery_table(Integer delivery_id, String name, String gestation_of_pregnancy,
			Date date_of_delivery, String time_of_delivery, Date date_labour_started,
			String duration_of_delivery, String time_of_placenta, String condition_of_mother,
			String condition_of_placenta, String type_of_delivery, String indication_of_cs, String cs_conducted_by,
			String state_of_perineum, String midwife_conducting_delivery, String assisstant,
			String complication_of_delivery) {
		super();
		this.delivery_id = delivery_id;
		this.name = name;
		this.gestation_of_pregnancy = gestation_of_pregnancy;
		this.date_of_delivery = date_of_delivery;
		this.time_of_delivery = time_of_delivery;
		this.date_labour_started = date_labour_started;
		this.duration_of_delivery = duration_of_delivery;
		this.time_of_placenta = time_of_placenta;
		this.condition_of_mother = condition_of_mother;
		this.condition_of_placenta = condition_of_placenta;
		this.type_of_delivery = type_of_delivery;
		this.indication_of_cs = indication_of_cs;
		this.cs_conducted_by = cs_conducted_by;
		this.state_of_perineum = state_of_perineum;
		this.midwife_conducting_delivery = midwife_conducting_delivery;
		this.assisstant = assisstant;
		this.complication_of_delivery = complication_of_delivery;
	}



	public Integer getDelivery_id() {
		return delivery_id;
	}



	public void setDelivery_id(Integer delivery_id) {
		this.delivery_id = delivery_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGestation_of_pregnancy() {
		return gestation_of_pregnancy;
	}



	public void setGestation_of_pregnancy(String gestation_of_pregnancy) {
		this.gestation_of_pregnancy = gestation_of_pregnancy;
	}



	public Date getDate_of_delivery() {
		return date_of_delivery;
	}



	public void setDate_of_delivery(Date date_of_delivery) {
		this.date_of_delivery = date_of_delivery;
	}



	public String getTime_of_delivery() {
		return time_of_delivery;
	}



	public void setTime_of_delivery(String time_of_delivery) {
		this.time_of_delivery = time_of_delivery;
	}



	public Date getDate_labour_started() {
		return date_labour_started;
	}



	public void setDate_labour_started(Date date_labour_started) {
		this.date_labour_started = date_labour_started;
	}



	public String getDuration_of_delivery() {
		return duration_of_delivery;
	}



	public void setDuration_of_delivery(String duration_of_delivery) {
		this.duration_of_delivery = duration_of_delivery;
	}



	public String getTime_of_placenta() {
		return time_of_placenta;
	}



	public void setTime_of_placenta(String time_of_placenta) {
		this.time_of_placenta = time_of_placenta;
	}



	public String getCondition_of_mother() {
		return condition_of_mother;
	}



	public void setCondition_of_mother(String condition_of_mother) {
		this.condition_of_mother = condition_of_mother;
	}



	public String getCondition_of_placenta() {
		return condition_of_placenta;
	}



	public void setCondition_of_placenta(String condition_of_placenta) {
		this.condition_of_placenta = condition_of_placenta;
	}



	public String getType_of_delivery() {
		return type_of_delivery;
	}



	public void setType_of_delivery(String type_of_delivery) {
		this.type_of_delivery = type_of_delivery;
	}



	public String getIndication_of_cs() {
		return indication_of_cs;
	}



	public void setIndication_of_cs(String indication_of_cs) {
		this.indication_of_cs = indication_of_cs;
	}



	public String getCs_conducted_by() {
		return cs_conducted_by;
	}



	public void setCs_conducted_by(String cs_conducted_by) {
		this.cs_conducted_by = cs_conducted_by;
	}



	public String getState_of_perineum() {
		return state_of_perineum;
	}



	public void setState_of_perineum(String state_of_perineum) {
		this.state_of_perineum = state_of_perineum;
	}



	public String getMidwife_conducting_delivery() {
		return midwife_conducting_delivery;
	}



	public void setMidwife_conducting_delivery(String midwife_conducting_delivery) {
		this.midwife_conducting_delivery = midwife_conducting_delivery;
	}



	public String getAssisstant() {
		return assisstant;
	}



	public void setAssisstant(String assisstant) {
		this.assisstant = assisstant;
	}



	public String getComplication_of_delivery() {
		return complication_of_delivery;
	}



	public void setComplication_of_delivery(String complication_of_delivery) {
		this.complication_of_delivery = complication_of_delivery;
	}



	@Override
	public String toString() {
		return "Delivery_table [delivery_id=" + delivery_id + ", name=" + name + ", gestation_of_pregnancy="
				+ gestation_of_pregnancy + ", date_of_delivery=" + date_of_delivery + ", time_of_delivery="
				+ time_of_delivery + ", date_labour_started=" + date_labour_started + ", duration_of_delivery="
				+ duration_of_delivery + ", time_of_placenta=" + time_of_placenta + ", condition_of_mother="
				+ condition_of_mother + ", condition_of_placenta=" + condition_of_placenta + ", type_of_delivery="
				+ type_of_delivery + ", indication_of_cs=" + indication_of_cs + ", cs_conducted_by=" + cs_conducted_by
				+ ", state_of_perineum=" + state_of_perineum + ", midwife_conducting_delivery="
				+ midwife_conducting_delivery + ", assisstant=" + assisstant + ", complication_of_delivery="
				+ complication_of_delivery + "]";
	}
	
	
	
	
	

}
