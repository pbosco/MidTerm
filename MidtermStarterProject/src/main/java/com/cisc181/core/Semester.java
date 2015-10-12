package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester extends Course{
	//attributes
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	//constructor
	public Semester(){
		super();
	}
	
	//getters
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public Date getStartDate(){
		return StartDate;
	}
	
	public Date EndDate(){
		return EndDate;
	}
	
	//setters
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}
	
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}
	

}
