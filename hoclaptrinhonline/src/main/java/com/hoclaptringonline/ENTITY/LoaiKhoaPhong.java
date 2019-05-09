package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "LoaiKhoaPhong" database table.
 * 
 */
@Entity
@Table(name="\"LoaiKhoaPhong\"")
@NamedQuery(name="LoaiKhoaPhong.findAll", query="SELECT l FROM LoaiKhoaPhong l")
public class LoaiKhoaPhong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	//bi-directional many-to-one association to KhoaPhong
	@OneToMany(mappedBy="loaiKhoaPhong")
	private List<KhoaPhong> khoaPhongs;

	public LoaiKhoaPhong() {
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

	public List<KhoaPhong> getKhoaPhongs() {
		return this.khoaPhongs;
	}

	public void setKhoaPhongs(List<KhoaPhong> khoaPhongs) {
		this.khoaPhongs = khoaPhongs;
	}

	public KhoaPhong addKhoaPhong(KhoaPhong khoaPhong) {
		getKhoaPhongs().add(khoaPhong);
		khoaPhong.setLoaiKhoaPhong(this);

		return khoaPhong;
	}

	public KhoaPhong removeKhoaPhong(KhoaPhong khoaPhong) {
		getKhoaPhongs().remove(khoaPhong);
		khoaPhong.setLoaiKhoaPhong(null);

		return khoaPhong;
	}

}