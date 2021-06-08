import java.util.*;
import java.lang.*;


public class list3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int i;
		List l1=new LinkedList<String>();
		List l2=new LinkedList<String>();
		
		System.out.println("Enter The Top Five Players of Season 13 : ");
		for(i=0;i<5;i++)
		{
			l1.add(s.nextLine());
			
		}
		System.out.println("Enter The Top Five Players of Season 13 : ");
		
		for(i=0;i<5;i++)
		{
			l2.add(s.nextLine());
		}
		
		
			
		
		l1.retainAll(l2);
		
		
		
	System.out.println("Consistent Players are : ");
	System.out.println(l1);
		
	}

}
