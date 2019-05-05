package Model;
// Generated May 5, 2019 9:45:06 PM by Hibernate Tools 4.3.1



/**
 * NoiDungTinhChiTietId generated by hbm2java
 */
public class NoiDungTinhChiTietId  implements java.io.Serializable {


     private int fkNgonNgu;
     private int fkNoiDungTinh;

    public NoiDungTinhChiTietId() {
    }

    public NoiDungTinhChiTietId(int fkNgonNgu, int fkNoiDungTinh) {
       this.fkNgonNgu = fkNgonNgu;
       this.fkNoiDungTinh = fkNoiDungTinh;
    }
   
    public int getFkNgonNgu() {
        return this.fkNgonNgu;
    }
    
    public void setFkNgonNgu(int fkNgonNgu) {
        this.fkNgonNgu = fkNgonNgu;
    }
    public int getFkNoiDungTinh() {
        return this.fkNoiDungTinh;
    }
    
    public void setFkNoiDungTinh(int fkNoiDungTinh) {
        this.fkNoiDungTinh = fkNoiDungTinh;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NoiDungTinhChiTietId) ) return false;
		 NoiDungTinhChiTietId castOther = ( NoiDungTinhChiTietId ) other; 
         
		 return (this.getFkNgonNgu()==castOther.getFkNgonNgu())
 && (this.getFkNoiDungTinh()==castOther.getFkNoiDungTinh());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getFkNgonNgu();
         result = 37 * result + this.getFkNoiDungTinh();
         return result;
   }   


}


