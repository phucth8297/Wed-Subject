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

	@Column(name="\"FK_NgonNgu\"")
	private int FK_NgonNgu;

	@Column(name="\"FK_UserTao\"")
	private String FK_UserTao;

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

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumns({
		})
	private NgonNgu ngonNgu;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user;

	public Event() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}

	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}

	public String getFK_UserTao() {
		return this.FK_UserTao;
	}

	public void setFK_UserTao(String FK_UserTao) {
		this.FK_UserTao = FK_UserTao;
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

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}