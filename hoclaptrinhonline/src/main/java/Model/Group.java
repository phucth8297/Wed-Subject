package Model;
// Generated May 5, 2019 9:45:06 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Group generated by hbm2java
 */
public class Group  implements java.io.Serializable {


     private int id;
     private Serializable groupName;
     private Set users = new HashSet(0);
     private Set groupPermissions = new HashSet(0);

    public Group() {
    }

	
    public Group(int id) {
        this.id = id;
    }
    public Group(int id, Serializable groupName, Set users, Set groupPermissions) {
       this.id = id;
       this.groupName = groupName;
       this.users = users;
       this.groupPermissions = groupPermissions;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Serializable getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(Serializable groupName) {
        this.groupName = groupName;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
    public Set getGroupPermissions() {
        return this.groupPermissions;
    }
    
    public void setGroupPermissions(Set groupPermissions) {
        this.groupPermissions = groupPermissions;
    }




}


