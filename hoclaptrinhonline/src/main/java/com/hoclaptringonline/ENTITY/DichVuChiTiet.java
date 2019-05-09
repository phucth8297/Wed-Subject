package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "DichVuChiTiet" database table.
 * 
 */
@Entity
@Table(name="\"DichVuChiTiet\"")
@NamedQuery(name="DichVuChiTiet.findAll", query="SELECT d FROM DichVuChiTiet d")
public class DichVuChiTiet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DichVuChiTietPK idPK;

	@Column(name="\"FK_UserModify\"")
	private String FK_UserModify;

	@Column(name="\"GioiThieu\"")
	private String gioiThieu;

	@Column(name="\"HinhAnh\"")
	private String hinhAnh;

	private int id;

	@Column(name="\"LuotXem\"")
	private int luotXem;

	@Column(name="\"NgayChinhSua\"")
	private Timestamp ngayChinhSua;

	@Column(name="\"NgayTao\"")
	private Timestamp ngayTao;

	@Lob
	@Column(name="\"NoiDung\"")
	private String noiDung;

	@Column(name="\"TenDichVu\"")
	private String tenDichVu;

	//bi-directional many-to-one association to DichVu
	@ManyToOne
	@JoinColumns({
		})
	private DichVu dichVu;

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

	public DichVuChiTiet() {
	}

	public DichVuChiTietPK getIdPK() {
		return this.idPK;
	}

	public void setId(DichVuChiTietPK idPK) {
		this.idPK = idPK;
	}

	public String getFK_UserModify() {
		return this.FK_UserModify;
	}

	public void setFK_UserModify(String FK_UserModify) {
		this.FK_UserModify = FK_UserModify;
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

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLuotXem() {
		return this.luotXem;
	}

	public void setLuotXem(int luotXem) {
		this.luotXem = luotXem;
	}

	public Timestamp getNgayChinhSua() {
		return this.ngayChinhSua;
	}

	public void setNgayChinhSua(Timestamp ngayChinhSua) {
		this.ngayChinhSua = ngayChinhSua;
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

	public String getTenDichVu() {
		return this.tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public DichVu getDichVu() {
		return this.dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
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