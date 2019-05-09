package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "DichVuChiTiet" database table.
 * 
 */
@Embeddable
public class DichVuChiTietPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_NgonNgu\"", insertable=false, updatable=false)
	private int FK_NgonNgu;

	@Column(name="\"FK_DichVu\"", insertable=false, updatable=false)
	private int FK_DichVu;

	public DichVuChiTietPK() {
	}
	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}
	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}
	public int getFK_DichVu() {
		return this.FK_DichVu;
	}
	public void setFK_DichVu(int FK_DichVu) {
		this.FK_DichVu = FK_DichVu;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DichVuChiTietPK)) {
			return false;
		}
		DichVuChiTietPK castOther = (DichVuChiTietPK)other;
		return 
			(this.FK_NgonNgu == castOther.FK_NgonNgu)
			&& (this.FK_DichVu == castOther.FK_DichVu);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_NgonNgu;
		hash = hash * prime + this.FK_DichVu;
		
		return hash;
	}
}