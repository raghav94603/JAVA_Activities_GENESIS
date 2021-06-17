import java.time.*;
import java.util.*;

public class IssueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		
		System.out.println("Book Type:");
		String bookName = s.nextLine();
		
		System.out.println("Enter user type");
		String userType = s.nextLine();
		
		Issue i = new Issue(bookName, userType);
		
		if(userType.equalsIgnoreCase("student")) {
			LocalDate studate = date.plusDays(15);
			System.out.println(studate);
		}
		else if(userType.equalsIgnoreCase("faculty")) {
			LocalDate facdate = date.plusDays(90);
			System.out.println(facdate);
	}

}
}
