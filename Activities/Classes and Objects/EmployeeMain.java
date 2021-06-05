import java.util.*;
import java.lang.*;
class Employee
{
	private String name;
	private String address;
	private String mobile;
	
	public String getName() 
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getMobile() {
		
		return mobile;
	}
	
	public void setName(String newval)
	{
		name=newval;
	}
	public void setAddress(String newval)
	{
		address=newval;
	}
	public void setMobile(String newval)
	{
		mobile=newval;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();
		
		obj.setName("Ravi");
		obj.setAddress("Pune");
		obj.setMobile("9998887771");
		
		System.out.println("Employee Details\n");
		System.out.println("Name : "+obj.getName());
		System.out.println("Address : "+obj.getAddress());
		System.out.println("Mobile : "+obj.getMobile());

	}

}
