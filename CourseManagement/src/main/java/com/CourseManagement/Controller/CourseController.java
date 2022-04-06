package com.CourseManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CourseManagement.Entity.Course;
import com.CourseManagement.Service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseService.GetCourse();
	}

	@GetMapping("/course/{courseId}")
	public Optional<Course> getCourse(@PathVariable Integer courseId) {
		return courseService.getById(courseId);
	}

	@PostMapping("/course")
	public Course AddCourses(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}

	@PutMapping("/course")
	public Course updateCourses(Course course) {
		return courseService.updateCourse(course);
	}

//	@DeleteMapping("/employee/{employeeId}")
//	public String deleteCourse(@PathVariable Integer courseId) {
//		courseService.deleteByCourseId(courseId);
//		return "Your Data has been changed";
//	}
}
