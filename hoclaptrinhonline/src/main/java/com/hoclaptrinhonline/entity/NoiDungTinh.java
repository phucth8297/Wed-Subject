package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "NoiDungTinh" database table.
 * 
 */
@Entity
@Table(name="\"NoiDungTinh\"")
@NamedQuery(name="NoiDungTinh.findAll", query="SELECT n FROM NoiDungTinh n")
public class NoiDungTinh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenNoiDung\"")
	private String tenNoiDung;

	//bi-directional many-to-one association to NoiDungTinhChiTiet
	@OneToMany(mappedBy="noiDungTinh")
	private List<NoiDungTinhChiTiet> noiDungTinhChiTiets;

	public NoiDungTinh() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenNoiDung() {
		return this.tenNoiDung;
	}

	public void setTenNoiDung(String tenNoiDung) {
		this.tenNoiDung = tenNoiDung;
	}

	public List<NoiDungTinhChiTiet> getNoiDungTinhChiTiets() {
		return this.noiDungTinhChiTiets;
	}

	public void setNoiDungTinhChiTiets(List<NoiDungTinhChiTiet> noiDungTinhChiTiets) {
		this.noiDungTinhChiTiets = noiDungTinhChiTiets;
	}

	public NoiDungTinhChiTiet addNoiDungTinhChiTiet(NoiDungTinhChiTiet noiDungTinhChiTiet) {
		getNoiDungTinhChiTiets().add(noiDungTinhChiTiet);
		noiDungTinhChiTiet.setNoiDungTinh(this);

		return noiDungTinhChiTiet;
	}

	public NoiDungTinhChiTiet removeNoiDungTinhChiTiet(NoiDungTinhChiTiet noiDungTinhChiTiet) {
		getNoiDungTinhChiTiets().remove(noiDungTinhChiTiet);
		noiDungTinhChiTiet.setNoiDungTinh(null);

		return noiDungTinhChiTiet;
	}

}