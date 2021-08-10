package com.hospital.staff.bunglaw.allocation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bunglaw_table")
public class BunglawSlot {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bunglawId;
	private String bunglawNumber;
	private String bunglawLocation;
	private int numberOfRooms;
	public int getBunglawId() {
		return bunglawId;
	}
	public void setBunglawId(int bunglawId) {
		this.bunglawId = bunglawId;
	}
	public String getBunglawNumber() {
		return bunglawNumber;
	}
	public void setBunglawNumber(String bunglawNumber) {
		this.bunglawNumber = bunglawNumber;
	}
	public String getBunglawLocation() {
		return bunglawLocation;
	}
	public void setBunglawLocation(String bunglawLocation) {
		this.bunglawLocation = bunglawLocation;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	@Override
	public String toString() {
		return "BunglawSlot [bunglawId=" + bunglawId + ", bunglawNumber=" + bunglawNumber + ", bunglawLocation="
				+ bunglawLocation + ", numberOfRooms=" + numberOfRooms + "]";
	}

	
}
