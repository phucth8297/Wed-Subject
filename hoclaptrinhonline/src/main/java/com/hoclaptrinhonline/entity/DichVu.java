package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to DichVuChiTiet
	@OneToMany(mappedBy="dichVu")
	private List<DichVuChiTiet> dichVuChiTiets;

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

	public List<DichVuChiTiet> getDichVuChiTiets() {
		return this.dichVuChiTiets;
	}

	public void setDichVuChiTiets(List<DichVuChiTiet> dichVuChiTiets) {
		this.dichVuChiTiets = dichVuChiTiets;
	}

	public DichVuChiTiet addDichVuChiTiet(DichVuChiTiet dichVuChiTiet) {
		getDichVuChiTiets().add(dichVuChiTiet);
		dichVuChiTiet.setDichVu(this);

		return dichVuChiTiet;
	}

	public DichVuChiTiet removeDichVuChiTiet(DichVuChiTiet dichVuChiTiet) {
		getDichVuChiTiets().remove(dichVuChiTiet);
		dichVuChiTiet.setDichVu(null);

		return dichVuChiTiet;
	}

}