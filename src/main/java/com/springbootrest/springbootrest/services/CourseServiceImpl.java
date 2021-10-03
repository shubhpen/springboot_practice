package com.springbootrest.springbootrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootrest.springbootrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {

		list = new ArrayList<>();

		list.add(new Course(1, "java", "this is java course"));
		list.add(new Course(2, "react", "this is react course"));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

	@Override
	public Course getCourse(int id) {
		Course c = null;

		for (Course course : list) {
			if (course.getId() == id) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course postCourse(Course course) {

		list.add(course);
		return course;
	}

	@Override
	public Course modifyCourse(int id, Course update_course) {

		for (Course course : list) {
			if (course.getId() == id) {
				course.setDescription(update_course.getDescription());
				course.setTitle(update_course.getTitle());
				break;
			}
		}
		
		return update_course;
	}

	@Override
	public String deleteCourse(int id) {
		
		for(Course c: list) {
			int i=0;
			if(c.getId()==id) {
				list.remove(i);
			}
			i++;
		}
		
		return "Course with ID "+ id +" Deleted" ;
	}

}
