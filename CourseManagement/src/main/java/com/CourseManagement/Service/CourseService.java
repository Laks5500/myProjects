package com.CourseManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CourseManagement.Entity.Course;
import com.CourseManagement.Interface.CourseInterface;
@Service
public class CourseService  {

	@Autowired
	CourseInterface courseInterface;

	public List<Course> GetCourse() {
		
		return courseInterface.findAll();
	}

	public Course saveCourse(Course course) {
		
		return courseInterface.save(course);
	}

	public Course updateCourse(Course course) {
		
		return courseInterface.save(course);
	}

	public Optional<Course> getById(Integer courseId) {
		
		return courseInterface.findById(courseId);
	}

	

	
	
	
}
