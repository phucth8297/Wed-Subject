package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "LienKetWebSite" database table.
 * 
 */
@Entity
@Table(name="\"LienKetWebSite\"")
@NamedQuery(name="LienKetWebSite.findAll", query="SELECT l FROM LienKetWebSite l")
public class LienKetWebSite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Link\"")
	private String link;

	private int stt;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumn(name="\"FK_NgonNgu\"")
	private NgonNgu ngonNgu;

	public LienKetWebSite() {
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

}