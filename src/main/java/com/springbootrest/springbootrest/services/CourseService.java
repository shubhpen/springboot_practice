package com.springbootrest.springbootrest.services;
import java.util.List;

import com.springbootrest.springbootrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(int id);
	public Course postCourse(Course course);
	public Course modifyCourse(int id, Course course);
	public String deleteCourse(int id);

}
