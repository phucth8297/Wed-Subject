package Model;
// Generated May 5, 2019 9:45:06 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * HenKhamBenh generated by hbm2java
 */
public class HenKhamBenh  implements java.io.Serializable {


     private int id;
     private DanhMucBacSi danhMucBacSi;
     private GioKham gioKham;
     private NamSinh namSinh;
     private PhongKham phongKham;
     private QuocTich quocTich;
     private TinhTrangHonNhan tinhTrangHonNhan;
     private TrangThai trangThai;
     private Date ngayHen;
     private Serializable moTaTrieuChung;
     private Date ngayGui;
     private Serializable diaChiEmail;
     private Serializable hoVaTen;
     private Boolean gioiTinh;
     private String soDienThoaiNha;
     private String soDienThoaiDiDong;
     private Serializable diaChi;
     private Serializable bacSi;

    public HenKhamBenh() {
    }

	
    public HenKhamBenh(int id) {
        this.id = id;
    }
    public HenKhamBenh(int id, DanhMucBacSi danhMucBacSi, GioKham gioKham, NamSinh namSinh, PhongKham phongKham, QuocTich quocTich, TinhTrangHonNhan tinhTrangHonNhan, TrangThai trangThai, Date ngayHen, Serializable moTaTrieuChung, Date ngayGui, Serializable diaChiEmail, Serializable hoVaTen, Boolean gioiTinh, String soDienThoaiNha, String soDienThoaiDiDong, Serializable diaChi, Serializable bacSi) {
       this.id = id;
       this.danhMucBacSi = danhMucBacSi;
       this.gioKham = gioKham;
       this.namSinh = namSinh;
       this.phongKham = phongKham;
       this.quocTich = quocTich;
       this.tinhTrangHonNhan = tinhTrangHonNhan;
       this.trangThai = trangThai;
       this.ngayHen = ngayHen;
       this.moTaTrieuChung = moTaTrieuChung;
       this.ngayGui = ngayGui;
       this.diaChiEmail = diaChiEmail;
       this.hoVaTen = hoVaTen;
       this.gioiTinh = gioiTinh;
       this.soDienThoaiNha = soDienThoaiNha;
       this.soDienThoaiDiDong = soDienThoaiDiDong;
       this.diaChi = diaChi;
       this.bacSi = bacSi;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public DanhMucBacSi getDanhMucBacSi() {
        return this.danhMucBacSi;
    }
    
    public void setDanhMucBacSi(DanhMucBacSi danhMucBacSi) {
        this.danhMucBacSi = danhMucBacSi;
    }
    public GioKham getGioKham() {
        return this.gioKham;
    }
    
    public void setGioKham(GioKham gioKham) {
        this.gioKham = gioKham;
    }
    public NamSinh getNamSinh() {
        return this.namSinh;
    }
    
    public void setNamSinh(NamSinh namSinh) {
        this.namSinh = namSinh;
    }
    public PhongKham getPhongKham() {
        return this.phongKham;
    }
    
    public void setPhongKham(PhongKham phongKham) {
        this.phongKham = phongKham;
    }
    public QuocTich getQuocTich() {
        return this.quocTich;
    }
    
    public void setQuocTich(QuocTich quocTich) {
        this.quocTich = quocTich;
    }
    public TinhTrangHonNhan getTinhTrangHonNhan() {
        return this.tinhTrangHonNhan;
    }
    
    public void setTinhTrangHonNhan(TinhTrangHonNhan tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }
    public TrangThai getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }
    public Date getNgayHen() {
        return this.ngayHen;
    }
    
    public void setNgayHen(Date ngayHen) {
        this.ngayHen = ngayHen;
    }
    public Serializable getMoTaTrieuChung() {
        return this.moTaTrieuChung;
    }
    
    public void setMoTaTrieuChung(Serializable moTaTrieuChung) {
        this.moTaTrieuChung = moTaTrieuChung;
    }
    public Date getNgayGui() {
        return this.ngayGui;
    }
    
    public void setNgayGui(Date ngayGui) {
        this.ngayGui = ngayGui;
    }
    public Serializable getDiaChiEmail() {
        return this.diaChiEmail;
    }
    
    public void setDiaChiEmail(Serializable diaChiEmail) {
        this.diaChiEmail = diaChiEmail;
    }
    public Serializable getHoVaTen() {
        return this.hoVaTen;
    }
    
    public void setHoVaTen(Serializable hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public Boolean getGioiTinh() {
        return this.gioiTinh;
    }
    
    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getSoDienThoaiNha() {
        return this.soDienThoaiNha;
    }
    
    public void setSoDienThoaiNha(String soDienThoaiNha) {
        this.soDienThoaiNha = soDienThoaiNha;
    }
    public String getSoDienThoaiDiDong() {
        return this.soDienThoaiDiDong;
    }
    
    public void setSoDienThoaiDiDong(String soDienThoaiDiDong) {
        this.soDienThoaiDiDong = soDienThoaiDiDong;
    }
    public Serializable getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(Serializable diaChi) {
        this.diaChi = diaChi;
    }
    public Serializable getBacSi() {
        return this.bacSi;
    }
    
    public void setBacSi(Serializable bacSi) {
        this.bacSi = bacSi;
    }




}


