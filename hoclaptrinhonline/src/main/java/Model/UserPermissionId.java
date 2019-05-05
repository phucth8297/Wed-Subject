package Model;
// Generated May 5, 2019 9:45:06 PM by Hibernate Tools 4.3.1



/**
 * UserPermissionId generated by hbm2java
 */
public class UserPermissionId  implements java.io.Serializable {


     private String fkUser;
     private int fkPermission;

    public UserPermissionId() {
    }

    public UserPermissionId(String fkUser, int fkPermission) {
       this.fkUser = fkUser;
       this.fkPermission = fkPermission;
    }
   
    public String getFkUser() {
        return this.fkUser;
    }
    
    public void setFkUser(String fkUser) {
        this.fkUser = fkUser;
    }
    public int getFkPermission() {
        return this.fkPermission;
    }
    
    public void setFkPermission(int fkPermission) {
        this.fkPermission = fkPermission;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserPermissionId) ) return false;
		 UserPermissionId castOther = ( UserPermissionId ) other; 
         
		 return ( (this.getFkUser()==castOther.getFkUser()) || ( this.getFkUser()!=null && castOther.getFkUser()!=null && this.getFkUser().equals(castOther.getFkUser()) ) )
 && (this.getFkPermission()==castOther.getFkPermission());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getFkUser() == null ? 0 : this.getFkUser().hashCode() );
         result = 37 * result + this.getFkPermission();
         return result;
   }   


}


