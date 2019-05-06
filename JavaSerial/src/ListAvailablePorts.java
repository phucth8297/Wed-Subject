
import gnu.io.CommPortIdentifier;  
   
import java.util.Enumeration;  
   
public class ListAvailablePorts {  
   
    public String list() {  
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();  
          
        while(ports.hasMoreElements())  
            System.out.println(((CommPortIdentifier)ports.nextElement()).getName());
		return ((CommPortIdentifier)ports.nextElement()).getName();  
    }  
   
    public static void main(String[] args) {  
        String a = new ListAvailablePorts().list(); 
        System.out.println(a);
    }  
}  
