package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList<Course> Courses = new ArrayList<Course>();
		ArrayList<Object> Semester = new ArrayList<Object>();
		ArrayList<Section> Section = new ArrayList<Section>();
		ArrayList<Student> Students = new ArrayList<Student>();
		
		//Courses
		Course Course1 = new Course();
		Course Course2 = new Course();
		Course Course3 = new Course();
		Courses.add(Course1);
		Courses.add(Course2);
		Courses.add(Course3);
		
		//Semesters
		Semester Fall = new Semester();
		Semester Spring = new Semester();
		Semester.add(Fall);
		Semester.add(Spring);
		
		//Sections
		Section Section1 = new Section();
		Section Section2 = new Section();
		Section Section3 = new Section();
		Section Section4 = new Section();
		Section Section5 = new Section();
		Section Section6 = new Section();
		Section.add(Section1);
		Section.add(Section2);
		Section.add(Section3);
		Section.add(Section4);
		Section.add(Section5);
		Section.add(Section6);
		
		//Students
		Student Student1 = new Student();
		Student Student2 = new Student();
		Student Student3 = new Student();
		Student Student4 = new Student();
		Student Student5 = new Student();
		Student Student6 = new Student();
		Student Student7 = new Student();
		Student Student8 = new Student();
		Student Student9 = new Student();
		Student Student10 = new Student();
		Students.add(Student1);
		Students.add(Student2);
		Students.add(Student3);
		Students.add(Student4);
		Students.add(Student5);
		Students.add(Student6);
		Students.add(Student7);
		Students.add(Student8);
		Students.add(Student9);
		Students.add(Student10);
		
		
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
	public void test() {
		//fail("Not yet implemented");
		
		
		
		
		
		
	}

}
