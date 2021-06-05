import java.util.*;
import java.lang.*;

public class playerCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String p1;
		String p2;
		System.out.println("Enter The First Player Name : ");
		p1=s.nextLine();
		
		System.out.println("Enter The Second Player Name : ");
		p2=s.nextLine();
		
		String player1[]=p1.split(" ");
		String player2[]=p2.split(" ");
		
		if(player1[1].equalsIgnoreCase(player2[1]))
		{
			System.out.println("Yes");
			
		}
		else
		{
			System.out.println("No");
		}
	}
	

}
