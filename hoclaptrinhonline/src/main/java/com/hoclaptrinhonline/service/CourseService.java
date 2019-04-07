package com.hoclaptrinhonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoclaptrinhonline.DAO.CourseDAO;
import com.hoclaptrinhonline.Imp.CourseImp;
import com.hoclaptrinhonline.entity.Course;
import com.hoclaptrinhonline.entity.TypeCourse;
@Service
public class CourseService implements CourseImp{

	@Autowired
	CourseDAO courseDAO;
	
	public List<TypeCourse> loadListCourse(int start) {
		
		return courseDAO.loadListCourse(start);
	}

	public List<TypeCourse> findAll(Integer offset, Integer maxResults) {
		
		return courseDAO.findAll(offset, maxResults);
	}

	public long countAll() {
		return courseDAO.countAll();
	}

	public List<Course> findAllCourse(Integer offset, Integer maxResults) {
		return courseDAO.findAllCourse(offset, maxResults);
	}

	public long countAllCoure() {
		return courseDAO.countAllCoure();
	}

	public List<Course> getCourseById(int idTypeCourse) {
		
		return courseDAO.getCourseById(idTypeCourse);
	}

	public boolean addTypeCourse(TypeCourse typeCourse) {
		courseDAO.addTypeCourse(typeCourse);
		return false;
	}

	public boolean deleteTypeCourse(TypeCourse typeCourse) {
		courseDAO.deleteTypeCourse(typeCourse);
		return false;
	}

	

}
