package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "MenuLeft" database table.
 * 
 */
@Entity
@Table(name="\"MenuLeft\"")
@NamedQuery(name="MenuLeft.findAll", query="SELECT m FROM MenuLeft m")
public class MenuLeft implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDMenu\"")
	private int IDMenu;

	@Column(name="\"IDParrent\"")
	private int IDParrent;

	@Column(name="\"Link\"")
	private String link;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"Prioty\"")
	private int prioty;

	public MenuLeft() {
	}

	public int getIDMenu() {
		return this.IDMenu;
	}

	public void setIDMenu(int IDMenu) {
		this.IDMenu = IDMenu;
	}

	public int getIDParrent() {
		return this.IDParrent;
	}

	public void setIDParrent(int IDParrent) {
		this.IDParrent = IDParrent;
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

	public int getPrioty() {
		return this.prioty;
	}

	public void setPrioty(int prioty) {
		this.prioty = prioty;
	}

}