package com.hoclaptrinhonline.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity (name = "TYPECOURSE")
public class TypeCourse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id_type_course ;
	public String name  ;
	public String imag ;
	public String descrip ;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_type_course")
	Set<Course> listCourse ;
	public Set<Course> getListCourse() {
		return listCourse;
	}
	public void setListCourse(Set<Course> listCourse) {
		this.listCourse = listCourse;
	}
	public int getId_type_course() {
		return id_type_course;
	}
	public void setId_type_course(int id_type_course) {
		this.id_type_course = id_type_course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImag() {
		return imag;
	}
	public void setImag(String imag) {
		this.imag = imag;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
}
