import java.io.*;
import java.util.*;
class players{
	String name,skill;
	public players(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}

class Playercomparator implements Comparator <players> {

	
	@Override
	public int compare(players o1, players o2) {
		 return o1.skill.compareTo(o2.skill);
	}
	


}
public class activity10Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r);  
	     
	     ArrayList<players> al=new ArrayList<players>();
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.println("Please provide the number of players to be registered:");
	     int n=sc.nextInt();
	     
	     String[] name=new String[n];
	     
	     int ch;
         for(int i=0;i<n;i++)
         {
        	 System.out.println("Please enter player name:");
        	 name[i]=br.readLine();
        
        	 System.out.println("Please select skill of player:\n1.All Rounder\n2.Batsman\n3.Bowler");
        	 ch=sc.nextInt();
        	 
        	 if(ch==1) 
        		 al.add(new players(name[i], "All Rounder"));
        	 else if (ch==2)
        		 al.add(new players(name[i], "Batsman"));
        	 else if(ch==3)
        		 al.add(new players(name[i], "Bowler"));
        	 else
        	 {
        		 System.out.println("Invalid");
        	     System.exit(1);
        	 }
         }
        
         Collections.sort(al, new Playercomparator());
         System.out.println("Player Details");
         for (players p : al) {
             System.out.println("Player Name: " +p.name + "  Skill: " + p.skill
                                );
         }
         sc.close();
	}

}
