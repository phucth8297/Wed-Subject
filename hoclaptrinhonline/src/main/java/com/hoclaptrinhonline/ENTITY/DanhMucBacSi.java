package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "DanhMucBacSi" database table.
 * 
 */
@Entity
@Table(name="\"DanhMucBacSi\"")
@NamedQuery(name="DanhMucBacSi.findAll", query="SELECT d FROM DanhMucBacSi d")
public class DanhMucBacSi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenBacSi\"")
	private String tenBacSi;

	public DanhMucBacSi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenBacSi() {
		return this.tenBacSi;
	}

	public void setTenBacSi(String tenBacSi) {
		this.tenBacSi = tenBacSi;
	}

}