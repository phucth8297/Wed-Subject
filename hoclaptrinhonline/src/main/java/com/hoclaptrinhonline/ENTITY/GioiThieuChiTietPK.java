package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "GioiThieuChiTiet" database table.
 * 
 */
@Embeddable
public class GioiThieuChiTietPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_NgonNgu\"", insertable=false, updatable=false)
	private int FK_NgonNgu;

	@Column(name="\"FK_GioiThieu\"", insertable=false, updatable=false)
	private int FK_GioiThieu;

	public GioiThieuChiTietPK() {
	}
	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}
	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}
	public int getFK_GioiThieu() {
		return this.FK_GioiThieu;
	}
	public void setFK_GioiThieu(int FK_GioiThieu) {
		this.FK_GioiThieu = FK_GioiThieu;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GioiThieuChiTietPK)) {
			return false;
		}
		GioiThieuChiTietPK castOther = (GioiThieuChiTietPK)other;
		return 
			(this.FK_NgonNgu == castOther.FK_NgonNgu)
			&& (this.FK_GioiThieu == castOther.FK_GioiThieu);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_NgonNgu;
		hash = hash * prime + this.FK_GioiThieu;
		
		return hash;
	}
}