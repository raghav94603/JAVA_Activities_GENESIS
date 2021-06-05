import java.util.Scanner;
class company{
	
	private String name,employees,teamlead;
	
	public String getName()
	{
		return name;
	}
	public String getEmployees()
	{
		return employees;
		
	}
	public String getTeamlead()
	{
		return teamlead;
	}
	
	public void setName(String nval)
	{
		name=nval;
	}
	public void setEmployees(String nval) 
	{
		employees=nval;
	}
	
	public void setTeamlead(String nval)
	{
		teamlead=nval;
	}
}
public class CompanyMain{  
    //main() method start  
    public static void main(String args[]) {  
          
        int count=0;
        company obj = new company();  
        
        
        Scanner s= new Scanner(System.in);  
        System.out.println("Enter The Company name : ");
        String cname=s.nextLine();
        obj.setName(cname);

        System.out.println("Enter The Employees name : ");
        String ename=s.nextLine();
        obj.setEmployees(ename);

        System.out.println("Enter The Team Lead : ");
        String tlead=s.nextLine();
        obj.setTeamlead(tlead);

        String[] em_arr= ename.split(",");
        int n=em_arr.length;
        
        for(int i=0;i<n;i++)
        {
           if(em_arr[i].equalsIgnoreCase(tlead))
          {
            count++;
          }
       }
       switch(count){
        case 0:System.out.println("Invalid Input");
               System.exit(0);
               
        case 1:System.out.println("Company Name:"+" "+obj.getName());
               System.out.println("Employees :"+" "+obj.getEmployees());
               System.out.println("Team Lead :"+" "+obj.getTeamlead());

        
    }  
}
}