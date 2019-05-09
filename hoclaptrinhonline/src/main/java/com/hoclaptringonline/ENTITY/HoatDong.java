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

	@Column(name="\"FK_LoaiHoatDong\"")
	private int FK_LoaiHoatDong;

	@Column(name="\"FK_NgonNgu\"")
	private int FK_NgonNgu;

	@Column(name="\"FK_NguoiSua\"")
	private String FK_NguoiSua;

	@Column(name="\"FK_NguoiTao\"")
	private String FK_NguoiTao;

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

	//bi-directional many-to-one association to LoaiHoatDong
	@ManyToOne
	@JoinColumns({
		})
	private LoaiHoatDong loaiHoatDong;

	//bi-directional many-to-one association to NgonNgu
	@ManyToOne
	@JoinColumns({
		})
	private NgonNgu ngonNgu;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user2;

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

	public int getFK_LoaiHoatDong() {
		return this.FK_LoaiHoatDong;
	}

	public void setFK_LoaiHoatDong(int FK_LoaiHoatDong) {
		this.FK_LoaiHoatDong = FK_LoaiHoatDong;
	}

	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}

	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}

	public String getFK_NguoiSua() {
		return this.FK_NguoiSua;
	}

	public void setFK_NguoiSua(String FK_NguoiSua) {
		this.FK_NguoiSua = FK_NguoiSua;
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

	public LoaiHoatDong getLoaiHoatDong() {
		return this.loaiHoatDong;
	}

	public void setLoaiHoatDong(LoaiHoatDong loaiHoatDong) {
		this.loaiHoatDong = loaiHoatDong;
	}

	public NgonNgu getNgonNgu() {
		return this.ngonNgu;
	}

	public void setNgonNgu(NgonNgu ngonNgu) {
		this.ngonNgu = ngonNgu;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

}