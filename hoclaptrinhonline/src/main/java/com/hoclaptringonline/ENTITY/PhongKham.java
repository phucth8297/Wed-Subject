package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "PhongKham" database table.
 * 
 */
@Entity
@Table(name="\"PhongKham\"")
@NamedQuery(name="PhongKham.findAll", query="SELECT p FROM PhongKham p")
public class PhongKham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"GhiChuThem\"")
	private String ghiChuThem;

	@Column(name="\"HenKham\"")
	private boolean henKham;

	@Column(name="\"TenPhongKham\"")
	private String tenPhongKham;

	public PhongKham() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGhiChuThem() {
		return this.ghiChuThem;
	}

	public void setGhiChuThem(String ghiChuThem) {
		this.ghiChuThem = ghiChuThem;
	}

	public boolean getHenKham() {
		return this.henKham;
	}

	public void setHenKham(boolean henKham) {
		this.henKham = henKham;
	}

	public String getTenPhongKham() {
		return this.tenPhongKham;
	}

	public void setTenPhongKham(String tenPhongKham) {
		this.tenPhongKham = tenPhongKham;
	}

}