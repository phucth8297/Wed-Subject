package com.hoclaptrinhonline.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the "User" database table.
 * 
 */
@Entity
@Table(name="\"User\"")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"UserName\"")
	private String userName;

	@Column(name="\"Active\"")
	private boolean active;

	@Column(name="\"Email\"")
	private String email;

	@Column(name="\"HoVaTen\"")
	private String hoVaTen;

	@Column(name="\"LastLogin\"")
	private Timestamp lastLogin;

	@Column(name="\"NearLastLogin\"")
	private Timestamp nearLastLogin;

	@Column(name="\"PassWord\"")
	private String passWord;

	//bi-directional many-to-one association to DichVuChiTiet
	@OneToMany(mappedBy="user")
	private List<DichVuChiTiet> dichVuChiTiets;

	//bi-directional many-to-one association to Event
	@OneToMany(mappedBy="user")
	private List<Event> events;

	//bi-directional many-to-one association to GioiThieuChiTiet
	@OneToMany(mappedBy="user")
	private List<GioiThieuChiTiet> gioiThieuChiTiets;

	//bi-directional many-to-one association to HoatDong
	@OneToMany(mappedBy="user1")
	private List<HoatDong> hoatDongs1;

	//bi-directional many-to-one association to HoatDong
	@OneToMany(mappedBy="user2")
	private List<HoatDong> hoatDongs2;

	//bi-directional many-to-one association to HoiDapYKhoa
	@OneToMany(mappedBy="user")
	private List<HoiDapYKhoa> hoiDapYkhoas;

	//bi-directional many-to-one association to LienHeKhachHang
	@OneToMany(mappedBy="user")
	private List<LienHeKhachHang> lienHeKhachHangs;

	//bi-directional many-to-one association to NoiDungTinhChiTiet
	@OneToMany(mappedBy="user")
	private List<NoiDungTinhChiTiet> noiDungTinhChiTiets;

	//bi-directional many-to-one association to PhanHoi
	@OneToMany(mappedBy="user")
	private List<PhanHoi> phanHois;

	//bi-directional many-to-one association to TinTuc
	@OneToMany(mappedBy="user1")
	private List<TinTuc> tinTucs1;

	//bi-directional many-to-one association to TinTuc
	@OneToMany(mappedBy="user2")
	private List<TinTuc> tinTucs2;

	//bi-directional many-to-one association to TuyenDungThongBao
	@OneToMany(mappedBy="user")
	private List<TuyenDungThongBao> tuyenDungThongBaos;

	//bi-directional many-to-one association to Group
	@ManyToOne
	@JoinColumn(name="\"FK_Group\"")
	private Group group;

	//bi-directional many-to-one association to KhoaPhong
	@ManyToOne
	@JoinColumn(name="\"FK_KhoaPhong\"")
	private KhoaPhong khoaPhong;

	//bi-directional many-to-one association to UserPermission
	@OneToMany(mappedBy="user")
	private List<UserPermission> userPermissions;

	public User() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoVaTen() {
		return this.hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Timestamp getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Timestamp getNearLastLogin() {
		return this.nearLastLogin;
	}

	public void setNearLastLogin(Timestamp nearLastLogin) {
		this.nearLastLogin = nearLastLogin;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public List<DichVuChiTiet> getDichVuChiTiets() {
		return this.dichVuChiTiets;
	}

	public void setDichVuChiTiets(List<DichVuChiTiet> dichVuChiTiets) {
		this.dichVuChiTiets = dichVuChiTiets;
	}

	public DichVuChiTiet addDichVuChiTiet(DichVuChiTiet dichVuChiTiet) {
		getDichVuChiTiets().add(dichVuChiTiet);
		dichVuChiTiet.setUser(this);

		return dichVuChiTiet;
	}

	public DichVuChiTiet removeDichVuChiTiet(DichVuChiTiet dichVuChiTiet) {
		getDichVuChiTiets().remove(dichVuChiTiet);
		dichVuChiTiet.setUser(null);

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
		event.setUser(this);

		return event;
	}

	public Event removeEvent(Event event) {
		getEvents().remove(event);
		event.setUser(null);

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
		gioiThieuChiTiet.setUser(this);

		return gioiThieuChiTiet;
	}

	public GioiThieuChiTiet removeGioiThieuChiTiet(GioiThieuChiTiet gioiThieuChiTiet) {
		getGioiThieuChiTiets().remove(gioiThieuChiTiet);
		gioiThieuChiTiet.setUser(null);

		return gioiThieuChiTiet;
	}

	public List<HoatDong> getHoatDongs1() {
		return this.hoatDongs1;
	}

	public void setHoatDongs1(List<HoatDong> hoatDongs1) {
		this.hoatDongs1 = hoatDongs1;
	}

	public HoatDong addHoatDongs1(HoatDong hoatDongs1) {
		getHoatDongs1().add(hoatDongs1);
		hoatDongs1.setUser1(this);

		return hoatDongs1;
	}

	public HoatDong removeHoatDongs1(HoatDong hoatDongs1) {
		getHoatDongs1().remove(hoatDongs1);
		hoatDongs1.setUser1(null);

		return hoatDongs1;
	}

	public List<HoatDong> getHoatDongs2() {
		return this.hoatDongs2;
	}

	public void setHoatDongs2(List<HoatDong> hoatDongs2) {
		this.hoatDongs2 = hoatDongs2;
	}

	public HoatDong addHoatDongs2(HoatDong hoatDongs2) {
		getHoatDongs2().add(hoatDongs2);
		hoatDongs2.setUser2(this);

		return hoatDongs2;
	}

	public HoatDong removeHoatDongs2(HoatDong hoatDongs2) {
		getHoatDongs2().remove(hoatDongs2);
		hoatDongs2.setUser2(null);

		return hoatDongs2;
	}

	public List<HoiDapYKhoa> getHoiDapYkhoas() {
		return this.hoiDapYkhoas;
	}

	public void setHoiDapYkhoas(List<HoiDapYKhoa> hoiDapYkhoas) {
		this.hoiDapYkhoas = hoiDapYkhoas;
	}

	public HoiDapYKhoa addHoiDapYkhoa(HoiDapYKhoa hoiDapYkhoa) {
		getHoiDapYkhoas().add(hoiDapYkhoa);
		hoiDapYkhoa.setUser(this);

		return hoiDapYkhoa;
	}

	public HoiDapYKhoa removeHoiDapYkhoa(HoiDapYKhoa hoiDapYkhoa) {
		getHoiDapYkhoas().remove(hoiDapYkhoa);
		hoiDapYkhoa.setUser(null);

		return hoiDapYkhoa;
	}

	public List<LienHeKhachHang> getLienHeKhachHangs() {
		return this.lienHeKhachHangs;
	}

	public void setLienHeKhachHangs(List<LienHeKhachHang> lienHeKhachHangs) {
		this.lienHeKhachHangs = lienHeKhachHangs;
	}

	public LienHeKhachHang addLienHeKhachHang(LienHeKhachHang lienHeKhachHang) {
		getLienHeKhachHangs().add(lienHeKhachHang);
		lienHeKhachHang.setUser(this);

		return lienHeKhachHang;
	}

	public LienHeKhachHang removeLienHeKhachHang(LienHeKhachHang lienHeKhachHang) {
		getLienHeKhachHangs().remove(lienHeKhachHang);
		lienHeKhachHang.setUser(null);

		return lienHeKhachHang;
	}

	public List<NoiDungTinhChiTiet> getNoiDungTinhChiTiets() {
		return this.noiDungTinhChiTiets;
	}

	public void setNoiDungTinhChiTiets(List<NoiDungTinhChiTiet> noiDungTinhChiTiets) {
		this.noiDungTinhChiTiets = noiDungTinhChiTiets;
	}

	public NoiDungTinhChiTiet addNoiDungTinhChiTiet(NoiDungTinhChiTiet noiDungTinhChiTiet) {
		getNoiDungTinhChiTiets().add(noiDungTinhChiTiet);
		noiDungTinhChiTiet.setUser(this);

		return noiDungTinhChiTiet;
	}

	public NoiDungTinhChiTiet removeNoiDungTinhChiTiet(NoiDungTinhChiTiet noiDungTinhChiTiet) {
		getNoiDungTinhChiTiets().remove(noiDungTinhChiTiet);
		noiDungTinhChiTiet.setUser(null);

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
		phanHoi.setUser(this);

		return phanHoi;
	}

	public PhanHoi removePhanHoi(PhanHoi phanHoi) {
		getPhanHois().remove(phanHoi);
		phanHoi.setUser(null);

		return phanHoi;
	}

	public List<TinTuc> getTinTucs1() {
		return this.tinTucs1;
	}

	public void setTinTucs1(List<TinTuc> tinTucs1) {
		this.tinTucs1 = tinTucs1;
	}

	public TinTuc addTinTucs1(TinTuc tinTucs1) {
		getTinTucs1().add(tinTucs1);
		tinTucs1.setUser1(this);

		return tinTucs1;
	}

	public TinTuc removeTinTucs1(TinTuc tinTucs1) {
		getTinTucs1().remove(tinTucs1);
		tinTucs1.setUser1(null);

		return tinTucs1;
	}

	public List<TinTuc> getTinTucs2() {
		return this.tinTucs2;
	}

	public void setTinTucs2(List<TinTuc> tinTucs2) {
		this.tinTucs2 = tinTucs2;
	}

	public TinTuc addTinTucs2(TinTuc tinTucs2) {
		getTinTucs2().add(tinTucs2);
		tinTucs2.setUser2(this);

		return tinTucs2;
	}

	public TinTuc removeTinTucs2(TinTuc tinTucs2) {
		getTinTucs2().remove(tinTucs2);
		tinTucs2.setUser2(null);

		return tinTucs2;
	}

	public List<TuyenDungThongBao> getTuyenDungThongBaos() {
		return this.tuyenDungThongBaos;
	}

	public void setTuyenDungThongBaos(List<TuyenDungThongBao> tuyenDungThongBaos) {
		this.tuyenDungThongBaos = tuyenDungThongBaos;
	}

	public TuyenDungThongBao addTuyenDungThongBao(TuyenDungThongBao tuyenDungThongBao) {
		getTuyenDungThongBaos().add(tuyenDungThongBao);
		tuyenDungThongBao.setUser(this);

		return tuyenDungThongBao;
	}

	public TuyenDungThongBao removeTuyenDungThongBao(TuyenDungThongBao tuyenDungThongBao) {
		getTuyenDungThongBaos().remove(tuyenDungThongBao);
		tuyenDungThongBao.setUser(null);

		return tuyenDungThongBao;
	}

	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public KhoaPhong getKhoaPhong() {
		return this.khoaPhong;
	}

	public void setKhoaPhong(KhoaPhong khoaPhong) {
		this.khoaPhong = khoaPhong;
	}

	public List<UserPermission> getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public UserPermission addUserPermission(UserPermission userPermission) {
		getUserPermissions().add(userPermission);
		userPermission.setUser(this);

		return userPermission;
	}

	public UserPermission removeUserPermission(UserPermission userPermission) {
		getUserPermissions().remove(userPermission);
		userPermission.setUser(null);

		return userPermission;
	}

}