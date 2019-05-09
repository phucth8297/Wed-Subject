package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "LoaiTin" database table.
 * 
 */
@Entity
@Table(name="\"LoaiTin\"")
@NamedQuery(name="LoaiTin.findAll", query="SELECT l FROM LoaiTin l")
public class LoaiTin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	//bi-directional many-to-one association to TinTuc
	@OneToMany(mappedBy="loaiTin")
	private List<TinTuc> tinTucs;

	public LoaiTin() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoai() {
		return this.tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public List<TinTuc> getTinTucs() {
		return this.tinTucs;
	}

	public void setTinTucs(List<TinTuc> tinTucs) {
		this.tinTucs = tinTucs;
	}

	public TinTuc addTinTuc(TinTuc tinTuc) {
		getTinTucs().add(tinTuc);
		tinTuc.setLoaiTin(this);

		return tinTuc;
	}

	public TinTuc removeTinTuc(TinTuc tinTuc) {
		getTinTucs().remove(tinTuc);
		tinTuc.setLoaiTin(null);

		return tinTuc;
	}

}