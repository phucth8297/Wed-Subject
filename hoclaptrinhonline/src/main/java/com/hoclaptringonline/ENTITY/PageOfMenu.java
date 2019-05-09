package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "PageOfMenu" database table.
 * 
 */
@Entity
@Table(name="\"PageOfMenu\"")
@NamedQuery(name="PageOfMenu.findAll", query="SELECT p FROM PageOfMenu p")
public class PageOfMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Active\"")
	private boolean active;

	@Column(name="\"FK_Menu\"")
	private int FK_Menu;

	@Column(name="\"NamePage\"")
	private String namePage;

	//bi-directional many-to-one association to MenuLeft
	@ManyToOne
	@JoinColumns({
		})
	private MenuLeft menuLeft;

	public PageOfMenu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getFK_Menu() {
		return this.FK_Menu;
	}

	public void setFK_Menu(int FK_Menu) {
		this.FK_Menu = FK_Menu;
	}

	public String getNamePage() {
		return this.namePage;
	}

	public void setNamePage(String namePage) {
		this.namePage = namePage;
	}

	public MenuLeft getMenuLeft() {
		return this.menuLeft;
	}

	public void setMenuLeft(MenuLeft menuLeft) {
		this.menuLeft = menuLeft;
	}

}