package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "SlideShow" database table.
 * 
 */
@Entity
@Table(name="\"SlideShow\"")
@NamedQuery(name="SlideShow.findAll", query="SELECT s FROM SlideShow s")
public class SlideShow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"HinhAnh\"")
	private String hinhAnh;

	@Column(name="\"IsLink\"")
	private boolean isLink;

	@Column(name="\"IsNewtab\"")
	private boolean isNewtab;

	@Column(name="\"LinkEvent\"")
	private String linkEvent;

	private int stt;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	public SlideShow() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public boolean getIsLink() {
		return this.isLink;
	}

	public void setIsLink(boolean isLink) {
		this.isLink = isLink;
	}

	public boolean getIsNewtab() {
		return this.isNewtab;
	}

	public void setIsNewtab(boolean isNewtab) {
		this.isNewtab = isNewtab;
	}

	public String getLinkEvent() {
		return this.linkEvent;
	}

	public void setLinkEvent(String linkEvent) {
		this.linkEvent = linkEvent;
	}

	public int getStt() {
		return this.stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

}