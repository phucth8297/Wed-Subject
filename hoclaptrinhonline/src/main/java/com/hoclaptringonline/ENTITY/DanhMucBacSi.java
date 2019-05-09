package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "DanhMucBacSi" database table.
 * 
 */
@Entity
@Table(name="\"DanhMucBacSi\"")
@NamedQuery(name="DanhMucBacSi.findAll", query="SELECT d FROM DanhMucBacSi d")
public class DanhMucBacSi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"FK_KhoaPhong\"")
	private int FK_KhoaPhong;

	@Column(name="\"TenBacSi\"")
	private String tenBacSi;

	//bi-directional many-to-one association to KhoaPhong
	@ManyToOne
	@JoinColumns({
		})
	private KhoaPhong khoaPhong;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="danhMucBacSi")
	private List<HenKhamBenh> henKhamBenhs;

	public DanhMucBacSi() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFK_KhoaPhong() {
		return this.FK_KhoaPhong;
	}

	public void setFK_KhoaPhong(int FK_KhoaPhong) {
		this.FK_KhoaPhong = FK_KhoaPhong;
	}

	public String getTenBacSi() {
		return this.tenBacSi;
	}

	public void setTenBacSi(String tenBacSi) {
		this.tenBacSi = tenBacSi;
	}

	public KhoaPhong getKhoaPhong() {
		return this.khoaPhong;
	}

	public void setKhoaPhong(KhoaPhong khoaPhong) {
		this.khoaPhong = khoaPhong;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setDanhMucBacSi(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setDanhMucBacSi(null);

		return henKhamBenh;
	}

}