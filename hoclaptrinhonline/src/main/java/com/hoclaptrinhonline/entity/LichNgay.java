package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "LichNgay" database table.
 * 
 */
@Entity
@Table(name="\"LichNgay\"")
@NamedQuery(name="LichNgay.findAll", query="SELECT l FROM LichNgay l")
public class LichNgay implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"TenThu\"")
	private String tenThu;

	//bi-directional many-to-one association to LichKham
	@OneToMany(mappedBy="lichNgay")
	private List<LichKham> lichKhams;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumn(name="\"FK_NgonNgu\"")
	private NgonNgu ngonNgu;

	public LichNgay() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenThu() {
		return this.tenThu;
	}

	public void setTenThu(String tenThu) {
		this.tenThu = tenThu;
	}

	public List<LichKham> getLichKhams() {
		return this.lichKhams;
	}

	public void setLichKhams(List<LichKham> lichKhams) {
		this.lichKhams = lichKhams;
	}

	public LichKham addLichKham(LichKham lichKham) {
		getLichKhams().add(lichKham);
		lichKham.setLichNgay(this);

		return lichKham;
	}

	public LichKham removeLichKham(LichKham lichKham) {
		getLichKhams().remove(lichKham);
		lichKham.setLichNgay(null);

		return lichKham;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

}