package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "TrangThai" database table.
 * 
 */
@Entity
@Table(name="\"TrangThai\"")
@NamedQuery(name="TrangThai.findAll", query="SELECT t FROM TrangThai t")
public class TrangThai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoaiTrangThai\"")
	private String tenLoaiTrangThai;

	public TrangThai() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoaiTrangThai() {
		return this.tenLoaiTrangThai;
	}

	public void setTenLoaiTrangThai(String tenLoaiTrangThai) {
		this.tenLoaiTrangThai = tenLoaiTrangThai;
	}

}