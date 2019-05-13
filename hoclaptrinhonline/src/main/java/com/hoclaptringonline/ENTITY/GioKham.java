package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


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

}