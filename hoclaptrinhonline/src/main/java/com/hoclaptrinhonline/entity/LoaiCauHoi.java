package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "LoaiCauHoi" database table.
 * 
 */
@Entity
@Table(name="\"LoaiCauHoi\"")
@NamedQuery(name="LoaiCauHoi.findAll", query="SELECT l FROM LoaiCauHoi l")
public class LoaiCauHoi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenLoai\"")
	private String tenLoai;

	//bi-directional many-to-one association to HoiDapYKhoa
	@OneToMany(mappedBy="loaiCauHoi")
	private List<HoiDapYKhoa> hoiDapYkhoas;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumn(name="\"FK_NgonNgu\"")
	private NgonNgu ngonNgu;

	public LoaiCauHoi() {
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

	public List<HoiDapYKhoa> getHoiDapYkhoas() {
		return this.hoiDapYkhoas;
	}

	public void setHoiDapYkhoas(List<HoiDapYKhoa> hoiDapYkhoas) {
		this.hoiDapYkhoas = hoiDapYkhoas;
	}

	public HoiDapYKhoa addHoiDapYkhoa(HoiDapYKhoa hoiDapYkhoa) {
		getHoiDapYkhoas().add(hoiDapYkhoa);
		hoiDapYkhoa.setLoaiCauHoi(this);

		return hoiDapYkhoa;
	}

	public HoiDapYKhoa removeHoiDapYkhoa(HoiDapYKhoa hoiDapYkhoa) {
		getHoiDapYkhoas().remove(hoiDapYkhoa);
		hoiDapYkhoa.setLoaiCauHoi(null);

		return hoiDapYkhoa;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

}