import java.util.*;
public class activity {

	public void findElementcount(int array[],int n,int num)
	{
		int i,count=0;
		
		if(num<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		for(i=0;i<n;i++)
		{
			if(array[i]==num)
			{
				count++;
			}
		}
		System.out.println("The Number "+num+" occurs"+" "+count+" "+"Times");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int array[]=new int[20],n,num,i=0;
		
		System.out.println("Enter The Array Size : ");
		n=s.nextInt();
		
		System.out.println("Enter The Array Elements : \n");
		for(i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		
		
			if(array[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		
		
		System.out.println("Enter The Number To find : ");
		 num=s.nextInt();
		
		activity obj=new activity();
		obj.findElementcount(array, n,num);
		
	
	
	
	}

}
