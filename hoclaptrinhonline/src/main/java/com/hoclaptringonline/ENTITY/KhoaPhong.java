package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "KhoaPhong" database table.
 * 
 */
@Entity
@Table(name="\"KhoaPhong\"")
@NamedQuery(name="KhoaPhong.findAll", query="SELECT k FROM KhoaPhong k")
public class KhoaPhong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HenKhamBenh\"")
	private boolean henKhamBenh;

	@Column(name="\"HinhAnhDaiDien\"")
	private String hinhAnhDaiDien;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgayCapNhat\"")
	private Timestamp ngayCapNhat;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	private int stt;

	@Column(name="\"TenKhoaPhong\"")
	private String tenKhoaPhong;

	@Column(name="\"TieuDeKhoa\"")
	private String tieuDeKhoa;

	@Column(name="\"UserModify\"")
	private String userModify;

	public KhoaPhong() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGioiThieu() {
		return this.gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public boolean getHenKhamBenh() {
		return this.henKhamBenh;
	}

	public void setHenKhamBenh(boolean henKhamBenh) {
		this.henKhamBenh = henKhamBenh;
	}

	public String getHinhAnhDaiDien() {
		return this.hinhAnhDaiDien;
	}

	public void setHinhAnhDaiDien(String hinhAnhDaiDien) {
		this.hinhAnhDaiDien = hinhAnhDaiDien;
	}

	public int getLuotXem() {
		return this.luotXem;
	}

	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
	}

	public Timestamp getNgayCapNhat() {
		return this.ngayCapNhat;
	}

	public void setNgayCapNhat(Timestamp ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public int getStt() {
		return this.stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getTenKhoaPhong() {
		return this.tenKhoaPhong;
	}

	public void setTenKhoaPhong(String tenKhoaPhong) {
		this.tenKhoaPhong = tenKhoaPhong;
	}

	public String getTieuDeKhoa() {
		return this.tieuDeKhoa;
	}

	public void setTieuDeKhoa(String tieuDeKhoa) {
		this.tieuDeKhoa = tieuDeKhoa;
	}

	public String getUserModify() {
		return this.userModify;
	}

	public void setUserModify(String userModify) {
		this.userModify = userModify;
	}

}