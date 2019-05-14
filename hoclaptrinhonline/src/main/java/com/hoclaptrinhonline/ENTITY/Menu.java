package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Menu" database table.
 * 
 */
@Entity
@Table(name="\"Menu\"")
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"ActionName\"")
	private String actionName;

	@Column(name="\"ControllerName\"")
	private String controllerName;

	@Column(name="\"IDParrent\"")
	private int IDParrent;

	@Column(name="\"Link\"")
	private String link;

	@Column(name="\"MenuAction\"")
	private String menuAction;

	@Column(name="\"MenuController\"")
	private String menuController;

	@Column(name="\"Name\"")
	private String name;

	@Column(name="\"PageName\"")
	private String pageName;

	@Column(name="\"ParamId\"")
	private String paramId;

	@Column(name="\"Prioty\"")
	private int prioty;

	@Column(name="\"root\"")
	private boolean root;

	public Menu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getControllerName() {
		return this.controllerName;
	}

	public void setControllerName(String controllerName) {
		this.controllerName = controllerName;
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

	public String getMenuAction() {
		return this.menuAction;
	}

	public void setMenuAction(String menuAction) {
		this.menuAction = menuAction;
	}

	public String getMenuController() {
		return this.menuController;
	}

	public void setMenuController(String menuController) {
		this.menuController = menuController;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageName() {
		return this.pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getParamId() {
		return this.paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	public int getPrioty() {
		return this.prioty;
	}

	public void setPrioty(int prioty) {
		this.prioty = prioty;
	}

	public boolean getRoot() {
		return this.root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}

}