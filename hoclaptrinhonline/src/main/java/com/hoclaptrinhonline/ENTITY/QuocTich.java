package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "QuocTich" database table.
 * 
 */
@Entity
@Table(name="\"QuocTich\"")
@NamedQuery(name="QuocTich.findAll", query="SELECT q FROM QuocTich q")
public class QuocTich implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenQuocGia\"")
	private String tenQuocGia;

	public QuocTich() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenQuocGia() {
		return this.tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}

}