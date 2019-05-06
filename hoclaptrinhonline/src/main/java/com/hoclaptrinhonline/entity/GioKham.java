package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "GioKham" database table.
 * 
 */
@Entity
@Table(name="\"GioKham\"")
@NamedQuery(name="GioKham.findAll", query="SELECT g FROM GioKham g")
public class GioKham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Gio\"")
	private String gio;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="gioKham")
	private List<HenKhamBenh> henKhamBenhs;

	public GioKham() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGio() {
		return this.gio;
	}

	public void setGio(String gio) {
		this.gio = gio;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setGioKham(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setGioKham(null);

		return henKhamBenh;
	}

}