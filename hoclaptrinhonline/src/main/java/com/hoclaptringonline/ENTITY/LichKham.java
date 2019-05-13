package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "LichKham" database table.
 * 
 */
@Entity
@Table(name="\"LichKham\"")
@NamedQuery(name="LichKham.findAll", query="SELECT l FROM LichKham l")
public class LichKham implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LichKhamPK id;

	@Column(name="\"Chieu\"")
	private String chieu;

	@Column(name="\"Sang\"")
	private String sang;

	public LichKham() {
	}

	public LichKhamPK getId() {
		return this.id;
	}

	public void setId(LichKhamPK id) {
		this.id = id;
	}

	public String getChieu() {
		return this.chieu;
	}

	public void setChieu(String chieu) {
		this.chieu = chieu;
	}

	public String getSang() {
		return this.sang;
	}

	public void setSang(String sang) {
		this.sang = sang;
	}

}