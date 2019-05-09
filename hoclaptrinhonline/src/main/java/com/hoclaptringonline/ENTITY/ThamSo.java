package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ThamSo" database table.
 * 
 */
@Entity
@Table(name="\"ThamSo\"")
@NamedQuery(name="ThamSo.findAll", query="SELECT t FROM ThamSo t")
public class ThamSo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Khoa\"")
	private String khoa;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"MatKhau\"")
	private String matKhau;

	public ThamSo() {
	}

	public String getKhoa() {
		return this.khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

}