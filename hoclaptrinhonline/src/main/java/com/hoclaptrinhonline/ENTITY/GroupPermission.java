package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "GroupPermission" database table.
 * 
 */
@Entity
@Table(name="\"GroupPermission\"")
@NamedQuery(name="GroupPermission.findAll", query="SELECT g FROM GroupPermission g")
public class GroupPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GroupPermissionPK id;

	@Column(name="\"Allow\"")
	private boolean allow;

	public GroupPermission() {
	}

	public GroupPermissionPK getId() {
		return this.id;
	}

	public void setId(GroupPermissionPK id) {
		this.id = id;
	}

	public boolean getAllow() {
		return this.allow;
	}

	public void setAllow(boolean allow) {
		this.allow = allow;
	}

}