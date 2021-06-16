import java.util.*;
import java.lang.*;

public class pscore implements Runnable {

	
	String matchType; 
	String scoreString;
	int sum=0;
	
	int[] scores;

	public pscore(String matchType, String scoreString) {
		super();
		
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	
	public pscore() {
		// TODO Auto-generated constructor stub
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
		
		try{  
			
			Thread.sleep(500);
			
		   }
		
		catch(Exception e)
		{
			System.out.println(e);
		} 
		
		int[] score=getScores();
		System.out.println("Ordered Score List");
		
		for (int i = 0; i < n; i++)
		{
		 sum+=scores[i];
	    }
		
		System.out.println("Match :"+matchType+"\nMean: "+sum/(float)n+"\nMin Score: "+score[0]+"\nMax Score :"+score[n-1]);
	
}
}
