package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "GroupPermission" database table.
 * 
 */
@Embeddable
public class GroupPermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"FK_Group\"", insertable=false, updatable=false)
	private int FK_Group;

	@Column(name="\"FK_Permission\"", insertable=false, updatable=false)
	private int FK_Permission;

	public GroupPermissionPK() {
	}
	public int getFK_Group() {
		return this.FK_Group;
	}
	public void setFK_Group(int FK_Group) {
		this.FK_Group = FK_Group;
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
		if (!(other instanceof GroupPermissionPK)) {
			return false;
		}
		GroupPermissionPK castOther = (GroupPermissionPK)other;
		return 
			(this.FK_Group == castOther.FK_Group)
			&& (this.FK_Permission == castOther.FK_Permission);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.FK_Group;
		hash = hash * prime + this.FK_Permission;
		
		return hash;
	}
}