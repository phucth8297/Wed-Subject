package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "Video" database table.
 * 
 */
@Entity
@Table(name="\"Video\"")
@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
public class Video implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"DuongDanFile\"")
	private String duongDanFile;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhAnh\"")
	private String hinhAnh;

	@Column(name="\"IsYoutube\"")
	private boolean isYoutube;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgaySua\"")
	private Timestamp ngaySua;

	@Column(name="\"NgayTao\"")
	private Timestamp ngayTao;

	@Column(name="\"NguoiTao\"")
	private String nguoiTao;

	@Column(name="\"NoiBat\"")
	private boolean noiBat;

	private int stt;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	@Column(name="\"UserNguoiSua\"")
	private String userNguoiSua;

	public Video() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDuongDanFile() {
		return this.duongDanFile;
	}

	public void setDuongDanFile(String duongDanFile) {
		this.duongDanFile = duongDanFile;
	}

	public String getGioiThieu() {
		return this.gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public boolean getIsYoutube() {
		return this.isYoutube;
	}

	public void setIsYoutube(boolean isYoutube) {
		this.isYoutube = isYoutube;
	}

	public int getLuotXem() {
		return this.luotXem;
	}

	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
	}

	public Timestamp getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Timestamp ngaySua) {
		this.ngaySua = ngaySua;
	}

	public Timestamp getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Timestamp ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public boolean getNoiBat() {
		return this.noiBat;
	}

	public void setNoiBat(boolean noiBat) {
		this.noiBat = noiBat;
	}

	public int getStt() {
		return this.stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getUserNguoiSua() {
		return this.userNguoiSua;
	}

	public void setUserNguoiSua(String userNguoiSua) {
		this.userNguoiSua = userNguoiSua;
	}

}