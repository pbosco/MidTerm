package com.cisc181.core;

import java.util.UUID;

public class Enrollment extends Section {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//no arg constructor
	
	private Enrollment(){
		
	}
	
	//2 arg constructor
	
	public Enrollment(UUID StudentID, UUID SectionID){
		super(StudentID, SectionID);
		this.EnrollmentID = EnrollmentID;
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		
		
	}
	
	//getters
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public UUID getStudentID(){
		return StudentID;
	}
	
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
	
	public double getGrade(){
		return Grade;
	}
	
	//setters
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public void setStudentID(UUID StudentID){
		this.StudentID = StudentID;
	}
	
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	

}
