package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "LichKham" database table.
 * 
 */
@Embeddable
public class LichKhamPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_LichNgay\"", insertable=false, updatable=false)
	private int FK_LichNgay;

	@Column(name="\"FK_PhongKham\"", insertable=false, updatable=false)
	private int FK_PhongKham;

	public LichKhamPK() {
	}
	public int getFK_LichNgay() {
		return this.FK_LichNgay;
	}
	public void setFK_LichNgay(int FK_LichNgay) {
		this.FK_LichNgay = FK_LichNgay;
	}
	public int getFK_PhongKham() {
		return this.FK_PhongKham;
	}
	public void setFK_PhongKham(int FK_PhongKham) {
		this.FK_PhongKham = FK_PhongKham;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LichKhamPK)) {
			return false;
		}
		LichKhamPK castOther = (LichKhamPK)other;
		return 
			(this.FK_LichNgay == castOther.FK_LichNgay)
			&& (this.FK_PhongKham == castOther.FK_PhongKham);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_LichNgay;
		hash = hash * prime + this.FK_PhongKham;
		
		return hash;
	}
}