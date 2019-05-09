package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "NoiDungTinhChiTiet" database table.
 * 
 */
@Embeddable
public class NoiDungTinhChiTietPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_NgonNgu\"", insertable=false, updatable=false)
	private int FK_NgonNgu;

	@Column(name="\"FK_NoiDungTinh\"", insertable=false, updatable=false)
	private int FK_NoiDungTinh;

	public NoiDungTinhChiTietPK() {
	}
	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}
	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}
	public int getFK_NoiDungTinh() {
		return this.FK_NoiDungTinh;
	}
	public void setFK_NoiDungTinh(int FK_NoiDungTinh) {
		this.FK_NoiDungTinh = FK_NoiDungTinh;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NoiDungTinhChiTietPK)) {
			return false;
		}
		NoiDungTinhChiTietPK castOther = (NoiDungTinhChiTietPK)other;
		return 
			(this.FK_NgonNgu == castOther.FK_NgonNgu)
			&& (this.FK_NoiDungTinh == castOther.FK_NoiDungTinh);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_NgonNgu;
		hash = hash * prime + this.FK_NoiDungTinh;
		
		return hash;
	}
}