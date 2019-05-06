package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to GioiThieuChiTiet
	@OneToMany(mappedBy="gioiThieuBean")
	private List<GioiThieuChiTiet> gioiThieuChiTiets;

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

	public List<GioiThieuChiTiet> getGioiThieuChiTiets() {
		return this.gioiThieuChiTiets;
	}

	public void setGioiThieuChiTiets(List<GioiThieuChiTiet> gioiThieuChiTiets) {
		this.gioiThieuChiTiets = gioiThieuChiTiets;
	}

	public GioiThieuChiTiet addGioiThieuChiTiet(GioiThieuChiTiet gioiThieuChiTiet) {
		getGioiThieuChiTiets().add(gioiThieuChiTiet);
		gioiThieuChiTiet.setGioiThieuBean(this);

		return gioiThieuChiTiet;
	}

	public GioiThieuChiTiet removeGioiThieuChiTiet(GioiThieuChiTiet gioiThieuChiTiet) {
		getGioiThieuChiTiets().remove(gioiThieuChiTiet);
		gioiThieuChiTiet.setGioiThieuBean(null);

		return gioiThieuChiTiet;
	}

}