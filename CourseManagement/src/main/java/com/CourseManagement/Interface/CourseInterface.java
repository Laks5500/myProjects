package com.CourseManagement.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.CourseManagement.Entity.Course;

public interface CourseInterface  extends  JpaRepository<Course, Integer>, CrudRepository<Course, Integer>{

}
