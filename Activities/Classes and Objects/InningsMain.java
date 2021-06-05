import java.util.*;
import java.lang.*;


class Innings
{
	private String 	teamname,inningsname;
	private int runs;
	
	public void getTeam()
	{
		System.out.println("Name : "+teamname);
	}
	
	public String getInn()
	{
		return inningsname;
	}
	public void getRuns()
	{
		System.out.println("Scored : "+runs);
	}
	
	public void setTeam(String newVal)
	{
		teamname=newVal;
	}
	
	public void setInn(String newVal)
	{
		inningsname=newVal;
	}
	public void setRun(int newVal)
	{
		runs=newVal;
	}
	
	public void check()
	{
		String sq="First";
		if(inningsname.equals(sq))
		{
			System.out.println("Need "+(runs+1) +" "+"To Win");
		}
		else
		{
			System.out.println("Match Ended");
		}
	}
	public void InningsDisplay()
	{
		getTeam();
		getInn();
		getRuns();
		check();
	}
}
public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Innings newob=new Innings();
		
		System.out.println("Enter The Team Name : ");
		newob.setTeam(s.next());
		System.out.println("Enter The innings : ");
		newob.setInn(s.next());
		System.out.println("Enter The Runs : ");
		newob.setRun(s.nextInt());
		
		newob.InningsDisplay();
	}

}
