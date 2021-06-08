import java.util.*;
import java.lang.*;

class customException extends Exception
{
	public customException(String s)
	{
		super(s);
	}
	
	
	
}


public class exception3 {

	public void IPL_check(int age) throws customException
	{
		if(age<19)
		{
			throw new customException("Invalid Range Exception");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception3 obj=new exception3();
		Scanner s=new Scanner(System.in);
		try
		{
			String name;
			int age;
			System.out.println("Enter Player Name : ");
			name=s.next();
			
			System.out.println("Enter age :");
			age=s.nextInt();
			
			obj.IPL_check(age);
		
			
			
		}
		catch(customException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
