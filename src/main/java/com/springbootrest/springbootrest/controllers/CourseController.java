package com.springbootrest.springbootrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrest.entities.Course;
import com.springbootrest.springbootrest.services.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;

	@GetMapping("/courses")
	public List<Course> getCourses() {

		return this.service.getCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		
		return service.getCourse(id);
	}
	
	@PostMapping("/courses")
	public Course postCourse(@RequestBody Course course) {
		
		return service.postCourse(course);
	}
	
	@PutMapping("/courses/{id}")
	public Course modifyCourse(@PathVariable int id, @RequestBody Course course) {
		
		return service.modifyCourse(id,course);
	}
	
	@DeleteMapping("/courses/{id}")
	public String deleteCourse(@PathVariable int id) {
		
		return service.deleteCourse(id);
	}
}
