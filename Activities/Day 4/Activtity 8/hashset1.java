
import java.util.*;
import java.util.Scanner;
public class hashset1 {
	

	public static void main(String[] arg)
	{
		
		Scanner s=new Scanner(System.in);
		
		HashSet<String> set = new HashSet<String>();
		int n;
		n=Integer.parseInt(s.nextLine());
		String str;
		
		for(int i=0;i<n;i++)
		{
			str=s.nextLine();
			set.add(str);
		}
		
		System.out.println(set.size());
		
}
}