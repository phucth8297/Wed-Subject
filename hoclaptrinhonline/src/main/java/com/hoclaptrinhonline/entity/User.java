package com.hoclaptrinhonline.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity(name="USERS")
public class User {
	@Id
	public String id_email;
	public String name;
	public String addr;
	public String phone;
	public String pass;
	public String reset_token;
	
	public String getReset_token() {
		return reset_token;
	}

	public void setReset_token(String reset_token) {
		this.reset_token = reset_token;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name ="USER_ROLE",
	joinColumns= {@JoinColumn(name="id_email", referencedColumnName="id_email")},
	inverseJoinColumns= {@JoinColumn(name="id_role", referencedColumnName="id_role")}
	)
	Set<Roles> role  ;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name ="REGISTER",
	joinColumns= {@JoinColumn(name="id_email", referencedColumnName="id_email")},
	inverseJoinColumns= {@JoinColumn(name="id_course", referencedColumnName="id_course")}
	)
	
	Set<Course> listCourse;
	public Set<Roles> getRole() {
		return role;
	}

	public void setRole(Set<Roles> role) {
		this.role = role;
	}

	public String getId_email() {
		return id_email;
	}

	public void setId_email(String id_email) {
		this.id_email = id_email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Set<Course> getListCourse() {
		return listCourse;
	}

	public void setListCourse(Set<Course> listCourse) {
		this.listCourse = listCourse;
	}

	
	
	
}
