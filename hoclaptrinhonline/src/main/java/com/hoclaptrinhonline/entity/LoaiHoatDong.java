package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "LoaiHoatDong" database table.
 * 
 */
@Entity
@Table(name="\"LoaiHoatDong\"")
@NamedQuery(name="LoaiHoatDong.findAll", query="SELECT l FROM LoaiHoatDong l")
public class LoaiHoatDong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	//bi-directional many-to-one association to HoatDong
	@OneToMany(mappedBy="loaiHoatDong")
	private List<HoatDong> hoatDongs;

	public LoaiHoatDong() {
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

	public List<HoatDong> getHoatDongs() {
		return this.hoatDongs;
	}

	public void setHoatDongs(List<HoatDong> hoatDongs) {
		this.hoatDongs = hoatDongs;
	}

	public HoatDong addHoatDong(HoatDong hoatDong) {
		getHoatDongs().add(hoatDong);
		hoatDong.setLoaiHoatDong(this);

		return hoatDong;
	}

	public HoatDong removeHoatDong(HoatDong hoatDong) {
		getHoatDongs().remove(hoatDong);
		hoatDong.setLoaiHoatDong(null);

		return hoatDong;
	}

}