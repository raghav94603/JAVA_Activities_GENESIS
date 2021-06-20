import java.util.*;
import java.lang.*;


public class rangeScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start,end;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Start Range : ");
		start=s.nextInt();
		
		System.out.println("Enter The End Range : ");
		end=s.nextInt();
		
		rangeScore r=new rangeScore(start, end);
		Thread t=new Thread(r);
		Thread t1=new Thread(r);
		//t.run();
		System.out.println("ODD Scores Given In The Range : ");
		t1.start();
		
		
		
		
	}

}
