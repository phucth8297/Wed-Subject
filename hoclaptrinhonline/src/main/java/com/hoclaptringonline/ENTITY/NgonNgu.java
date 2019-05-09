package com.hoclaptringonline.ENTITY;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to DichVuChiTiet
	@OneToMany(mappedBy="ngonNgu")
	private List<DichVuChiTiet> dichVuChiTiets;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="ngonNgu")
	private List<Event> events;

	//bi-directional many-to-one association to GioiThieuChiTiet
	@OneToMany(mappedBy="ngonNgu")
	private List<GioiThieuChiTiet> gioiThieuChiTiets;

	//bi-directional many-to-one association to HoatDong
	@OneToMany(mappedBy="ngonNgu")
	private List<HoatDong> hoatDongs;

	//bi-directional many-to-one association to ImagePage
	@OneToMany(mappedBy="ngonNgu")
	private List<ImagePage> imagePages;

	//bi-directional many-to-one association to KhoaPhong
	@OneToMany(mappedBy="ngonNgu")
	private List<KhoaPhong> khoaPhongs;

	//bi-directional many-to-one association to LichNgay
	@OneToMany(mappedBy="ngonNgu")
	private List<LichNgay> lichNgays;

	//bi-directional many-to-one association to LienKetWebSite
	@OneToMany(mappedBy="ngonNgu")
	private List<LienKetWebSite> lienKetWebSites;

	//bi-directional many-to-one association to LoaiCauHoi
	@OneToMany(mappedBy="ngonNgu")
	private List<LoaiCauHoi> loaiCauHois;

	//bi-directional many-to-one association to LoaiTuyenDung
	@OneToMany(mappedBy="ngonNgu")
	private List<LoaiTuyenDung> loaiTuyenDungs;

	//bi-directional many-to-one association to Menu
	@OneToMany(mappedBy="ngonNgu")
	private List<Menu> menus;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="ngonNgu")
	private List<Message> messages;

	//bi-directional many-to-one association to NoiDungTinhChiTiet
	@OneToMany(mappedBy="ngonNgu")
	private List<NoiDungTinhChiTiet> noiDungTinhChiTiets;

	//bi-directional many-to-one association to PhanHoi
	@OneToMany(mappedBy="ngonNgu")
	private List<PhanHoi> phanHois;

	//bi-directional many-to-one association to PhongKham
	@OneToMany(mappedBy="ngonNgu")
	private List<PhongKham> phongKhams;

	//bi-directional many-to-one association to SlideShow
	@OneToMany(mappedBy="ngonNgu")
	private List<SlideShow> slideShows;

	//bi-directional many-to-one association to SubMenu
	@OneToMany(mappedBy="ngonNgu")
	private List<SubMenu> subMenus;

	//bi-directional many-to-one association to SubNote
	@OneToMany(mappedBy="ngonNgu")
	private List<SubNote> subNotes;

	//bi-directional many-to-one association to SubPhone
	@OneToMany(mappedBy="ngonNgu")
	private List<SubPhone> subPhones;

	//bi-directional many-to-one association to TinTuc
	@OneToMany(mappedBy="ngonNgu")
	private List<TinTuc> tinTucs;

	//bi-directional many-to-one association to TinhTrangHonNhan
	@OneToMany(mappedBy="ngonNgu")
	private List<TinhTrangHonNhan> tinhTrangHonNhans;

	//bi-directional many-to-one association to TuyenDungThongBao
	@OneToMany(mappedBy="ngonNgu")
	private List<TuyenDungThongBao> tuyenDungThongBaos;

	//bi-directional many-to-one association to Video
	@OneToMany(mappedBy="ngonNgu")
	private List<Video> videos;

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

	public List<DichVuChiTiet> getDichVuChiTiets() {
		return this.dichVuChiTiets;
	}

	public void setDichVuChiTiets(List<DichVuChiTiet> dichVuChiTiets) {
		this.dichVuChiTiets = dichVuChiTiets;
	}

	public DichVuChiTiet addDichVuChiTiet(DichVuChiTiet dichVuChiTiet) {
		getDichVuChiTiets().add(dichVuChiTiet);
		dichVuChiTiet.setNgonNgu(this);

		return dichVuChiTiet;
	}

	public DichVuChiTiet removeDichVuChiTiet(DichVuChiTiet dichVuChiTiet) {
		getDichVuChiTiets().remove(dichVuChiTiet);
		dichVuChiTiet.setNgonNgu(null);

		return dichVuChiTiet;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Event addEvent(Event event) {
		getEvents().add(event);
		event.setNgonNgu(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setNgonNgu(null);

		return event;
	}

	public List<GioiThieuChiTiet> getGioiThieuChiTiets() {
		return this.gioiThieuChiTiets;
	}

	public void setGioiThieuChiTiets(List<GioiThieuChiTiet> gioiThieuChiTiets) {
		this.gioiThieuChiTiets = gioiThieuChiTiets;
	}

	public GioiThieuChiTiet addGioiThieuChiTiet(GioiThieuChiTiet gioiThieuChiTiet) {
		getGioiThieuChiTiets().add(gioiThieuChiTiet);
		gioiThieuChiTiet.setNgonNgu(this);

		return gioiThieuChiTiet;
	}

	public GioiThieuChiTiet removeGioiThieuChiTiet(GioiThieuChiTiet gioiThieuChiTiet) {
		getGioiThieuChiTiets().remove(gioiThieuChiTiet);
		gioiThieuChiTiet.setNgonNgu(null);

		return gioiThieuChiTiet;
	}

	public List<HoatDong> getHoatDongs() {
		return this.hoatDongs;
	}

	public void setHoatDongs(List<HoatDong> hoatDongs) {
		this.hoatDongs = hoatDongs;
	}

	public HoatDong addHoatDong(HoatDong hoatDong) {
		getHoatDongs().add(hoatDong);
		hoatDong.setNgonNgu(this);

		return hoatDong;
	}

	public HoatDong removeHoatDong(HoatDong hoatDong) {
		getHoatDongs().remove(hoatDong);
		hoatDong.setNgonNgu(null);

		return hoatDong;
	}

	public List<ImagePage> getImagePages() {
		return this.imagePages;
	}

	public void setImagePages(List<ImagePage> imagePages) {
		this.imagePages = imagePages;
	}

	public ImagePage addImagePage(ImagePage imagePage) {
		getImagePages().add(imagePage);
		imagePage.setNgonNgu(this);

		return imagePage;
	}

	public ImagePage removeImagePage(ImagePage imagePage) {
		getImagePages().remove(imagePage);
		imagePage.setNgonNgu(null);

		return imagePage;
	}

	public List<KhoaPhong> getKhoaPhongs() {
		return this.khoaPhongs;
	}

	public void setKhoaPhongs(List<KhoaPhong> khoaPhongs) {
		this.khoaPhongs = khoaPhongs;
	}

	public KhoaPhong addKhoaPhong(KhoaPhong khoaPhong) {
		getKhoaPhongs().add(khoaPhong);
		khoaPhong.setNgonNgu(this);

		return khoaPhong;
	}

	public KhoaPhong removeKhoaPhong(KhoaPhong khoaPhong) {
		getKhoaPhongs().remove(khoaPhong);
		khoaPhong.setNgonNgu(null);

		return khoaPhong;
	}

	public List<LichNgay> getLichNgays() {
		return this.lichNgays;
	}

	public void setLichNgays(List<LichNgay> lichNgays) {
		this.lichNgays = lichNgays;
	}

	public LichNgay addLichNgay(LichNgay lichNgay) {
		getLichNgays().add(lichNgay);
		lichNgay.setNgonNgu(this);

		return lichNgay;
	}

	public LichNgay removeLichNgay(LichNgay lichNgay) {
		getLichNgays().remove(lichNgay);
		lichNgay.setNgonNgu(null);

		return lichNgay;
	}

	public List<LienKetWebSite> getLienKetWebSites() {
		return this.lienKetWebSites;
	}

	public void setLienKetWebSites(List<LienKetWebSite> lienKetWebSites) {
		this.lienKetWebSites = lienKetWebSites;
	}

	public LienKetWebSite addLienKetWebSite(LienKetWebSite lienKetWebSite) {
		getLienKetWebSites().add(lienKetWebSite);
		lienKetWebSite.setNgonNgu(this);

		return lienKetWebSite;
	}

	public LienKetWebSite removeLienKetWebSite(LienKetWebSite lienKetWebSite) {
		getLienKetWebSites().remove(lienKetWebSite);
		lienKetWebSite.setNgonNgu(null);

		return lienKetWebSite;
	}

	public List<LoaiCauHoi> getLoaiCauHois() {
		return this.loaiCauHois;
	}

	public void setLoaiCauHois(List<LoaiCauHoi> loaiCauHois) {
		this.loaiCauHois = loaiCauHois;
	}

	public LoaiCauHoi addLoaiCauHoi(LoaiCauHoi loaiCauHoi) {
		getLoaiCauHois().add(loaiCauHoi);
		loaiCauHoi.setNgonNgu(this);

		return loaiCauHoi;
	}

	public LoaiCauHoi removeLoaiCauHoi(LoaiCauHoi loaiCauHoi) {
		getLoaiCauHois().remove(loaiCauHoi);
		loaiCauHoi.setNgonNgu(null);

		return loaiCauHoi;
	}

	public List<LoaiTuyenDung> getLoaiTuyenDungs() {
		return this.loaiTuyenDungs;
	}

	public void setLoaiTuyenDungs(List<LoaiTuyenDung> loaiTuyenDungs) {
		this.loaiTuyenDungs = loaiTuyenDungs;
	}

	public LoaiTuyenDung addLoaiTuyenDung(LoaiTuyenDung loaiTuyenDung) {
		getLoaiTuyenDungs().add(loaiTuyenDung);
		loaiTuyenDung.setNgonNgu(this);

		return loaiTuyenDung;
	}

	public LoaiTuyenDung removeLoaiTuyenDung(LoaiTuyenDung loaiTuyenDung) {
		getLoaiTuyenDungs().remove(loaiTuyenDung);
		loaiTuyenDung.setNgonNgu(null);

		return loaiTuyenDung;
	}

	public List<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public Menu addMenus(Menu menus) {
		getMenus().add(menus);
		menus.setNgonNgu(this);

		return menus;
	}

	public Menu removeMenus(Menu menus) {
		getMenus().remove(menus);
		menus.setNgonNgu(null);

		return menus;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setNgonNgu(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setNgonNgu(null);

		return message;
	}

	public List<NoiDungTinhChiTiet> getNoiDungTinhChiTiets() {
		return this.noiDungTinhChiTiets;
	}

	public void setNoiDungTinhChiTiets(List<NoiDungTinhChiTiet> noiDungTinhChiTiets) {
		this.noiDungTinhChiTiets = noiDungTinhChiTiets;
	}

	public NoiDungTinhChiTiet addNoiDungTinhChiTiet(NoiDungTinhChiTiet noiDungTinhChiTiet) {
		getNoiDungTinhChiTiets().add(noiDungTinhChiTiet);
		noiDungTinhChiTiet.setNgonNgu(this);

		return noiDungTinhChiTiet;
	}

	public NoiDungTinhChiTiet removeNoiDungTinhChiTiet(NoiDungTinhChiTiet noiDungTinhChiTiet) {
		getNoiDungTinhChiTiets().remove(noiDungTinhChiTiet);
		noiDungTinhChiTiet.setNgonNgu(null);

		return noiDungTinhChiTiet;
	}

	public List<PhanHoi> getPhanHois() {
		return this.phanHois;
	}

	public void setPhanHois(List<PhanHoi> phanHois) {
		this.phanHois = phanHois;
	}

	public PhanHoi addPhanHoi(PhanHoi phanHoi) {
		getPhanHois().add(phanHoi);
		phanHoi.setNgonNgu(this);

		return phanHoi;
	}

	public PhanHoi removePhanHoi(PhanHoi phanHoi) {
		getPhanHois().remove(phanHoi);
		phanHoi.setNgonNgu(null);

		return phanHoi;
	}

	public List<PhongKham> getPhongKhams() {
		return this.phongKhams;
	}

	public void setPhongKhams(List<PhongKham> phongKhams) {
		this.phongKhams = phongKhams;
	}

	public PhongKham addPhongKham(PhongKham phongKham) {
		getPhongKhams().add(phongKham);
		phongKham.setNgonNgu(this);

		return phongKham;
	}

	public PhongKham removePhongKham(PhongKham phongKham) {
		getPhongKhams().remove(phongKham);
		phongKham.setNgonNgu(null);

		return phongKham;
	}

	public List<SlideShow> getSlideShows() {
		return this.slideShows;
	}

	public void setSlideShows(List<SlideShow> slideShows) {
		this.slideShows = slideShows;
	}

	public SlideShow addSlideShow(SlideShow slideShow) {
		getSlideShows().add(slideShow);
		slideShow.setNgonNgu(this);

		return slideShow;
	}

	public SlideShow removeSlideShow(SlideShow slideShow) {
		getSlideShows().remove(slideShow);
		slideShow.setNgonNgu(null);

		return slideShow;
	}

	public List<SubMenu> getSubMenus() {
		return this.subMenus;
	}

	public void setSubMenus(List<SubMenu> subMenus) {
		this.subMenus = subMenus;
	}

	public SubMenu addSubMenus(SubMenu subMenus) {
		getSubMenus().add(subMenus);
		subMenus.setNgonNgu(this);

		return subMenus;
	}

	public SubMenu removeSubMenus(SubMenu subMenus) {
		getSubMenus().remove(subMenus);
		subMenus.setNgonNgu(null);

		return subMenus;
	}

	public List<SubNote> getSubNotes() {
		return this.subNotes;
	}

	public void setSubNotes(List<SubNote> subNotes) {
		this.subNotes = subNotes;
	}

	public SubNote addSubNote(SubNote subNote) {
		getSubNotes().add(subNote);
		subNote.setNgonNgu(this);

		return subNote;
	}

	public SubNote removeSubNote(SubNote subNote) {
		getSubNotes().remove(subNote);
		subNote.setNgonNgu(null);

		return subNote;
	}

	public List<SubPhone> getSubPhones() {
		return this.subPhones;
	}

	public void setSubPhones(List<SubPhone> subPhones) {
		this.subPhones = subPhones;
	}

	public SubPhone addSubPhone(SubPhone subPhone) {
		getSubPhones().add(subPhone);
		subPhone.setNgonNgu(this);

		return subPhone;
	}

	public SubPhone removeSubPhone(SubPhone subPhone) {
		getSubPhones().remove(subPhone);
		subPhone.setNgonNgu(null);

		return subPhone;
	}

	public List<TinTuc> getTinTucs() {
		return this.tinTucs;
	}

	public void setTinTucs(List<TinTuc> tinTucs) {
		this.tinTucs = tinTucs;
	}

	public TinTuc addTinTuc(TinTuc tinTuc) {
		getTinTucs().add(tinTuc);
		tinTuc.setNgonNgu(this);

		return tinTuc;
	}

	public TinTuc removeTinTuc(TinTuc tinTuc) {
		getTinTucs().remove(tinTuc);
		tinTuc.setNgonNgu(null);

		return tinTuc;
	}

	public List<TinhTrangHonNhan> getTinhTrangHonNhans() {
		return this.tinhTrangHonNhans;
	}

	public void setTinhTrangHonNhans(List<TinhTrangHonNhan> tinhTrangHonNhans) {
		this.tinhTrangHonNhans = tinhTrangHonNhans;
	}

	public TinhTrangHonNhan addTinhTrangHonNhan(TinhTrangHonNhan tinhTrangHonNhan) {
		getTinhTrangHonNhans().add(tinhTrangHonNhan);
		tinhTrangHonNhan.setNgonNgu(this);

		return tinhTrangHonNhan;
	}

	public TinhTrangHonNhan removeTinhTrangHonNhan(TinhTrangHonNhan tinhTrangHonNhan) {
		getTinhTrangHonNhans().remove(tinhTrangHonNhan);
		tinhTrangHonNhan.setNgonNgu(null);

		return tinhTrangHonNhan;
	}

	public List<TuyenDungThongBao> getTuyenDungThongBaos() {
		return this.tuyenDungThongBaos;
	}

	public void setTuyenDungThongBaos(List<TuyenDungThongBao> tuyenDungThongBaos) {
		this.tuyenDungThongBaos = tuyenDungThongBaos;
	}

	public TuyenDungThongBao addTuyenDungThongBao(TuyenDungThongBao tuyenDungThongBao) {
		getTuyenDungThongBaos().add(tuyenDungThongBao);
		tuyenDungThongBao.setNgonNgu(this);

		return tuyenDungThongBao;
	}

	public TuyenDungThongBao removeTuyenDungThongBao(TuyenDungThongBao tuyenDungThongBao) {
		getTuyenDungThongBaos().remove(tuyenDungThongBao);
		tuyenDungThongBao.setNgonNgu(null);

		return tuyenDungThongBao;
	}

	public List<Video> getVideos() {
		return this.videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public Video addVideo(Video video) {
		getVideos().add(video);
		video.setNgonNgu(this);

		return video;
	}

	public Video removeVideo(Video video) {
		getVideos().remove(video);
		video.setNgonNgu(null);

		return video;
	}

}