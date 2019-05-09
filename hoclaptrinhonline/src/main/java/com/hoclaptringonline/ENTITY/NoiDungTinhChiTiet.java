package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "NoiDungTinhChiTiet" database table.
 * 
 */
@Entity
@Table(name="\"NoiDungTinhChiTiet\"")
@NamedQuery(name="NoiDungTinhChiTiet.findAll", query="SELECT n FROM NoiDungTinhChiTiet n")
public class NoiDungTinhChiTiet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NoiDungTinhChiTietPK idPK;

	@Column(name="\"FK_UserChinhsua\"")
	private String FK_UserChinhsua;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhAnh\"")
	private String hinhAnh;

	private int id;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgayChinhSua\"")
	private Timestamp ngayChinhSua;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumns({
		})
	private NgonNgu ngonNgu;

	//bi-directional many-to-one association to NoiDungTinh
	@ManyToOne
	@JoinColumns({
		})
	private NoiDungTinh noiDungTinh;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user;

	public NoiDungTinhChiTiet() {
	}

	public NoiDungTinhChiTietPK getIdPK() {
		return this.idPK;
	}

	public void setIdPK(NoiDungTinhChiTietPK idPK) {
		this.idPK = idPK;
	}

	public String getFK_UserChinhsua() {
		return this.FK_UserChinhsua;
	}

	public void setFK_UserChinhsua(String FK_UserChinhsua) {
		this.FK_UserChinhsua = FK_UserChinhsua;
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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLuotXem() {
		return this.luotXem;
	}

	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
	}

	public Timestamp getNgayChinhSua() {
		return this.ngayChinhSua;
	}

	public void setNgayChinhSua(Timestamp ngayChinhSua) {
		this.ngayChinhSua = ngayChinhSua;
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

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public NoiDungTinh getNoiDungTinh() {
		return this.noiDungTinh;
	}

	public void setNoiDungTinh(NoiDungTinh noiDungTinh) {
		this.noiDungTinh = noiDungTinh;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}