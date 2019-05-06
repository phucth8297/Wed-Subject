package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to GroupPermission
	@OneToMany(mappedBy="permission")
	private List<GroupPermission> groupPermissions;

	//bi-directional many-to-one association to UserPermission
	@OneToMany(mappedBy="permission")
	private List<UserPermission> userPermissions;

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

	public List<GroupPermission> getGroupPermissions() {
		return this.groupPermissions;
	}

	public void setGroupPermissions(List<GroupPermission> groupPermissions) {
		this.groupPermissions = groupPermissions;
	}

	public GroupPermission addGroupPermission(GroupPermission groupPermission) {
		getGroupPermissions().add(groupPermission);
		groupPermission.setPermission(this);

		return groupPermission;
	}

	public GroupPermission removeGroupPermission(GroupPermission groupPermission) {
		getGroupPermissions().remove(groupPermission);
		groupPermission.setPermission(null);

		return groupPermission;
	}

	public List<UserPermission> getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public UserPermission addUserPermission(UserPermission userPermission) {
		getUserPermissions().add(userPermission);
		userPermission.setPermission(this);

		return userPermission;
	}

	public UserPermission removeUserPermission(UserPermission userPermission) {
		getUserPermissions().remove(userPermission);
		userPermission.setPermission(null);

		return userPermission;
	}

}