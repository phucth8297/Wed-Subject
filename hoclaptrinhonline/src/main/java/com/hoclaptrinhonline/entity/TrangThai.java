package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TrangThai" database table.
 * 
 */
@Entity
@Table(name="\"TrangThai\"")
@NamedQuery(name="TrangThai.findAll", query="SELECT t FROM TrangThai t")
public class TrangThai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoaiTrangThai\"")
	private String tenLoaiTrangThai;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="trangThai")
	private List<HenKhamBenh> henKhamBenhs;

	public TrangThai() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoaiTrangThai() {
		return this.tenLoaiTrangThai;
	}

	public void setTenLoaiTrangThai(String tenLoaiTrangThai) {
		this.tenLoaiTrangThai = tenLoaiTrangThai;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setTrangThai(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setTrangThai(null);

		return henKhamBenh;
	}

}