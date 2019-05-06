package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "ImagePage" database table.
 * 
 */
@Embeddable
public class ImagePagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_NgonNgu\"", insertable=false, updatable=false)
	private int FK_NgonNgu;

	@Column(name="\"PageName\"")
	private String pageName;

	public ImagePagePK() {
	}
	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}
	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}
	public String getPageName() {
		return this.pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ImagePagePK)) {
			return false;
		}
		ImagePagePK castOther = (ImagePagePK)other;
		return 
			(this.FK_NgonNgu == castOther.FK_NgonNgu)
			&& this.pageName.equals(castOther.pageName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_NgonNgu;
		hash = hash * prime + this.pageName.hashCode();
		
		return hash;
	}
}