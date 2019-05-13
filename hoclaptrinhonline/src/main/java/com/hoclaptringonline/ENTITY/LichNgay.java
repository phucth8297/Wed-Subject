package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "LichNgay" database table.
 * 
 */
@Entity
@Table(name="\"LichNgay\"")
@NamedQuery(name="LichNgay.findAll", query="SELECT l FROM LichNgay l")
public class LichNgay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenThu\"")
	private String tenThu;

	public LichNgay() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenThu() {
		return this.tenThu;
	}

	public void setTenThu(String tenThu) {
		this.tenThu = tenThu;
	}

}