package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "QuocTich" database table.
 * 
 */
@Entity
@Table(name="\"QuocTich\"")
@NamedQuery(name="QuocTich.findAll", query="SELECT q FROM QuocTich q")
public class QuocTich implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenQuocGia\"")
	private String tenQuocGia;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="quocTich")
	private List<HenKhamBenh> henKhamBenhs;

	public QuocTich() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenQuocGia() {
		return this.tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setQuocTich(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setQuocTich(null);

		return henKhamBenh;
	}

}