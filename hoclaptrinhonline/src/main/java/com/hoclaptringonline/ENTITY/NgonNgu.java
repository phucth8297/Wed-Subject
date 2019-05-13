package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "NgonNgu" database table.
 * 
 */
@Entity
@Table(name="\"NgonNgu\"")
@NamedQuery(name="NgonNgu.findAll", query="SELECT n FROM NgonNgu n")
public class NgonNgu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="\"Chieu\"")
	private String chieu;

	@Column(name="\"Description\"")
	private String description;

	@Column(name="\"DiaChi\"")
	private String diaChi;

	@Column(name="\"DienThoai\"")
	private String dienThoai;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"Flat\"")
	private String flat;

	@Column(name="\"Head_Button\"")
	private String head_Button;

	@Column(name="\"Head_DangKy\"")
	private String head_DangKy;

	@Column(name="\"Head_DangNhap\"")
	private String head_DangNhap;

	@Column(name="\"Head_SoDo\"")
	private String head_SoDo;

	@Column(name="\"KeyWord\"")
	private String keyWord;

	@Column(name="\"PageTitle\"")
	private String pageTitle;

	@Column(name="\"Sang\"")
	private String sang;

	@Column(name="\"sCauHoi\"")
	private String sCauHoi;

	@Column(name="\"sCauHoiKhac\"")
	private String sCauHoiKhac;

	@Column(name="\"sCauTraLoi\"")
	private String sCauTraLoi;

	@Column(name="\"sDatLichKham\"")
	private String sDatLichKham;

	@Column(name="\"sDiaChi\"")
	private String sDiaChi;

	@Column(name="\"sDienThoai\"")
	private String sDienThoai;

	@Column(name="\"sGui\"")
	private String sGui;

	@Column(name="\"sGuiCauHoi\"")
	private String sGuiCauHoi;

	@Column(name="\"sHoTro\"")
	private String sHoTro;

	@Column(name="\"sHuy\"")
	private String sHuy;

	@Column(name="\"skype\"")
	private String skype;

	@Column(name="\"sLienHeKhachHang\"")
	private String sLienHeKhachHang;

	@Column(name="\"sMaBaoVe\"")
	private String sMaBaoVe;

	@Column(name="\"sNoiDung\"")
	private String sNoiDung;

	@Column(name="\"sSuKien\"")
	private String sSuKien;

	@Column(name="\"sTen\"")
	private String sTen;

	@Column(name="\"sTinMoiNhat\"")
	private String sTinMoiNhat;

	@Column(name="\"sTinTucKhac\"")
	private String sTinTucKhac;

	@Column(name="\"sXemTiep\"")
	private String sXemTiep;

	@Column(name="\"TenBenhVien\"")
	private String tenBenhVien;

	@Column(name="\"TenNgonNgu\"")
	private String tenNgonNgu;

	@Column(name="\"TieuDeLichKham\"")
	private String tieuDeLichKham;

	@Column(name="\"TieuDeNgay\"")
	private String tieuDeNgay;

	@Column(name="\"yahoo\"")
	private String yahoo;

	public NgonNgu() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChieu() {
		return this.chieu;
	}

	public void setChieu(String chieu) {
		this.chieu = chieu;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFlat() {
		return this.flat;
	}

	public void setFlat(String flat) {
		this.flat = flat;
	}

	public String getHead_Button() {
		return this.head_Button;
	}

	public void setHead_Button(String head_Button) {
		this.head_Button = head_Button;
	}

	public String getHead_DangKy() {
		return this.head_DangKy;
	}

	public void setHead_DangKy(String head_DangKy) {
		this.head_DangKy = head_DangKy;
	}

	public String getHead_DangNhap() {
		return this.head_DangNhap;
	}

	public void setHead_DangNhap(String head_DangNhap) {
		this.head_DangNhap = head_DangNhap;
	}

	public String getHead_SoDo() {
		return this.head_SoDo;
	}

	public void setHead_SoDo(String head_SoDo) {
		this.head_SoDo = head_SoDo;
	}

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getSang() {
		return this.sang;
	}

	public void setSang(String sang) {
		this.sang = sang;
	}

	public String getSCauHoi() {
		return this.sCauHoi;
	}

	public void setSCauHoi(String sCauHoi) {
		this.sCauHoi = sCauHoi;
	}

	public String getSCauHoiKhac() {
		return this.sCauHoiKhac;
	}

	public void setSCauHoiKhac(String sCauHoiKhac) {
		this.sCauHoiKhac = sCauHoiKhac;
	}

	public String getSCauTraLoi() {
		return this.sCauTraLoi;
	}

	public void setSCauTraLoi(String sCauTraLoi) {
		this.sCauTraLoi = sCauTraLoi;
	}

	public String getSDatLichKham() {
		return this.sDatLichKham;
	}

	public void setSDatLichKham(String sDatLichKham) {
		this.sDatLichKham = sDatLichKham;
	}

	public String getSDiaChi() {
		return this.sDiaChi;
	}

	public void setSDiaChi(String sDiaChi) {
		this.sDiaChi = sDiaChi;
	}

	public String getSDienThoai() {
		return this.sDienThoai;
	}

	public void setSDienThoai(String sDienThoai) {
		this.sDienThoai = sDienThoai;
	}

	public String getSGui() {
		return this.sGui;
	}

	public void setSGui(String sGui) {
		this.sGui = sGui;
	}

	public String getSGuiCauHoi() {
		return this.sGuiCauHoi;
	}

	public void setSGuiCauHoi(String sGuiCauHoi) {
		this.sGuiCauHoi = sGuiCauHoi;
	}

	public String getSHoTro() {
		return this.sHoTro;
	}

	public void setSHoTro(String sHoTro) {
		this.sHoTro = sHoTro;
	}

	public String getSHuy() {
		return this.sHuy;
	}

	public void setSHuy(String sHuy) {
		this.sHuy = sHuy;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getSLienHeKhachHang() {
		return this.sLienHeKhachHang;
	}

	public void setSLienHeKhachHang(String sLienHeKhachHang) {
		this.sLienHeKhachHang = sLienHeKhachHang;
	}

	public String getSMaBaoVe() {
		return this.sMaBaoVe;
	}

	public void setSMaBaoVe(String sMaBaoVe) {
		this.sMaBaoVe = sMaBaoVe;
	}

	public String getSNoiDung() {
		return this.sNoiDung;
	}

	public void setSNoiDung(String sNoiDung) {
		this.sNoiDung = sNoiDung;
	}

	public String getSSuKien() {
		return this.sSuKien;
	}

	public void setSSuKien(String sSuKien) {
		this.sSuKien = sSuKien;
	}

	public String getSTen() {
		return this.sTen;
	}

	public void setSTen(String sTen) {
		this.sTen = sTen;
	}

	public String getSTinMoiNhat() {
		return this.sTinMoiNhat;
	}

	public void setSTinMoiNhat(String sTinMoiNhat) {
		this.sTinMoiNhat = sTinMoiNhat;
	}

	public String getSTinTucKhac() {
		return this.sTinTucKhac;
	}

	public void setSTinTucKhac(String sTinTucKhac) {
		this.sTinTucKhac = sTinTucKhac;
	}

	public String getSXemTiep() {
		return this.sXemTiep;
	}

	public void setSXemTiep(String sXemTiep) {
		this.sXemTiep = sXemTiep;
	}

	public String getTenBenhVien() {
		return this.tenBenhVien;
	}

	public void setTenBenhVien(String tenBenhVien) {
		this.tenBenhVien = tenBenhVien;
	}

	public String getTenNgonNgu() {
		return this.tenNgonNgu;
	}

	public void setTenNgonNgu(String tenNgonNgu) {
		this.tenNgonNgu = tenNgonNgu;
	}

	public String getTieuDeLichKham() {
		return this.tieuDeLichKham;
	}

	public void setTieuDeLichKham(String tieuDeLichKham) {
		this.tieuDeLichKham = tieuDeLichKham;
	}

	public String getTieuDeNgay() {
		return this.tieuDeNgay;
	}

	public void setTieuDeNgay(String tieuDeNgay) {
		this.tieuDeNgay = tieuDeNgay;
	}

	public String getYahoo() {
		return this.yahoo;
	}

	public void setYahoo(String yahoo) {
		this.yahoo = yahoo;
	}

}