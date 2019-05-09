package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "GioiThieuChiTiet" database table.
 * 
 */
@Entity
@Table(name="\"GioiThieuChiTiet\"")
@NamedQuery(name="GioiThieuChiTiet.findAll", query="SELECT g FROM GioiThieuChiTiet g")
public class GioiThieuChiTiet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GioiThieuChiTietPK idPK;

	@Column(name="\"FK_UserModify\"")
	private String FK_UserModify;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhAnh\"")
	private String hinhAnh;

	private int id;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgayChinhSua\"")
	private Timestamp ngayChinhSua;

	@Column(name="\"NgayTao\"")
	private Timestamp ngayTao;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	@Column(name="\"Ten\"")
	private String ten;

	//bi-directional many-to-one association to GioiThieu
	@ManyToOne
	@JoinColumns({
		})
	private GioiThieu gioiThieuBean;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumns({
		})
	private NgonNgu ngonNgu;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user;

	public GioiThieuChiTiet() {
	}

	public GioiThieuChiTietPK idPK() {
		return this.idPK;
	}

	public void setId(GioiThieuChiTietPK idPK) {
		this.idPK = idPK;
	}

	public String getFK_UserModify() {
		return this.FK_UserModify;
	}

	public void setFK_UserModify(String FK_UserModify) {
		this.FK_UserModify = FK_UserModify;
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

	public Timestamp getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Timestamp ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public GioiThieu getGioiThieuBean() {
		return this.gioiThieuBean;
	}

	public void setGioiThieuBean(GioiThieu gioiThieuBean) {
		this.gioiThieuBean = gioiThieuBean;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}