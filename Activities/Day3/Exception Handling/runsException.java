import java.util.*;
import java.io.*;
//import java.io.BufferedReader;
import java.lang.*;

public class runsException{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		Scanner s=new Scanner(System.in);
		
	
		try
		{
			int totalruns,overs;
			float runrate;
			
			System.out.println("Enter Total Runs : ");
			//totalruns =Integer.parseInt(br.readLine());
			
			totalruns=s.nextInt();
			System.out.println("Enter The Overs Played : ");
			//overs=Float.parseFloat(br.readLine());
			overs=s.nextInt();
			
			System.out.println("Current Run Rate is : ");
			
			System.out.print(totalruns/overs);
		}
		
		catch (ArithmeticException e)
		{
			// TODO: handle exception
			System.out.println("Zero Overs Can't be Posssible !!!");
			
		}

	}

}
