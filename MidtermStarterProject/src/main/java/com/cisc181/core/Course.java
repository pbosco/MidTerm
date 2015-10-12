package com.cisc181.core;

import java.util.UUID;

public class Course extends Student{
	//attributes
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	//no arg constructor
	
	public Course(){
		super();
	}
	//getters
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}
	
	//setters
	
	public void setCourseID(UUID CourseID){
	    this.CourseID = CourseID;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}

}
