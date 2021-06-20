import java.lang.*;
import java.util.*;

public class rangeScore extends Thread {

	int start,end,i;
	public rangeScore(int start,int end)
	{
		super();
		this.start=start;
		this.end=end;
	}
	public rangeScore()
	{
		super();
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(5000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		
		
		}
		for(i=start;i<end;i++)
		{
			if(i%2!=0)
			{
				
			
			System.out.print(i+" ");
		}
		}
	
	
	
	
		
		try
		{
			Thread.sleep(5000);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		
		
		}
		System.out.println("");
		System.out.println("Even Scores in The Range : ");
		for(i=start;i<end;i++)
		{
			if(i%2==0)
			{
				
			
			System.out.print(i+" ");
		}
	}
	

}
}
