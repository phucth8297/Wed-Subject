package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


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

	@Column(name="\"FK_LoaiKhoaPhong\"")
	private int FK_LoaiKhoaPhong;

	@Column(name="\"FK_NgonNgu\"")
	private int FK_NgonNgu;

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

	//bi-directional many-to-one association to DanhMucBacSi
	@OneToMany(mappedBy="khoaPhong")
	private List<DanhMucBacSi> danhMucBacSis;

	//bi-directional many-to-one association to LoaiKhoaPhong
	@ManyToOne
	@JoinColumns({
		})
	private LoaiKhoaPhong loaiKhoaPhong;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumns({
		})
	private NgonNgu ngonNgu;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="khoaPhong")
	private List<User> users;

	public KhoaPhong() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFK_LoaiKhoaPhong() {
		return this.FK_LoaiKhoaPhong;
	}

	public void setFK_LoaiKhoaPhong(int FK_LoaiKhoaPhong) {
		this.FK_LoaiKhoaPhong = FK_LoaiKhoaPhong;
	}

	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}

	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
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

	public List<DanhMucBacSi> getDanhMucBacSis() {
		return this.danhMucBacSis;
	}

	public void setDanhMucBacSis(List<DanhMucBacSi> danhMucBacSis) {
		this.danhMucBacSis = danhMucBacSis;
	}

	public DanhMucBacSi addDanhMucBacSi(DanhMucBacSi danhMucBacSi) {
		getDanhMucBacSis().add(danhMucBacSi);
		danhMucBacSi.setKhoaPhong(this);

		return danhMucBacSi;
	}

	public DanhMucBacSi removeDanhMucBacSi(DanhMucBacSi danhMucBacSi) {
		getDanhMucBacSis().remove(danhMucBacSi);
		danhMucBacSi.setKhoaPhong(null);

		return danhMucBacSi;
	}

	public LoaiKhoaPhong getLoaiKhoaPhong() {
		return this.loaiKhoaPhong;
	}

	public void setLoaiKhoaPhong(LoaiKhoaPhong loaiKhoaPhong) {
		this.loaiKhoaPhong = loaiKhoaPhong;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setKhoaPhong(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setKhoaPhong(null);

		return user;
	}

}