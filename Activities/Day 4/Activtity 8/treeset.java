import java.util.*;
import java.lang.*;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		TreeSet<String> set = new TreeSet<String>();
		int n;
		System.out.println("Enter The Size : ");
		n=s.nextInt();
		String str;
		System.out.println("Enter The Elements : ");
		for(int i=0;i<n;i++)
		{
			str=s.next();
			set.add(str);
		}
		
		for(String s1:set)
			System.out.println(s1);
		
	
	}

}
