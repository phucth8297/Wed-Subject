package com.hoclaptrinhonline.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity (name = "TYPEPAY")

public class TypePay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id_type_pay ;
	String name ;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_type_pay")
	Set<Pay> listPay;
	public Set<Pay> getListPay() {
		return listPay;
	}
	public void setListPay(Set<Pay> listPay) {
		this.listPay = listPay;
	}
	public int getId_type_pay() {
		return id_type_pay;
	}
	public void setId_type_pay(int id_type_pay) {
		this.id_type_pay = id_type_pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
