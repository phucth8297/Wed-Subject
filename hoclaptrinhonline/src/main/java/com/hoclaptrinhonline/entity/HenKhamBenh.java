package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "HenKhamBenh" database table.
 * 
 */
@Entity
@Table(name="\"HenKhamBenh\"")
@NamedQuery(name="HenKhamBenh.findAll", query="SELECT h FROM HenKhamBenh h")
public class HenKhamBenh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"BacSi\"")
	private String bacSi;

	@Column(name="\"DiaChi\"")
	private String diaChi;

	@Column(name="\"DiaChiEmail\"")
	private String diaChiEmail;

	@Column(name="\"GioiTinh\"")
	private boolean gioiTinh;

	@Column(name="\"HoVaTen\"")
	private String hoVaTen;

	@Lob
	@Column(name="\"MoTaTrieuChung\"")
	private String moTaTrieuChung;

	@Column(name="\"NgayGui\"")
	private Timestamp ngayGui;

	@Column(name="\"NgayHen\"")
	private Timestamp ngayHen;

	@Column(name="\"SoDienThoaiDiDong\"")
	private String soDienThoaiDiDong;

	@Column(name="\"SoDienThoaiNha\"")
	private String soDienThoaiNha;

	//bi-directional many-to-one association to DanhMucBacSi
	@ManyToOne
	@JoinColumn(name="\"FK_BacSi\"")
	private DanhMucBacSi danhMucBacSi;

	//bi-directional many-to-one association to GioKham
	@ManyToOne
	@JoinColumn(name="\"FK_GioHen\"")
	private GioKham gioKham;

	//bi-directional many-to-one association to NamSinh
	@ManyToOne
	@JoinColumn(name="\"FK_NamSinh\"")
	private NamSinh namSinh;

	//bi-directional many-to-one association to PhongKham
	@ManyToOne
	@JoinColumn(name="\"FK_ChuyenKhoa\"")
	private PhongKham phongKham;

	//bi-directional many-to-one association to QuocTich
	@ManyToOne
	@JoinColumn(name="\"FK_QuocTich\"")
	private QuocTich quocTich;

	//bi-directional many-to-one association to TinhTrangHonNhan
	@ManyToOne
	@JoinColumn(name="\"FK_TinhTrangHonNhan\"")
	private TinhTrangHonNhan tinhTrangHonNhan;

	//bi-directional many-to-one association to TrangThai
	@ManyToOne
	@JoinColumn(name="\"FK_TrangThai\"")
	private TrangThai trangThai;

	public HenKhamBenh() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBacSi() {
		return this.bacSi;
	}

	public void setBacSi(String bacSi) {
		this.bacSi = bacSi;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDiaChiEmail() {
		return this.diaChiEmail;
	}

	public void setDiaChiEmail(String diaChiEmail) {
		this.diaChiEmail = diaChiEmail;
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

	public String getMoTaTrieuChung() {
		return this.moTaTrieuChung;
	}

	public void setMoTaTrieuChung(String moTaTrieuChung) {
		this.moTaTrieuChung = moTaTrieuChung;
	}

	public Timestamp getNgayGui() {
		return this.ngayGui;
	}

	public void setNgayGui(Timestamp ngayGui) {
		this.ngayGui = ngayGui;
	}

	public Timestamp getNgayHen() {
		return this.ngayHen;
	}

	public void setNgayHen(Timestamp ngayHen) {
		this.ngayHen = ngayHen;
	}

	public String getSoDienThoaiDiDong() {
		return this.soDienThoaiDiDong;
	}

	public void setSoDienThoaiDiDong(String soDienThoaiDiDong) {
		this.soDienThoaiDiDong = soDienThoaiDiDong;
	}

	public String getSoDienThoaiNha() {
		return this.soDienThoaiNha;
	}

	public void setSoDienThoaiNha(String soDienThoaiNha) {
		this.soDienThoaiNha = soDienThoaiNha;
	}

	public DanhMucBacSi getDanhMucBacSi() {
		return this.danhMucBacSi;
	}

	public void setDanhMucBacSi(DanhMucBacSi danhMucBacSi) {
		this.danhMucBacSi = danhMucBacSi;
	}

	public GioKham getGioKham() {
		return this.gioKham;
	}

	public void setGioKham(GioKham gioKham) {
		this.gioKham = gioKham;
	}

	public NamSinh getNamSinh() {
		return this.namSinh;
	}

	public void setNamSinh(NamSinh namSinh) {
		this.namSinh = namSinh;
	}

	public PhongKham getPhongKham() {
		return this.phongKham;
	}

	public void setPhongKham(PhongKham phongKham) {
		this.phongKham = phongKham;
	}

	public QuocTich getQuocTich() {
		return this.quocTich;
	}

	public void setQuocTich(QuocTich quocTich) {
		this.quocTich = quocTich;
	}

	public TinhTrangHonNhan getTinhTrangHonNhan() {
		return this.tinhTrangHonNhan;
	}

	public void setTinhTrangHonNhan(TinhTrangHonNhan tinhTrangHonNhan) {
		this.tinhTrangHonNhan = tinhTrangHonNhan;
	}

	public TrangThai getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}

}