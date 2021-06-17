import java.util.*;

public class Main2
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
        HashMap<String,String>hm=new HashMap<String,String>();
        Bowler bow=new Bowler();
        Wicket wik=new Wicket();

        System.out.println("Enter the player name");
        bow.setName(ob.nextLine());
        System.out.println("Enter wickets - seperated by | symbol");
        wik.setPlayerName(ob.nextLine());

        hm.put(bow.getName(),wik.getPlayerName());        

        while(true)
        {
            System.out.println("Do you want to add another player (yes/no)");
            String bb=ob.nextLine();
            if(bb.equals("yes"))
            {
                System.out.println("Enter the player name");
                bow.setName(ob.nextLine());
                System.out.println("Enter wickets - seperated by | symbol");
                wik.setPlayerName(ob.nextLine());
                hm.put(bow.getName(),wik.getPlayerName());
            }
            else if(bb.equals("no"))
            {
                break;
            }
        }
        
        System.out.println("Enter the player name to search");
        String namess=ob.nextLine();
        if(hm.containsKey(namess))
        {
            System.out.println("Player Name:"+namess);
            String res=hm.get(namess);
            String arr[]=res.split("\\|");
            System.out.println("Wicket Count :"+arr.length);    
        }
        else
        {
            System.out.println("No player found with the name"+namess);
        }
        while(true)
        {
            System.out.println("Do you want to search another player (yes/no)");
            String a=ob.nextLine();
            if(a.equals("yes"))
            {
                System.out.println("Enter the player name to search");
                String names=ob.nextLine();
                if(hm.containsKey(names))
                {
                    System.out.println("Player Name:"+names);
                    String ress=hm.get(names);
                    String arrr[]=ress.split("\\|");
                    System.out.println("Wicket Count :"+arrr.length);    
                }
                else
                {
                    System.out.println("No player found with the name"+names);
                }
            }
            else if(a.equals("no"))
            {
                System.exit(0);
            }
        }
    }
}
