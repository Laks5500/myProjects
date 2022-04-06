package com.CourseManagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	int Id;
	String course;
	String fee;
	public Course() {
		
	}
	public Course(int id, String course, String fee) {
		super();
		Id = id;
		this.course = course;
		this.fee = fee;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", course=" + course + ", fee=" + fee + "]";
	}
	
}
