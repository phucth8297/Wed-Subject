package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "UserPermission" database table.
 * 
 */
@Entity
@Table(name="\"UserPermission\"")
@NamedQuery(name="UserPermission.findAll", query="SELECT u FROM UserPermission u")
public class UserPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserPermissionPK id;

	@Column(name="\"Allow\"")
	private boolean allow;

	public UserPermission() {
	}

	public UserPermissionPK getId() {
		return this.id;
	}

	public void setId(UserPermissionPK id) {
		this.id = id;
	}

	public boolean getAllow() {
		return this.allow;
	}

	public void setAllow(boolean allow) {
		this.allow = allow;
	}

}