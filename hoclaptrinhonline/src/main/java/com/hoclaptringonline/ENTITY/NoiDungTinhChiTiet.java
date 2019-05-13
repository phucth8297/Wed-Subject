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
	private NoiDungTinhChiTietPK id;

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

	public NoiDungTinhChiTiet() {
	}

	public NoiDungTinhChiTietPK getId() {
		return this.id;
	}

	public void setId(NoiDungTinhChiTietPK id) {
		this.id = id;
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

}