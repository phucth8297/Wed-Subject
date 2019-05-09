package com.hoclaptringonline.ENTITY;

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

	@Column(name="\"FK_LoaiTuyenDung\"")
	private int FK_LoaiTuyenDung;

	@Column(name="\"FK_NgonNGu\"")
	private int FK_NgonNGu;

	@Column(name="\"FK_NguoiTao\"")
	private String FK_NguoiTao;

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

	//bi-directional many-to-one association to LoaiTuyenDung
	@ManyToOne
	@JoinColumns({
		})
	private LoaiTuyenDung loaiTuyenDung;

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

	public TuyenDungThongBao() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFK_LoaiTuyenDung() {
		return this.FK_LoaiTuyenDung;
	}

	public void setFK_LoaiTuyenDung(int FK_LoaiTuyenDung) {
		this.FK_LoaiTuyenDung = FK_LoaiTuyenDung;
	}

	public int getFK_NgonNGu() {
		return this.FK_NgonNGu;
	}

	public void setFK_NgonNGu(int FK_NgonNGu) {
		this.FK_NgonNGu = FK_NgonNGu;
	}

	public String getFK_NguoiTao() {
		return this.FK_NguoiTao;
	}

	public void setFK_NguoiTao(String FK_NguoiTao) {
		this.FK_NguoiTao = FK_NguoiTao;
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

	public LoaiTuyenDung getLoaiTuyenDung() {
		return this.loaiTuyenDung;
	}

	public void setLoaiTuyenDung(LoaiTuyenDung loaiTuyenDung) {
		this.loaiTuyenDung = loaiTuyenDung;
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