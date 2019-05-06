package Model;
// Generated May 5, 2019 9:45:06 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * TinhTrangHonNhan generated by hbm2java
 */
public class TinhTrangHonNhan  implements java.io.Serializable {


     private int id;
     private NgonNgu ngonNgu;
     private Serializable tinhTrang;
     private Set henKhamBenhs = new HashSet(0);

    public TinhTrangHonNhan() {
    }

	
    public TinhTrangHonNhan(int id) {
        this.id = id;
    }
    public TinhTrangHonNhan(int id, NgonNgu ngonNgu, Serializable tinhTrang, Set henKhamBenhs) {
       this.id = id;
       this.ngonNgu = ngonNgu;
       this.tinhTrang = tinhTrang;
       this.henKhamBenhs = henKhamBenhs;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public NgonNgu getNgonNgu() {
        return this.ngonNgu;
    }
    
    public void setNgonNgu(NgonNgu ngonNgu) {
        this.ngonNgu = ngonNgu;
    }
    public Serializable getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Serializable tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public Set getHenKhamBenhs() {
        return this.henKhamBenhs;
    }
    
    public void setHenKhamBenhs(Set henKhamBenhs) {
        this.henKhamBenhs = henKhamBenhs;
    }




}

