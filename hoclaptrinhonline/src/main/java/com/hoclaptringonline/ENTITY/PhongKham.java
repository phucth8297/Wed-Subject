package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "PhongKham" database table.
 * 
 */
@Entity
@Table(name="\"PhongKham\"")
@NamedQuery(name="PhongKham.findAll", query="SELECT p FROM PhongKham p")
public class PhongKham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"FK_NgonNgu\"")
	private int FK_NgonNgu;

	@Column(name="\"GhiChuThem\"")
	private String ghiChuThem;

	@Column(name="\"HenKham\"")
	private boolean henKham;

	@Column(name="\"TenPhongKham\"")
	private String tenPhongKham;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="phongKham")
	private List<HenKhamBenh> henKhamBenhs;

	//bi-directional many-to-one association to LichKham
	@OneToMany(mappedBy="phongKham")
	private List<LichKham> lichKhams;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumns({
		})
	private NgonNgu ngonNgu;

	public PhongKham() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}

	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}

	public String getGhiChuThem() {
		return this.ghiChuThem;
	}

	public void setGhiChuThem(String ghiChuThem) {
		this.ghiChuThem = ghiChuThem;
	}

	public boolean getHenKham() {
		return this.henKham;
	}

	public void setHenKham(boolean henKham) {
		this.henKham = henKham;
	}

	public String getTenPhongKham() {
		return this.tenPhongKham;
	}

	public void setTenPhongKham(String tenPhongKham) {
		this.tenPhongKham = tenPhongKham;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setPhongKham(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setPhongKham(null);

		return henKhamBenh;
	}

	public List<LichKham> getLichKhams() {
		return this.lichKhams;
	}

	public void setLichKhams(List<LichKham> lichKhams) {
		this.lichKhams = lichKhams;
	}

	public LichKham addLichKham(LichKham lichKham) {
		getLichKhams().add(lichKham);
		lichKham.setPhongKham(this);

		return lichKham;
	}

	public LichKham removeLichKham(LichKham lichKham) {
		getLichKhams().remove(lichKham);
		lichKham.setPhongKham(null);

		return lichKham;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

}