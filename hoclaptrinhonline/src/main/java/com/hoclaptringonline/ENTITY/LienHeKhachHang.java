package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "LienHeKhachHang" database table.
 * 
 */
@Entity
@Table(name="\"LienHeKhachHang\"")
@NamedQuery(name="LienHeKhachHang.findAll", query="SELECT l FROM LienHeKhachHang l")
public class LienHeKhachHang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"DaXem\"")
	private boolean daXem;

	@Column(name="\"DienThoaiDiDong\"")
	private String dienThoaiDiDong;

	@Column(name="\"DienThoaiNha\"")
	private String dienThoaiNha;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"HoVaTen\"")
	private String hoVaTen;

	@Column(name="\"NgayGui\"")
	private Timestamp ngayGui;

	@Column(name="\"NgayXem\"")
	private Timestamp ngayXem;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	public LienHeKhachHang() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getDaXem() {
		return this.daXem;
	}

	public void setDaXem(boolean daXem) {
		this.daXem = daXem;
	}

	public String getDienThoaiDiDong() {
		return this.dienThoaiDiDong;
	}

	public void setDienThoaiDiDong(String dienThoaiDiDong) {
		this.dienThoaiDiDong = dienThoaiDiDong;
	}

	public String getDienThoaiNha() {
		return this.dienThoaiNha;
	}

	public void setDienThoaiNha(String dienThoaiNha) {
		this.dienThoaiNha = dienThoaiNha;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoVaTen() {
		return this.hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Timestamp getNgayGui() {
		return this.ngayGui;
	}

	public void setNgayGui(Timestamp ngayGui) {
		this.ngayGui = ngayGui;
	}

	public Timestamp getNgayXem() {
		return this.ngayXem;
	}

	public void setNgayXem(Timestamp ngayXem) {
		this.ngayXem = ngayXem;
	}

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

}