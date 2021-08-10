package com.hospital.staff.bunglaw.allocation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hospital.staff.bunglaw.allocation.entities.BunglawSlot;
import com.hospital.staff.bunglaw.allocation.entities.StaffRoll;
import com.hospital.staff.bunglaw.allocation.repos.BunglawSlotRepository;
import com.hospital.staff.bunglaw.allocation.repos.StaffRollRepository;

@SpringBootTest
class SpringdatamappinghospitalbunglawApplicationTests {
	
	@Autowired
	StaffRollRepository staff;
	
	@Autowired
	BunglawSlotRepository bunglaw;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testStaffBunglaw() {
		StaffRoll staffRoll	= new StaffRoll();
		StaffRoll staffRoll1	= new StaffRoll();
		StaffRoll staffRoll2	= new StaffRoll();
		StaffRoll staffRoll3	= new StaffRoll();
		StaffRoll staffRoll4	= new StaffRoll();
		
		BunglawSlot bunglawSlot = new BunglawSlot();
		BunglawSlot bunglawSlot1 = new BunglawSlot();
		BunglawSlot bunglawSlot2 = new BunglawSlot();
		BunglawSlot bunglawSlot3 = new BunglawSlot();
		BunglawSlot bunglawSlot4 = new BunglawSlot();
		
		staffRoll.setStaffFirstName("James");
		staffRoll.setStafLastName("Daagati");
		staffRoll.setDepartment("Accounting");
		
		staffRoll1.setStaffFirstName("Paul");
		staffRoll1.setStafLastName("John");
		staffRoll1.setDepartment("Nursing");
		
		staffRoll2.setStaffFirstName("Jude");
		staffRoll2.setStafLastName("Ayamba");
		staffRoll2.setDepartment("Pharmacy");
		
		staffRoll3.setStaffFirstName("Moses");
		staffRoll3.setStafLastName("Asante");
		staffRoll3.setDepartment("Medicine");
		
		staffRoll4.setStaffFirstName("John-Paul");
		staffRoll4.setStafLastName("Grace");
		staffRoll4.setDepartment("Security");
		
		bunglawSlot.setBunglawLocation("lowcust");
		bunglawSlot.setBunglawNumber("BUN-JH001");
		bunglawSlot.setNumberOfRooms(4);
		
		bunglawSlot1.setBunglawLocation("lowcust");
		bunglawSlot1.setBunglawNumber("BUN-JH005");
		bunglawSlot1.setNumberOfRooms(3);
		
		bunglawSlot2.setBunglawLocation("lowcust");
		bunglawSlot2.setBunglawNumber("BUN-JH014");
		bunglawSlot2.setNumberOfRooms(6);
		
		bunglawSlot3.setBunglawLocation("lowcust");
		bunglawSlot3.setBunglawNumber("BUN-JH045");
		bunglawSlot3.setNumberOfRooms(3);
		
		bunglawSlot4.setBunglawLocation("lowcust");
		bunglawSlot4.setBunglawNumber("BUN-JH008");
		bunglawSlot4.setNumberOfRooms(5);
		
		staffRoll.setBunglawSlot(bunglawSlot);
		staffRoll1.setBunglawSlot(bunglawSlot1);
		staffRoll2.setBunglawSlot(bunglawSlot2);
		staffRoll3.setBunglawSlot(bunglawSlot3);
		staffRoll4.setBunglawSlot(bunglawSlot4);
		
		bunglaw.save(bunglawSlot);
		bunglaw.save(bunglawSlot1);
		bunglaw.save(bunglawSlot2);
		bunglaw.save(bunglawSlot3);
		bunglaw.save(bunglawSlot4);
		
		staff.save(staffRoll);
		staff.save(staffRoll1);
		staff.save(staffRoll2);
		staff.save(staffRoll3);
		staff.save(staffRoll4);
	}

}
