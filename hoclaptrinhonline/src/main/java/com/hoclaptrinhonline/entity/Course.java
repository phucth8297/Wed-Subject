package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity(name = "COURSE")
public class Course implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id_course;
	String name ;
	int id_type_course;
	double price ;
	String id_email ;
	String descr ;
	String linkURL ;
	String imag ;
	String state_course ;
	double promotion;
	
	@ManyToMany(mappedBy = "listCourse", fetch = FetchType.EAGER)
	Set<User> listUser = new HashSet<User>() ;
	public Set<User> getListUser() {
		return listUser;
	}
	public void setListUser(Set<User> listUser) {
		this.listUser = listUser;
	}
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId_type_course() {
		return id_type_course;
	}
	public void setId_type_course(int id_type_course) {
		this.id_type_course = id_type_course;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getId_email() {
		return id_email;
	}
	public void setId_email(String id_email) {
		this.id_email = id_email;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getLinkURL() {
		return linkURL;
	}
	public void setLinkURL(String linkURL) {
		this.linkURL = linkURL;
	}
	public String getImag() {
		return imag;
	}
	public void setImag(String imag) {
		this.imag = imag;
	}
	public String getState_course() {
		return state_course;
	}
	public void setState_course(String state_course) {
		this.state_course = state_course;
	}
	public double getPromotion() {
		return promotion;
	}
	public void setPromotion(double promotion) {
		this.promotion = promotion;
	}
	
	
}
