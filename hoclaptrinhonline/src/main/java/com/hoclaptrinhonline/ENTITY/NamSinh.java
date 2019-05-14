package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "NamSinh" database table.
 * 
 */
@Entity
@Table(name="\"NamSinh\"")
@NamedQuery(name="NamSinh.findAll", query="SELECT n FROM NamSinh n")
public class NamSinh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Nam\"")
	private int nam;

	public NamSinh() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNam() {
		return this.nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

}