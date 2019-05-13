package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "HoatDong" database table.
 * 
 */
@Entity
@Table(name="\"HoatDong\"")
@NamedQuery(name="HoatDong.findAll", query="SELECT h FROM HoatDong h")
public class HoatDong implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Author\"")
	private String author;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhAnhMinhHoa\"")
	private String hinhAnhMinhHoa;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgaySua\"")
	private Timestamp ngaySua;

	@Column(name="\"NgayTao\"")
	private Timestamp ngayTao;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	private int stt;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	public HoatDong() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGioiThieu() {
		return this.gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public String getHinhAnhMinhHoa() {
		return this.hinhAnhMinhHoa;
	}

	public void setHinhAnhMinhHoa(String hinhAnhMinhHoa) {
		this.hinhAnhMinhHoa = hinhAnhMinhHoa;
	}

	public int getLuotXem() {
		return this.luotXem;
	}

	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
	}

	public Timestamp getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Timestamp ngaySua) {
		this.ngaySua = ngaySua;
	}

	public Timestamp getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Timestamp ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
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