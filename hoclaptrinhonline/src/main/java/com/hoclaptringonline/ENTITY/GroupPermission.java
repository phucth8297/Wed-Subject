package com.hoclaptringonline.ENTITY;

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

	//bi-directional many-to-one association to Group
	@ManyToOne
	@JoinColumns({
		})
	private Group group;

	//bi-directional many-to-one association to Permission
	@ManyToOne
	@JoinColumns({
		})
	private Permission permission;

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

	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

}