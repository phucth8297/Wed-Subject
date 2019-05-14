package com.hoclaptrinhonline.ENTITY;

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

	@Column(name="\"NamePage\"")
	private String namePage;

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

	public String getNamePage() {
		return this.namePage;
	}

	public void setNamePage(String namePage) {
		this.namePage = namePage;
	}

}