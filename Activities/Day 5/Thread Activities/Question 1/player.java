import java.lang.*;
import java.util.*;

class player implements Runnable {

	
	
	String matchType; 
	int[] scores;
	String scoreString;
	
	
	public player(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public player()
	{
		super();
	}
	
	
	
	
	int n;
	public int[] getScores()
	{
		
		String[] strings = scoreString.split(",");
		scores = new int[strings.length];
		n=scores.length;
		for (int i = 0; i < scores.length; i++)
		{
		  scores[i] = Integer.parseInt(strings[i]);
		}
		Arrays.sort(scores);
		 return  scores; 
		
	}
	
	public void run()
	{
		
		try
		{ 
			
		    Thread.sleep(5000);  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		int[] score=getScores();
		System.out.println("Ordered Score List");
		System.out.println("Match :"+matchType);
		for (int i = 0; i < n; i++)
		{
		 System.out.println(score[i]);
	   }	 
			

}
}
