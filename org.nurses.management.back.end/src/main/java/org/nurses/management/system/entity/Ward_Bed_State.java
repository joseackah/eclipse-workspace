package org.nurses.management.system.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Ward_Bed_State {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	private String ward_name;
	private Integer total_admission;
	private Integer total_discharge;
	private Integer total_trans_in;
	private Integer total_trans_out;
	private Integer total_deaths;
	private Integer total_critical_ill;
	private Integer total_floor_patient;
	private Integer total_absconded;
	private Integer total_insured;
	private Integer total_non_insured;
	private Integer total_remain_at_midnight;
	private String nurse_incharge;
	
	
	public Ward_Bed_State() {
		super();
		// TODO Auto-generated constructor stub
	}


	


		public Ward_Bed_State(Integer id, Date date, String ward_name, Integer total_admission, Integer total_trans_in,
			Integer total_trans_out, Integer total_deaths, Integer total_critical_ill, Integer total_floor_patient,
			Integer total_absconded, Integer total_insured, Integer total_non_insured, Integer total_discharge,
			Integer total_remain_at_midnight, String nurse_incharge) {
		super();
		this.id = id;
		this.date = date;
		this.ward_name = ward_name;
		this.total_admission = total_admission;
		this.total_trans_in = total_trans_in;
		this.total_trans_out = total_trans_out;
		this.total_deaths = total_deaths;
		this.total_critical_ill = total_critical_ill;
		this.total_floor_patient = total_floor_patient;
		this.total_absconded = total_absconded;
		this.total_insured = total_insured;
		this.total_non_insured = total_non_insured;
		this.total_remain_at_midnight = total_remain_at_midnight;
		this.total_discharge = total_discharge;
		this.nurse_incharge = nurse_incharge;
		
	}










	public String getNurse_incharge() {
			return nurse_incharge;
		}





		public void setNurse_incharge(String nurse_incharge) {
			this.nurse_incharge = nurse_incharge;
		}





	public String getWard_name() {
			return ward_name;
		}





		public void setWard_name(String ward_name) {
			this.ward_name = ward_name;
		}





		public Integer getTotal_discharge() {
			return total_discharge;
		}





		public void setTotal_discharge(Integer total_discharge) {
			this.total_discharge = total_discharge;
		}





	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getTotal_admission() {
		return total_admission;
	}


	public void setTotal_admission(Integer total_admission) {
		this.total_admission = total_admission;
	}


	public Integer getTotal_trans_in() {
		return total_trans_in;
	}


	public void setTotal_trans_in(Integer total_trans_in) {
		this.total_trans_in = total_trans_in;
	}


	public Integer getTotal_trans_out() {
		return total_trans_out;
	}


	public void setTotal_trans_out(Integer total_trans_out) {
		this.total_trans_out = total_trans_out;
	}


	public Integer getTotal_deaths() {
		return total_deaths;
	}


	public void setTotal_deaths(Integer total_deaths) {
		this.total_deaths = total_deaths;
	}


	public Integer getTotal_critical_ill() {
		return total_critical_ill;
	}


	public void setTotal_critical_ill(Integer total_critical_ill) {
		this.total_critical_ill = total_critical_ill;
	}


	public Integer getTotal_floor_patient() {
		return total_floor_patient;
	}


	public void setTotal_floor_patient(Integer total_floor_patient) {
		this.total_floor_patient = total_floor_patient;
	}


	public Integer getTotal_absconded() {
		return total_absconded;
	}


	public void setTotal_absconded(Integer total_absconded) {
		this.total_absconded = total_absconded;
	}


	public Integer getTotal_insured() {
		return total_insured;
	}


	public void setTotal_insured(Integer total_insured) {
		this.total_insured = total_insured;
	}


	public Integer getTotal_non_insured() {
		return total_non_insured;
	}


	public void setTotal_non_insured(Integer total_non_insured) {
		this.total_non_insured = total_non_insured;
	}


	public Integer getTotal_remain_at_midnight() {
		return total_remain_at_midnight;
	}


	public void setTotal_remain_at_midnight(Integer total_remain_at_midnight) {
		this.total_remain_at_midnight = total_remain_at_midnight;
	}


	@Override
	public String toString() {
		return "Ward_Bed_State [id=" + id + ", date=" + date + ", ward_name=" + ward_name + ", total_admission="
				+ total_admission + ", total_discharge=" + total_discharge + ", total_trans_in=" + total_trans_in
				+ ", total_trans_out=" + total_trans_out + ", total_deaths=" + total_deaths + ", total_critical_ill="
				+ total_critical_ill + ", total_floor_patient=" + total_floor_patient + ", total_absconded="
				+ total_absconded + ", total_insured=" + total_insured + ", total_non_insured=" + total_non_insured
				+ ", total_remain_at_midnight=" + total_remain_at_midnight + ", nurse_incharge=" + nurse_incharge + "]";
	}
	
	
	
	
	

}
