package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "PhanHoi" database table.
 * 
 */
@Entity
@Table(name="\"PhanHoi\"")
@NamedQuery(name="PhanHoi.findAll", query="SELECT p FROM PhanHoi p")
public class PhanHoi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"DaXem\"")
	private boolean daXem;

	@Column(name="\"DiaChi\"")
	private String diaChi;

	@Column(name="\"DienThoai\"")
	private String dienThoai;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"FK_LoaiPhanHoi\"")
	private int FK_LoaiPhanHoi;

	@Column(name="\"GioiTinh\"")
	private boolean gioiTinh;

	@Column(name="\"HoVaTen\"")
	private String hoVaTen;

	@Column(name="\"IsShow\"")
	private boolean isShow;

	@Column(name="\"MaSoBenhNhan\"")
	private String maSoBenhNhan;

	@Column(name="\"NgayGui\"")
	private Timestamp ngayGui;

	@Column(name="\"NgayKham\"")
	private Timestamp ngayKham;

	@Column(name="\"NgaySinh\"")
	private Timestamp ngaySinh;

	@Column(name="\"NgayTraLoi\"")
	private Timestamp ngayTraLoi;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	@Lob
	@Column(name="\"NoiDungTraLoi\"")
	private String noiDungTraLoi;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	public PhanHoi() {
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

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFK_LoaiPhanHoi() {
		return this.FK_LoaiPhanHoi;
	}

	public void setFK_LoaiPhanHoi(int FK_LoaiPhanHoi) {
		this.FK_LoaiPhanHoi = FK_LoaiPhanHoi;
	}

	public boolean getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getHoVaTen() {
		return this.hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public boolean getIsShow() {
		return this.isShow;
	}

	public void setIsShow(boolean isShow) {
		this.isShow = isShow;
	}

	public String getMaSoBenhNhan() {
		return this.maSoBenhNhan;
	}

	public void setMaSoBenhNhan(String maSoBenhNhan) {
		this.maSoBenhNhan = maSoBenhNhan;
	}

	public Timestamp getNgayGui() {
		return this.ngayGui;
	}

	public void setNgayGui(Timestamp ngayGui) {
		this.ngayGui = ngayGui;
	}

	public Timestamp getNgayKham() {
		return this.ngayKham;
	}

	public void setNgayKham(Timestamp ngayKham) {
		this.ngayKham = ngayKham;
	}

	public Timestamp getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(Timestamp ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Timestamp getNgayTraLoi() {
		return this.ngayTraLoi;
	}

	public void setNgayTraLoi(Timestamp ngayTraLoi) {
		this.ngayTraLoi = ngayTraLoi;
	}

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getNoiDungTraLoi() {
		return this.noiDungTraLoi;
	}

	public void setNoiDungTraLoi(String noiDungTraLoi) {
		this.noiDungTraLoi = noiDungTraLoi;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

}