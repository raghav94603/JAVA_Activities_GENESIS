import java.util.*;
import java.lang.*;

abstract class Match {
	
	int currentscore, target;
	float currentover;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	} 
	
	public abstract float calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunrate, int balls);
	

}

class ODIMatch extends Match{
	
	

	@Override
	public int calculateBalls() {
		    float cur = 50-currentover;
		    String[] arr=String.valueOf(cur).split("\\.");
		    int[] intArr=new int[2];
		    intArr[0]=Integer.parseInt(arr[0]); // 1
		    intArr[1]=Integer.parseInt(arr[1]);
		   int total=intArr[0] * 6 +intArr[1];
		   return total;
		
	}


	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		
		return currentscore/currentover;
	}
	
	@Override
	public void display(double reqRunrate, int balls) {
		balls = calculateBalls();
		reqRunrate = calculateRunRate();
		int score = target-currentscore;
		System.out.println("Need"+" "+score+"runs in"+ " "+"balls");
		System.out.println("Required Runrate: "+reqRunrate);
		
	}
}

class TestMatch extends Match{

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		return currentscore/currentover;
	}

	@Override
	public int calculateBalls() {
	    float cur = 90-currentover;
	    String[] arr=String.valueOf(cur).split("\\.");
	    int[] intArr=new int[2];
	    intArr[0]=Integer.parseInt(arr[0]); // 1
	    intArr[1]=Integer.parseInt(arr[1]);
	   int total=intArr[0] * 6 +intArr[1];
	   return total;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		balls = calculateBalls();
		reqRunrate = calculateRunRate();
		int score = target-currentscore;
		System.out.println("Need"+" "+score+"runs in"+ " "+"balls");
		System.out.println("Required Runrate: "+reqRunrate);
		
	}
	
}

class T20Match extends Match{

	@Override
	public float calculateRunRate() {
		
		return currentscore/currentover;
	
	}

	@Override
	public int calculateBalls() {
	    float cur = 20-currentover;
	    String[] arr=String.valueOf(cur).split("\\.");
	    int[] intArr=new int[2];
	    
	    intArr[0]=Integer.parseInt(arr[0]); // 1
	    
	    intArr[1]=Integer.parseInt(arr[1]);
	   int total=intArr[0] * 6 +intArr[1];
	   return total;
	}

	@Override
	public void display(double reqRunrate, int balls) {
		balls = calculateBalls();
		reqRunrate = calculateRunRate();
		int score = target-currentscore;
		
		System.out.println("Need"+" "+score+"runs in"+ " "+"balls");
		System.out.println("Required Runrate: "+reqRunrate);
		
	}
	
}

public class matchMain {
	
	public static void main(String[] args)
	{
		int ch,score,target;
		float over;
		System.out.println("Enter the format");
		
		System.out.println("1.ODI\n2.Test Match\n3.T20");
		Scanner scan=new Scanner(System.in);
		ch=scan.nextInt();
		
		ODIMatch od=new ODIMatch();
        TestMatch t = new TestMatch();
        
        T20Match  t2= new T20Match();
      
		
		
		if(ch==1)
		{
			System.out.println("Enter the current Score");
			score = scan.nextInt();
			od.setCurrentscore(score);
			
			System.out.println("Enter the current Over");
			over = scan.nextFloat();
			od.setCurrentover(over);
			
			System.out.println("Enter the Target Score");
			target= scan.nextInt();
			od.setTarget(target);
			
			od.display(over, target);
		}
		else if(ch==2)
		{
			System.out.println("Enter the current Score");
			score = scan.nextInt();
			t.setCurrentscore(score);
			
			System.out.println("Enter the current Over");
			over = scan.nextFloat();
			t.setCurrentover(over);
			
			System.out.println("Enter the Target Score");
			target= scan.nextInt();
			
			t.setTarget(target);
			
			
			t.display(over, target);
		}
		else if(ch==3)
		{
			System.out.println("Enter the current Score");
			score = scan.nextInt();
			
			t2.setCurrentscore(score);
			
			System.out.println("Enter the current Over");
			over = scan.nextFloat();
			t2.setCurrentover(over);
			
			System.out.println("Enter the Target Score");
			target= scan.nextInt();
			t2.setTarget(target);
			
			t2.display(over, target);
		}
			
		
		
	}

}

