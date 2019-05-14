package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Permission" database table.
 * 
 */
@Entity
@Table(name="\"Permission\"")
@NamedQuery(name="Permission.findAll", query="SELECT p FROM Permission p")
public class Permission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDPermission\"")
	private int IDPermission;

	@Column(name="\"Active\"")
	private boolean active;

	@Column(name="\"PageName\"")
	private String pageName;

	@Column(name="\"PermissionName\"")
	private String permissionName;

	public Permission() {
	}

	public int getIDPermission() {
		return this.IDPermission;
	}

	public void setIDPermission(int IDPermission) {
		this.IDPermission = IDPermission;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

}