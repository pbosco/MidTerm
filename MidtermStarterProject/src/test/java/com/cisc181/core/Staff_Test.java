package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalary() {
		//fail("Not yet implemented");
		
		//ArrayList for the test
		ArrayList <Staff >testStaff = new ArrayList<Staff>();
		
		//created Staff
		Staff Staff1 = new Staff("Peyton", "Frederick", "Bosco",new Date(), "203 Freedom Drive",
				"1234567890", "pbosco@udel.edu", "Monday 1-2", 1, 100, new Date(), eTitle.DR );
		Staff Staff2 = new Staff("Dawson","Anthony", "Bosco", new Date(), "203 Freedom Drive",
				"2345678901", "dbosco@udel.edu", "Monday 2-3", 2, 50, new Date(), eTitle.DR);
		Staff Staff3 = new Staff("Matt", "John", "Lesyk", new Date(), "32 Street Road",
				"0123456789", "mlesyk@udel.edu", "Tuesday 11-12", 3, 60, new Date(), eTitle.DR);
		Staff Staff4 = new Staff("Rod", "Andrew", "Bradbury", new Date(), "75 Road Road",
				"1111111111", "rbury@udel.edu", "Wednesday 3-4", 4, 65, new Date(), eTitle.MR);
		Staff Staff5 = new Staff("Sarah", "Elizabeth", "Cifone", new Date(), "64 Dogwood Street",
				"2222222222", "scifone@udel.edu", "Thursday 1-2", 5, 70, new Date(), eTitle.MRS);
		
		//adding the staff to the arraylist
		
		testStaff.add(Staff1);
		testStaff.add(Staff2);
		testStaff.add(Staff3);
		testStaff.add(Staff4);
		testStaff.add(Staff5);
		
		double totalSalary = 0;
		//Loop through array list to calculate total salary of staff
		for(int i = 0; i < testStaff.size(); i++){
			
			totalSalary = totalSalary + salary;
		}
		//calculate average salary and the assertTrue
		double averageSalary = totalSalary / testStaff.size();
		assertTrue(averageSalary == 69);
		
	}
	
	@Test
	public void testInvalidBirthday(){
		/*create staff with birthday in future
		 * 
		 */
		try{
		Staff Staff1 = new Staff("Peyton", "Frederick", "Bosco",new Date(20200916), "203 Freedom Drive",
				"1234567890", "pbosco@udel.edu", "Monday 1-2", 1, 100, new Date(), eTitle.DR );
		} catch{ 
			IllegalArgumentException("Can't be born in the future");
		}
		finally{
			System.out.println("test complete");
		}
		}
		//This should get the invalid parameter exception
	
	
	@Test
	public void testInvalidPhone(){
		//create staff with too short of a phone number
		try{
			Staff Staff1 = new Staff("Peyton", "Frederick", "Bosco",new Date(20200916), "203 Freedom Drive",
				"1234567", "pbosco@udel.edu", "Monday 1-2", 1, 100, new Date(), eTitle.DR );
		} catch{
			IllegalFormatException("Please fix the phone number");
		}
		finally{
			System.out.println("test complete");
		}
		
		//this should get the phone number formatting exception
	}

}
