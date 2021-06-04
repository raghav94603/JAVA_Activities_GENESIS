import java.util.*;



public class activitysecond {
	
public static int cricketer[]=new int[20];
	
	public void findCricketerId(int arr[],int size,int score) 
	{
		int i,j=0;
		for (i = 1; i < size; i = i + 2) {
	         if (arr[i] > score) {
	           cricketer[j] = arr[i - 1];
	           j++;
	         }
	       }
	       for (i = 0; i < j; i++) {
	         System.out.println(cricketer[i]);
	       }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int arr[]=new int[20],size,score,i=0;
		System.out.println("Enter The Array Size : ");
		size=s.nextInt();
		
		if (size < 0) 
		{
		       System.out.print("Invalid array size");
		       System.exit(0);
		}
		else
		{
			System.out.println("Enter The Array Elements : \n");
			for (i = 0; i < size; i++)
			{
		         arr[i] = s.nextInt();
		         
		         if (arr[i] < 0)
		         {
		           System.out.print("Invalid Input");
		           System.exit(0);
		         }
		         
		       }
			
		}
		System.out.println("Enter The Score You Want to Check : ");
		score=s.nextInt();
		
		if (score < 0) 
		{
	         System.out.print("Invalid Score");
	         System.exit(0);
	    }
		activitysecond ob=new activitysecond();
		ob.findCricketerId(arr, size, score);

		
	}

}
