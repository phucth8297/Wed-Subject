package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Page" database table.
 * 
 */
@Entity
@Table(name="\"Page\"")
@NamedQuery(name="Page.findAll", query="SELECT p FROM Page p")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"IDPage\"")
	private int IDPage;

	@Column(name="\"Active\"")
	private boolean active;

	@Column(name="\"NamePage\"")
	private String namePage;

	//bi-directional many-to-one association to Menu
	@ManyToOne
	@JoinColumn(name="\"FK_Menu\"")
	private Menu menu;

	public Page() {
	}

	public int getIDPage() {
		return this.IDPage;
	}

	public void setIDPage(int IDPage) {
		this.IDPage = IDPage;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getNamePage() {
		return this.namePage;
	}

	public void setNamePage(String namePage) {
		this.namePage = namePage;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}