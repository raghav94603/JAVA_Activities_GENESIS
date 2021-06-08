import java.util.*;
import java.lang.*;


public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try
		{
			int i,overs,arr[]=new int[20],orun;
			System.out.println("Enter The Number of Overs : ");
			overs=s.nextInt();
			
			System.out.println("Enter The runs for Each Over : ");
			for(i=0;i<overs;i++)
			{
				arr[i]=s.nextInt();
			}
			System.out.println("Enter The Over Number for It's Runs : ");
			orun=s.nextInt();
			
			for(i=0;i<overs;i++)
			{
				
			if(orun==i+1)
			{
				System.out.println("The Run for Selected Over Are : ");
				System.out.print(arr[i]);
			}
			}
			
			
			
			
			
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out of Index Exception !!!");
		}
		
		catch(NegativeArraySizeException c)
		{
			
			System.out.println("Negative Index Array Exception !!!");
		}
		
		
	}

}
