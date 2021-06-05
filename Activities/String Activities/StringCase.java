import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class StringCase{
	
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in); 
        
        System.out.println("Enter The First String : ");
        String first = s.nextLine();
        String fletter=first.substring(0,1);
        String sletter=first.substring(1,first.length());
        
        fletter=fletter.toUpperCase();
        
        String Final_String=fletter+sletter;
        System.out.println("Enter The Second String : ");
        String second = s.nextLine();
        
        System.out.println(Final_String+" "+second.toUpperCase());
    }
}