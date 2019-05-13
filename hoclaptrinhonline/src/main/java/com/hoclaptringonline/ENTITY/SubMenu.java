package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "SubMenu" database table.
 * 
 */
@Entity
@Table(name="\"SubMenu\"")
@NamedQuery(name="SubMenu.findAll", query="SELECT s FROM SubMenu s")
public class SubMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Link\"")
	private String link;

	@Column(name="\"Name\"")
	private String name;

	private int stt;

	public SubMenu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStt() {
		return this.stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

}