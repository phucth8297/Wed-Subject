package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Group" database table.
 * 
 */
@Entity
@Table(name="\"Group\"")
@NamedQuery(name="Group.findAll", query="SELECT g FROM Group g")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"GroupName\"")
	private String groupName;

	//bi-directional many-to-one association to GroupPermission
	@OneToMany(mappedBy="group")
	private List<GroupPermission> groupPermissions;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="group")
	private List<User> users;

	public Group() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<GroupPermission> getGroupPermissions() {
		return this.groupPermissions;
	}

	public void setGroupPermissions(List<GroupPermission> groupPermissions) {
		this.groupPermissions = groupPermissions;
	}

	public GroupPermission addGroupPermission(GroupPermission groupPermission) {
		getGroupPermissions().add(groupPermission);
		groupPermission.setGroup(this);

		return groupPermission;
	}

	public GroupPermission removeGroupPermission(GroupPermission groupPermission) {
		getGroupPermissions().remove(groupPermission);
		groupPermission.setGroup(null);

		return groupPermission;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setGroup(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setGroup(null);

		return user;
	}

}