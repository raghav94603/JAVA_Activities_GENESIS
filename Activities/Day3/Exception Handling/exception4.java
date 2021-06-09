import java.util.*;
import java.lang.*;

class TeamNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public TeamNotFoundException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	

}
public class exception4 
{
private static String win1;
private static String run1; 
static void validate() throws TeamNotFoundException
{ 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the expected winner team of IPL Season 13");
 win1 = sc.nextLine();
 System.out.println("Enter the expected runner Team of IPL Season 13");
 run1 = sc.nextLine();
 Set<String> names = new HashSet<String>();
 names.add("Chennai Super Kings");
 names.add("Sun Risers Hyderabad");
 names.add("Delhi Capitals");
 names.add("Kings XI Punjab");
 names.add("Sun Risers Hyderabad");
 names.add("Kolkata Knight Riders");
 names.add("Mumbai Indians");
 names.add("Rajasthan Royals");
 names.add("Royal Challengers Bangalore");
 
 

 if (names.contains(win1) && names.contains(run1))   
	 System.out.println("Expected winner team of IPL Season 13:"+" "+win1+" "+"\nExpected runner team of IPL Season 13:"+" "+run1);
 else 
	 throw new TeamNotFoundException("Entered team is not a part of IPL season 13"); 
}
 public static void main(String[] args)
 {
 try
 {  
  validate();  
 }
 catch(Exception e)
 {
   System.out.println(e);
  }   
  }  
 }

