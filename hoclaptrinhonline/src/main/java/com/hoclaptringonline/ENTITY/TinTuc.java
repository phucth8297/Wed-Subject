package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "TinTuc" database table.
 * 
 */
@Entity
@Table(name="\"TinTuc\"")
@NamedQuery(name="TinTuc.findAll", query="SELECT t FROM TinTuc t")
public class TinTuc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Author\"")
	private String author;

	@Column(name="\"FK_LoaiTin\"")
	private int FK_LoaiTin;

	@Column(name="\"FK_NgonNgu\"")
	private int FK_NgonNgu;

	@Column(name="\"FK_UserNguoiSua\"")
	private String FK_UserNguoiSua;

	@Column(name="\"FK_UserNguoiTao\"")
	private String FK_UserNguoiTao;

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

	//bi-directional many-to-one association to LoaiTin
	@ManyToOne
	@JoinColumns({
		})
	private LoaiTin loaiTin;

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

	public TinTuc() {
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

	public int getFK_LoaiTin() {
		return this.FK_LoaiTin;
	}

	public void setFK_LoaiTin(int FK_LoaiTin) {
		this.FK_LoaiTin = FK_LoaiTin;
	}

	public int getFK_NgonNgu() {
		return this.FK_NgonNgu;
	}

	public void setFK_NgonNgu(int FK_NgonNgu) {
		this.FK_NgonNgu = FK_NgonNgu;
	}

	public String getFK_UserNguoiSua() {
		return this.FK_UserNguoiSua;
	}

	public void setFK_UserNguoiSua(String FK_UserNguoiSua) {
		this.FK_UserNguoiSua = FK_UserNguoiSua;
	}

	public String getFK_UserNguoiTao() {
		return this.FK_UserNguoiTao;
	}

	public void setFK_UserNguoiTao(String FK_UserNguoiTao) {
		this.FK_UserNguoiTao = FK_UserNguoiTao;
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

	public LoaiTin getLoaiTin() {
		return this.loaiTin;
	}

	public void setLoaiTin(LoaiTin loaiTin) {
		this.loaiTin = loaiTin;
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