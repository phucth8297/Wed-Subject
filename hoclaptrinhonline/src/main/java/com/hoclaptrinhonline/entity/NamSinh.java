package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "NamSinh" database table.
 * 
 */
@Entity
@Table(name="\"NamSinh\"")
@NamedQuery(name="NamSinh.findAll", query="SELECT n FROM NamSinh n")
public class NamSinh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Nam\"")
	private int nam;

	//bi-directional many-to-one association to HenKhamBenh
	@OneToMany(mappedBy="namSinh")
	private List<HenKhamBenh> henKhamBenhs;

	//bi-directional many-to-one association to HoiDapYKhoa
	@OneToMany(mappedBy="namSinh")
	private List<HoiDapYKhoa> hoiDapYkhoas;

	public NamSinh() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNam() {
		return this.nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public List<HenKhamBenh> getHenKhamBenhs() {
		return this.henKhamBenhs;
	}

	public void setHenKhamBenhs(List<HenKhamBenh> henKhamBenhs) {
		this.henKhamBenhs = henKhamBenhs;
	}

	public HenKhamBenh addHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().add(henKhamBenh);
		henKhamBenh.setNamSinh(this);

		return henKhamBenh;
	}

	public HenKhamBenh removeHenKhamBenh(HenKhamBenh henKhamBenh) {
		getHenKhamBenhs().remove(henKhamBenh);
		henKhamBenh.setNamSinh(null);

		return henKhamBenh;
	}

	public List<HoiDapYKhoa> getHoiDapYkhoas() {
		return this.hoiDapYkhoas;
	}

	public void setHoiDapYkhoas(List<HoiDapYKhoa> hoiDapYkhoas) {
		this.hoiDapYkhoas = hoiDapYkhoas;
	}

	public HoiDapYKhoa addHoiDapYkhoa(HoiDapYKhoa hoiDapYkhoa) {
		getHoiDapYkhoas().add(hoiDapYkhoa);
		hoiDapYkhoa.setNamSinh(this);

		return hoiDapYkhoa;
	}

	public HoiDapYKhoa removeHoiDapYkhoa(HoiDapYKhoa hoiDapYkhoa) {
		getHoiDapYkhoas().remove(hoiDapYkhoa);
		hoiDapYkhoa.setNamSinh(null);

		return hoiDapYkhoa;
	}

}