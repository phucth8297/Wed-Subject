package com.hoclaptrinhonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "TuyenDungThongBao" database table.
 * 
 */
@Entity
@Table(name="\"TuyenDungThongBao\"")
@NamedQuery(name="TuyenDungThongBao.findAll", query="SELECT t FROM TuyenDungThongBao t")
public class TuyenDungThongBao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhMinhHoa\"")
	private String hinhMinhHoa;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgayTao\"")
	private Timestamp ngayTao;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	private int stt;

	@Column(name="\"TieuDe\"")
	private String tieuDe;

	public TuyenDungThongBao() {
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

	public String getHinhMinhHoa() {
		return this.hinhMinhHoa;
	}

	public void setHinhMinhHoa(String hinhMinhHoa) {
		this.hinhMinhHoa = hinhMinhHoa;
	}

	public int getLuotXem() {
		return this.luotXem;
	}

	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
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