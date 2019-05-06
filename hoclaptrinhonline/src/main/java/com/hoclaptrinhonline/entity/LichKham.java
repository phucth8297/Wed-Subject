package com.hoclaptrinhonline.entity;

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

	//bi-directional many-to-one association to LichNgay
	@ManyToOne
	@JoinColumn(name="\"FK_LichNgay\"")
	private LichNgay lichNgay;

	//bi-directional many-to-one association to PhongKham
	@ManyToOne
	@JoinColumn(name="\"FK_PhongKham\"")
	private PhongKham phongKham;

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

	public LichNgay getLichNgay() {
		return this.lichNgay;
	}

	public void setLichNgay(LichNgay lichNgay) {
		this.lichNgay = lichNgay;
	}

	public PhongKham getPhongKham() {
		return this.phongKham;
	}

	public void setPhongKham(PhongKham phongKham) {
		this.phongKham = phongKham;
	}

}