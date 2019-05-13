package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "LoaiHoatDong" database table.
 * 
 */
@Entity
@Table(name="\"LoaiHoatDong\"")
@NamedQuery(name="LoaiHoatDong.findAll", query="SELECT l FROM LoaiHoatDong l")
public class LoaiHoatDong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	public LoaiHoatDong() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoai() {
		return this.tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

}