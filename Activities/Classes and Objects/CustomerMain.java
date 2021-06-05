import java.util.*;
import java.lang.*;

class Customer{  
    
    private  String name, address, mobile;  
       
   
     
     public String getName()
     {  
         return name;  
     }
     
     public String getAddress() {  
         return address;  
     }
     
     public String getMobile()
     {  
         return mobile;  
     }
     
     public void setName(String val)
     {  
         name = val;  
     }  
       
     public void setAddress(String val) 
     {  
         address = val;  
     }  
       
     public void setMobile(String val) {  
         mobile = val;  
     }  
 }
public class CustomerMain{  
   
	
    public static void main(String args[]) {  
          
        
        Customer obj = new Customer();  
        //Setting values to the properties 
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter details : ");
        
        String Details = s.nextLine();
        
        String[] det_spl= Details.split(",");
        
        obj.setName(det_spl[0]); 
        obj.setAddress(det_spl[1]);  
        obj.setMobile(det_spl[2]);  
          
        System.out.println("Name:"+" "+obj.getName());
        System.out.println("Address:"+" "+obj.getAddress());
        System.out.println("Mobile:"+" "+obj.getMobile());

        
    }  
}
