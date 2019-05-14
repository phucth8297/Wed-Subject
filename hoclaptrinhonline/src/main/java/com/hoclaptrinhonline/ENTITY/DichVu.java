package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "DichVu" database table.
 * 
 */
@Entity
@Table(name="\"DichVu\"")
@NamedQuery(name="DichVu.findAll", query="SELECT d FROM DichVu d")
public class DichVu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"MoTa\"")
	private String moTa;

	public DichVu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}