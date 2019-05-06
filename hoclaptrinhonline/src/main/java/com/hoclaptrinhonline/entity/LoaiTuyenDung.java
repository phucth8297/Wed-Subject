package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "LoaiTuyenDung" database table.
 * 
 */
@Entity
@Table(name="\"LoaiTuyenDung\"")
@NamedQuery(name="LoaiTuyenDung.findAll", query="SELECT l FROM LoaiTuyenDung l")
public class LoaiTuyenDung implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumn(name="\"FK_NgonNgu\"")
	private NgonNgu ngonNgu;

	//bi-directional many-to-one association to TuyenDungThongBao
	@OneToMany(mappedBy="loaiTuyenDung")
	private List<TuyenDungThongBao> tuyenDungThongBaos;

	public LoaiTuyenDung() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoai() {
		return this.tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public List<TuyenDungThongBao> getTuyenDungThongBaos() {
		return this.tuyenDungThongBaos;
	}

	public void setTuyenDungThongBaos(List<TuyenDungThongBao> tuyenDungThongBaos) {
		this.tuyenDungThongBaos = tuyenDungThongBaos;
	}

	public TuyenDungThongBao addTuyenDungThongBao(TuyenDungThongBao tuyenDungThongBao) {
		getTuyenDungThongBaos().add(tuyenDungThongBao);
		tuyenDungThongBao.setLoaiTuyenDung(this);

		return tuyenDungThongBao;
	}

	public TuyenDungThongBao removeTuyenDungThongBao(TuyenDungThongBao tuyenDungThongBao) {
		getTuyenDungThongBaos().remove(tuyenDungThongBao);
		tuyenDungThongBao.setLoaiTuyenDung(null);

		return tuyenDungThongBao;
	}

}