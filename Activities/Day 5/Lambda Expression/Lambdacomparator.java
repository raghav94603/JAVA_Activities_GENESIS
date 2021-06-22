
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class layerc{
	String name,skill;
	public layerc(String name, String skill) {
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

/*class Playercomparator implements Comparator <player> {

	
	@Override
	public int compare(player o1, player o2) {
		 return o1.skill.compareTo(o2.skill);
	}
	


}*/
public class Lambdacomparator {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r);  
	     ArrayList<layerc> al=new ArrayList<layerc>();
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
        		 al.add(new layerc(name[i], "All Rounder"));
        	 else if (ch==2)
        		 al.add(new layerc(name[i], "Batsman"));
        	 else if(ch==3)
        		 al.add(new layerc(name[i], "Bowler"));
        	 else
        	 {
        		 System.out.println("Invalid");
        	     System.exit(1);
        	 }
         }
         al.sort((layerc o1,layerc o2)-> o1.skill.compareTo(o2.skill));
        
         System.out.println("Player Details");
         for (layerc p : al) {
             System.out.println("Player Name: " +p.name + "  Skill: " + p.skill
                                );
         }
         sc.close();
	}

}

