package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "NoiDungTinh" database table.
 * 
 */
@Entity
@Table(name="\"NoiDungTinh\"")
@NamedQuery(name="NoiDungTinh.findAll", query="SELECT n FROM NoiDungTinh n")
public class NoiDungTinh implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id;

	@Column(name="\"TenNoiDung\"")
	private String tenNoiDung;

	public NoiDungTinh() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenNoiDung() {
		return this.tenNoiDung;
	}

	public void setTenNoiDung(String tenNoiDung) {
		this.tenNoiDung = tenNoiDung;
	}

}