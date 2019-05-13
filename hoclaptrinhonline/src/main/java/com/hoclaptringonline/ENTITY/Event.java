package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "Event" database table.
 * 
 */
@Entity
@Table(name="\"Event\"")
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhAnh\"")
	private String hinhAnh;

	@Column(name="\"Link\"")
	private String link;

	@Column(name="\"NewTab\"")
	private boolean newTab;

	@Column(name="\"NgayTao\"")
	private Timestamp ngayTao;

	private int stt;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	public Event() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGioiThieu() {
		return this.gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public String getHinhAnh() {
		return this.hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public boolean getNewTab() {
		return this.newTab;
	}

	public void setNewTab(boolean newTab) {
		this.newTab = newTab;
	}

	public Timestamp getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Timestamp ngayTao) {
		this.ngayTao = ngayTao;
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