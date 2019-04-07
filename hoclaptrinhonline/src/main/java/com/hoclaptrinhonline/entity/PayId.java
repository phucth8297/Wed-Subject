package com.hoclaptrinhonline.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PayId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id_course;
	int id_type_pay ;
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public int getId_type_pay() {
		return id_type_pay;
	}
	public void setId_type_pay(int id_type_pay) {
		this.id_type_pay = id_type_pay;
	}
	
}
