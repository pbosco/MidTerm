package com.cisc181.core;

import java.util.UUID;

public class Section extends Semester{
	//attributes
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	//no arg constructor
	public Section(){
		
	}
	
	//constructor
	public Section(UUID ID1, UUID ID2){
		super();
	}
	
	//getters
	public UUID getCourseID(){
		return CourseID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public int getRoomID(){
		return RoomID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	//setters
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
	}
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public void setSemesterID(UUID SectionID){
		 this.SectionID = SectionID;
	}

}
