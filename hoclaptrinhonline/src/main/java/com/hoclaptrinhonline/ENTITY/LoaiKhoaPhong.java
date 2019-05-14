package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "LoaiKhoaPhong" database table.
 * 
 */
@Entity
@Table(name="\"LoaiKhoaPhong\"")
@NamedQuery(name="LoaiKhoaPhong.findAll", query="SELECT l FROM LoaiKhoaPhong l")
public class LoaiKhoaPhong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	public LoaiKhoaPhong() {
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