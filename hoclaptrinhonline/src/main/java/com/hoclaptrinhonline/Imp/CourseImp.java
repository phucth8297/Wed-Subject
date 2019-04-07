package com.hoclaptrinhonline.Imp;

import java.io.Serializable;
import java.util.List;

import com.hoclaptrinhonline.entity.Course;
import com.hoclaptrinhonline.entity.TypeCourse;

public interface CourseImp extends Serializable{
public List<TypeCourse> loadListCourse(int start);
public List<TypeCourse> findAll(Integer offset, Integer maxResults);
public long countAll();
public List<Course> findAllCourse(Integer offset, Integer maxResults);
public long countAllCoure();
public List<Course> getCourseById(int idTypeCourse);
public boolean addTypeCourse(TypeCourse typeCourse);
public boolean deleteTypeCourse(TypeCourse typeCourse);
}
