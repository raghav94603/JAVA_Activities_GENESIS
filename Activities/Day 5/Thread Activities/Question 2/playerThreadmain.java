import java.util.*;
import java.lang.*;


public class playerThreadmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String matchType; 
		String scoreString;
		int[] scores;
		int n;
		
		Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number of Matches : ");
        
        n=s.nextInt();
        
      for(int i=0;i<n;i++)
      {
    	  System.out.println("Enter the match : ");
    	  matchType = s.next();
    	  
    	  System.out.println("Enter the Scores : ");
    	  scoreString = s.next();
    	  
    	   pscore p = new pscore(matchType,scoreString);
    	   Thread t=new Thread(p);
    	   t.start();
		
	}

	}
	
	}
