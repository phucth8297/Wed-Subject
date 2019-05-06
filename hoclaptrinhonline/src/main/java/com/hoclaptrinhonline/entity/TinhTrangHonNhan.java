package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "TinhTrangHonNhan" database table.
 * 
 */
@Entity
@Table(name="\"TinhTrangHonNhan\"")
@NamedQuery(name="TinhTrangHonNhan.findAll", query="SELECT t FROM TinhTrangHonNhan t")
public class TinhTrangHonNhan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TinhTrang\"")
	private String tinhTrang;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="tinhTrangHonNhan")
	private List<HenKhamBenh> henKhamBenhs;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumn(name="\"FK_NgonNgu\"")
	private NgonNgu ngonNgu;

	public TinhTrangHonNhan() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setTinhTrangHonNhan(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setTinhTrangHonNhan(null);

		return henKhamBenh;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

}