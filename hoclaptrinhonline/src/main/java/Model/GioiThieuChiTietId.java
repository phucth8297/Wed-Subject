package Model;
// Generated May 5, 2019 9:45:06 PM by Hibernate Tools 4.3.1



/**
 * GioiThieuChiTietId generated by hbm2java
 */
public class GioiThieuChiTietId  implements java.io.Serializable {


     private int fkNgonNgu;
     private int fkGioiThieu;

    public GioiThieuChiTietId() {
    }

    public GioiThieuChiTietId(int fkNgonNgu, int fkGioiThieu) {
       this.fkNgonNgu = fkNgonNgu;
       this.fkGioiThieu = fkGioiThieu;
    }
   
    public int getFkNgonNgu() {
        return this.fkNgonNgu;
    }
    
    public void setFkNgonNgu(int fkNgonNgu) {
        this.fkNgonNgu = fkNgonNgu;
    }
    public int getFkGioiThieu() {
        return this.fkGioiThieu;
    }
    
    public void setFkGioiThieu(int fkGioiThieu) {
        this.fkGioiThieu = fkGioiThieu;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GioiThieuChiTietId) ) return false;
		 GioiThieuChiTietId castOther = ( GioiThieuChiTietId ) other; 
         
		 return (this.getFkNgonNgu()==castOther.getFkNgonNgu())
 && (this.getFkGioiThieu()==castOther.getFkGioiThieu());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkNgonNgu();
         result = 37 * result + this.getFkGioiThieu();
         return result;
   }   


}


