import java.util.*;
import java.lang.*;

public class list1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		List list=new ArrayList<>();
		
		String name,country;
		int age,add_pos,del_pos;
		String skill;
		System.out.println("Enter The Player Name : ");
		name=s.next();
		
		System.out.println("Enter Your Age : ");
		age=s.nextInt();
		
		System.out.println("Enter The Player Country : ");
		country=s.next();
		
		list.add(name);
		list.add(age);
		list.add(country);
		
		System.out.println("The Player Details Are : ");
		System.out.println(list);
		
		
		
		
		System.out.println("Enter The Position to Add Skill : ");
		add_pos=s.nextInt();
		
		System.out.println("Enter Player Skill : ");
		skill=s.next();
		
		list.add(add_pos,skill);
		System.out.println(list);
		
		System.out.println("Enter Position to delete : ");
		del_pos=s.nextInt();
		
		list.remove(del_pos);
		System.out.println(list);
		
		
		
		
	}

}
