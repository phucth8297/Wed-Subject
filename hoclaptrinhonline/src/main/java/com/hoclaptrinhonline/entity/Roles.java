package com.hoclaptrinhonline.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "ROLES")
public class Roles {
	
	@Id
	public String id_role;
	public String name;
	
	@ManyToMany(mappedBy = "role", fetch = FetchType.EAGER)
	Set<User> user = new HashSet<User>() ;
	public Set<User> getUser() {
		return user;
	}
	public void setUser(Set<User> user) {
		this.user = user;
	}
	public String getId_role() {
		return id_role;
	}
	public void setId_role(String id_role) {
		this.id_role = id_role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
