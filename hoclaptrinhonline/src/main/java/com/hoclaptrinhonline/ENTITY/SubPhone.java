package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "SubPhone" database table.
 * 
 */
@Entity
@Table(name="\"SubPhone\"")
@NamedQuery(name="SubPhone.findAll", query="SELECT s FROM SubPhone s")
public class SubPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Master\"")
	private boolean master;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"SoDienThoai\"")
	private String soDienThoai;

	public SubPhone() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getMaster() {
		return this.master;
	}

	public void setMaster(boolean master) {
		this.master = master;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

}