package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "UserPermission" database table.
 * 
 */
@Embeddable
public class UserPermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_User\"", insertable=false, updatable=false)
	private String FK_User;

	@Column(name="\"FK_Permission\"", insertable=false, updatable=false)
	private int FK_Permission;

	public UserPermissionPK() {
	}
	public String getFK_User() {
		return this.FK_User;
	}
	public void setFK_User(String FK_User) {
		this.FK_User = FK_User;
	}
	public int getFK_Permission() {
		return this.FK_Permission;
	}
	public void setFK_Permission(int FK_Permission) {
		this.FK_Permission = FK_Permission;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserPermissionPK)) {
			return false;
		}
		UserPermissionPK castOther = (UserPermissionPK)other;
		return 
			this.FK_User.equals(castOther.FK_User)
			&& (this.FK_Permission == castOther.FK_Permission);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_User.hashCode();
		hash = hash * prime + this.FK_Permission;
		
		return hash;
	}
}