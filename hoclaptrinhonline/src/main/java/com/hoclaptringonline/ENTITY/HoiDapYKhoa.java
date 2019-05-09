package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "HoiDapYKhoa" database table.
 * 
 */
@Entity
@Table(name="\"HoiDapYKhoa\"")
@NamedQuery(name="HoiDapYKhoa.findAll", query="SELECT h FROM HoiDapYKhoa h")
public class HoiDapYKhoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"DaTraLoi\"")
	private boolean daTraLoi;

	@Column(name="\"DiaChi\"")
	private String diaChi;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"FK_ChuyenKhoa\"")
	private int FK_ChuyenKhoa;

	@Column(name="\"FK_NamSinh\"")
	private int FK_NamSinh;

	@Column(name="\"FK_UserTraLoi\"")
	private String FK_UserTraLoi;

	@Column(name="\"GioiTinh\"")
	private boolean gioiTinh;

	@Column(name="\"HoTenNguoiHoi\"")
	private String hoTenNguoiHoi;

	@Column(name="\"IsShow\"")
	private boolean isShow;

	@Column(name="\"NgayGuiCauHoi\"")
	private Timestamp ngayGuiCauHoi;

	@Column(name="\"NgayTraLoi\"")
	private Timestamp ngayTraLoi;

	@Column(name="\"NguoiTraLoi\"")
	private String nguoiTraLoi;

	@Lob
	@Column(name="\"NoiDungCauHoi\"")
	private String noiDungCauHoi;

	@Lob
	@Column(name="\"NoiDungTraLoi\"")
	private String noiDungTraLoi;

	@Column(name="\"SoDienThoai\"")
	private String soDienThoai;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	//bi-directional many-to-one association to LoaiCauHoi
	@ManyToOne
	@JoinColumns({
		})
	private LoaiCauHoi loaiCauHoi;

	//bi-directional many-to-one association to NamSinh
	@ManyToOne
	@JoinColumns({
		})
	private NamSinh namSinh;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user;

	public HoiDapYKhoa() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getDaTraLoi() {
		return this.daTraLoi;
	}

	public void setDaTraLoi(boolean daTraLoi) {
		this.daTraLoi = daTraLoi;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFK_ChuyenKhoa() {
		return this.FK_ChuyenKhoa;
	}

	public void setFK_ChuyenKhoa(int FK_ChuyenKhoa) {
		this.FK_ChuyenKhoa = FK_ChuyenKhoa;
	}

	public int getFK_NamSinh() {
		return this.FK_NamSinh;
	}

	public void setFK_NamSinh(int FK_NamSinh) {
		this.FK_NamSinh = FK_NamSinh;
	}

	public String getFK_UserTraLoi() {
		return this.FK_UserTraLoi;
	}

	public void setFK_UserTraLoi(String FK_UserTraLoi) {
		this.FK_UserTraLoi = FK_UserTraLoi;
	}

	public boolean getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getHoTenNguoiHoi() {
		return this.hoTenNguoiHoi;
	}

	public void setHoTenNguoiHoi(String hoTenNguoiHoi) {
		this.hoTenNguoiHoi = hoTenNguoiHoi;
	}

	public boolean getIsShow() {
		return this.isShow;
	}

	public void setIsShow(boolean isShow) {
		this.isShow = isShow;
	}

	public Timestamp getNgayGuiCauHoi() {
		return this.ngayGuiCauHoi;
	}

	public void setNgayGuiCauHoi(Timestamp ngayGuiCauHoi) {
		this.ngayGuiCauHoi = ngayGuiCauHoi;
	}

	public Timestamp getNgayTraLoi() {
		return this.ngayTraLoi;
	}

	public void setNgayTraLoi(Timestamp ngayTraLoi) {
		this.ngayTraLoi = ngayTraLoi;
	}

	public String getNguoiTraLoi() {
		return this.nguoiTraLoi;
	}

	public void setNguoiTraLoi(String nguoiTraLoi) {
		this.nguoiTraLoi = nguoiTraLoi;
	}

	public String getNoiDungCauHoi() {
		return this.noiDungCauHoi;
	}

	public void setNoiDungCauHoi(String noiDungCauHoi) {
		this.noiDungCauHoi = noiDungCauHoi;
	}

	public String getNoiDungTraLoi() {
		return this.noiDungTraLoi;
	}

	public void setNoiDungTraLoi(String noiDungTraLoi) {
		this.noiDungTraLoi = noiDungTraLoi;
	}

	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public LoaiCauHoi getLoaiCauHoi() {
		return this.loaiCauHoi;
	}

	public void setLoaiCauHoi(LoaiCauHoi loaiCauHoi) {
		this.loaiCauHoi = loaiCauHoi;
	}

	public NamSinh getNamSinh() {
		return this.namSinh;
	}

	public void setNamSinh(NamSinh namSinh) {
		this.namSinh = namSinh;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}