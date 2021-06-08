import java.util.*;
import java.lang.*;

public class list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		List l=new LinkedList<String>();
		
		int first,second;
		System.out.println("Enter The 5 Teams : ");
		for(int i=0;i<5;i++)
		{
			l.add(s.nextLine());
		}

		System.out.println(l);
		System.out.println("Enter The First Position to Swap ");
		first=s.nextInt();
		
		System.out.println("Enter The Second Position to Swap ");
		second=s.nextInt();
		
		Collections.swap(l, first, second);
		System.out.println(l);
}
}
