package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ImagePage" database table.
 * 
 */
@Entity
@Table(name="\"ImagePage\"")
@NamedQuery(name="ImagePage.findAll", query="SELECT i FROM ImagePage i")
public class ImagePage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ImagePagePK id;

	private int id;

	@Column(name="\"ImagePath\"")
	private String imagePath;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumn(name="\"FK_NgonNgu\"")
	private NgonNgu ngonNgu;

	public ImagePage() {
	}

	public ImagePagePK getId() {
		return this.id;
	}

	public void setId(ImagePagePK id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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