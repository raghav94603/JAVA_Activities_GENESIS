import java.util.*;
import java.lang.*;

abstract class shape
{
	abstract void calculateArea(int value);
}

class circle extends shape
{
	void calculateArea(int value)
	{
		System.out.println("The area of circle is : ");
		System.out.print(3.1415*(value*value));
		
	}
}

class square extends shape
{
	void calculateArea(int value)
	{
		System.out.println("The area of rectangle is : ");
		System.out.print(value*value);
		
	}
}

public class shapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		
		circle ob1=new circle();
		square ob2=new square();
		
		int choice;
		
		System.out.println("Enter the Shape choice : ");
		System.out.println("1.Circle");
		System.out.println("2.Square");
		
		choice=s.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter The Radius : ");
			ob1.calculateArea(s.nextInt());
			
			
		}
		else if(choice==2)
		{
			System.out.println("Enter The Side : ");
			ob2.calculateArea(s.nextInt());
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}

	}

}
