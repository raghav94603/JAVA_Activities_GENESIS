import java.util.*;
import java.lang.*;

public class list4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,score,countfifty=0,countcentury=0;
		  Scanner sc=new Scanner(System.in);
		  List<Integer> a=new ArrayList<Integer>();  
		  System.out.println("Enter The number of matches : ");
	      n = sc.nextInt();
	      System.out.println("Enter Scores : ");
	      for(int i=0;i<n;i++)
	      {
	    	  score = sc.nextInt();
	    	  a.add(score);
	    	  
	    	  if(score>=50 && score<100)
	    		  countfifty++;
	    	  
	    	  else if(score>=100 && score<200)
	    		  countcentury++;
	      }
	      System.out.println("Tota Number of  50's : "+countfifty);
	      System.out.println("Total Number of 100's : "+countcentury);
	      

	}

}
