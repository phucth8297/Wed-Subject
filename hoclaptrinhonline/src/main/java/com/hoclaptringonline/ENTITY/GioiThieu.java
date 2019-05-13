package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "GioiThieu" database table.
 * 
 */
@Entity
@Table(name="\"GioiThieu\"")
@NamedQuery(name="GioiThieu.findAll", query="SELECT g FROM GioiThieu g")
public class GioiThieu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenGioiThieu\"")
	private String tenGioiThieu;

	public GioiThieu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenGioiThieu() {
		return this.tenGioiThieu;
	}

	public void setTenGioiThieu(String tenGioiThieu) {
		this.tenGioiThieu = tenGioiThieu;
	}

}