import java.util.*;
import java.lang.*;



class Ranking  implements Comparable<Ranking> {
	
	String name;
	int score;
	public Ranking(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	@Override
	public int compareTo(Ranking st) {
		// TODO Auto-generated method stub
		
		if(score==st.score)  
			return 0;  
			else if(score<st.score)  
			return 1;  
			else  
			return -1;  
	}
	
	
	

}






public class rankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n,score,k=1;
		String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of the players ");
		ArrayList<Ranking> al=new ArrayList<Ranking>();  
		n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the player "+k);
			name=scan.next();
			System.out.println( "Enter the score of the player "+k);
			score = scan.nextInt();
			al.add(new Ranking(name,score)); 
			k++;
					
		}
		
		Collections.sort(al); 
		int j=1;
		
		for(Ranking st:al){  
			
			System.out.println(j+" "+st.name+" "+st.score);  
			j++;
	}

}
}
