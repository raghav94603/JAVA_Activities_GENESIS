import java.util.*;
import java.text.*;
import java.lang.*;

class Match1 implements Comparable<Match1> {

	Date matchDate;
	String team1,team2;
	public Match1(Date matchDate, String team1, String team2) {
		super();
		this.matchDate = matchDate;
		this.team1 = team1;
		this.team2 = team2;
	}
	

	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	
	


	public int compareTo(Match1 a, Match1 b) {
		// TODO Auto-generated method stub
		 return b.matchDate.compareTo(a.matchDate);	
	
}


	@Override
	public int compareTo(Match1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


public class msort {
	
	public static void main(String[] args) throws ParseException { 
		
		String matchDate;
		String team1,team2;
		int n;
		Scanner scan=new Scanner(System.in);
		
		SimpleDateFormat formatter3=new SimpleDateFormat("MM-dd-yyyy");  
		
		System.out.println("Enter the number of the matches ");
		ArrayList<Match1> al=new ArrayList<Match1>();  
		n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter match date in (MM-dd-yyyy) ");
			matchDate=scan.next();
			 Date date3=formatter3.parse(matchDate); 
			System.out.println( "Enter team 1 ");
			team1 = scan.next();
			System.out.println( "Enter team 2 ");
			team2 = scan.next();
			al.add(new Match1(date3,team1,team2)); 
			
					
		}
		
		Collections.reverse(al); 
		
		
		System.out.println("Match Deatils");
		
		for(Match1 st:al){  
			
			System.out.println("Team 1 "+st.team1);
			System.out.println("Team 1 "+st.team2);
			System.out.println("Match held on "+st.matchDate);
			
			}  
		
	}

}
