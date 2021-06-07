import java.util.*;
import java.lang.*;

class vechicle{
	
	private String make,vechicleNumber,fuelType;
	private int fuelCapacity,cc;
	
	public String getMake()
	{
		return make;
	}
	public void setMake(String make) 
	{
		this.make = make;
	}
	public String getVechiceNumber()
	{
		return vechicleNumber;
	}
	public void setVechiceNumber(String vechiceNumber)
	{
		this.vechicleNumber = vechiceNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) 
	{
		this.fuelType = fuelType;
	}
	public int getFuelCapacity()
	{
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc()
	{
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public vechicle() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public vechicle(String make, String vechicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vechicleNumber = vechicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void display_make()
	{
		
		System.out.println("The Make Information is : "+" "+getMake());
	}
	
	public void basic_info()
	{
		System.out.println("The Basic Information is : "+" \n"+"Vechicle :  "+getMake()+" \n"+"Vechicle Number : "+getVechiceNumber()+"\n"+"Fuel Capacity : "+getFuelCapacity()+" \n"+"Fuel Type : "+getFuelType()+"\n"+"Engine CC : "+getCc());
		
	}
	
	public void detail_info()
	{
		
	}
	
	
	
	
	
	
}

class twoWheeler extends vechicle
{
	
	private boolean kickstartAvailable;
	
	
	public boolean isKickstartAvailable() 
	{
		return kickstartAvailable;
	}


	public void setKickstartAvailable(boolean kickstartAvailable)
	{
		this.kickstartAvailable = kickstartAvailable;
	}


	/*public twoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) 
	{
		
		// TODO Auto-generated constructor stub
	}*/
	public void detail_info()
	{
		System.out.println("**** Detailed Info *****");
		
		if(isKickstartAvailable()==true)
		{
			System.out.println("KickStart : Yes ");
		}
		
		else
		{
			System.out.println("Kickstart: No");
		}
	}
	


	
}

class fourWheeler extends vechicle
{
	private String audioSystems;
	private int numberofDoors;
	
	public String getAudioSystems() 
	{
		return audioSystems;
	}
	public void setAudioSystems(String audioSystems) 
	{
		this.audioSystems = audioSystems;
	}
	public int getNumberofDoors()
	{
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors)
	{
		this.numberofDoors = numberofDoors;
	}
	
	public void detail_info()
	{
		System.out.println("Audio System : "+" "+getAudioSystems());
		System.out.println("Number of Doors : "+" "+getNumberofDoors());
	}
	
	
}





public class vMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		vechicle ob1=new vechicle();
		twoWheeler ob2=new twoWheeler();
		fourWheeler ob3=new fourWheeler();
		
		int choice,fuel;
		System.out.println("Enter The Choice : ");
		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		
		System.out.println("Enter Vechicle Type : ");
		choice=s.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter Vechicle Make : ");
			ob1.setMake(s.next());
			
			System.out.println("Enter Vechicle Number : ");
			ob1.setVechiceNumber(s.next());
			
			System.out.println("Enter Fuel Type : ");
			
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			
			fuel=s.nextInt();
			if(fuel==1)
			{
				ob1.setFuelType("Petrol");
			}
			else if(fuel==2)
			{
				ob1.setFuelType("Diesel");
			}
			else
			{
				System.out.println("Invalid Choice");
				System.exit(0);
			}
			
			System.out.println("Enter Fuel Capacity : ");
			ob1.setFuelCapacity(s.nextInt());
			
			System.out.println("Enter Engine CC: ");
			ob1.setCc(s.nextInt());
			
			System.out.println("Enter Audio System : ");
			ob3.setAudioSystems(s.next());
			
			System.out.println("Enter Number of Doors : ");
			ob3.setNumberofDoors(s.nextInt());
			
			ob1.basic_info();
			System.out.println(" ");
			System.out.println("The Detailed Information is : ");
			
			ob3.detail_info();
		}
		
		else if(choice==2)
		{
			
			System.out.println("Enter Vechicle Make : ");
			ob1.setMake(s.next());
			
			System.out.println("Enter Vechicle Number : ");
			ob1.setVechiceNumber(s.next());
			
			System.out.println("Enter Fuel Type : ");
			
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			
			fuel=s.nextInt();
			if(fuel==1)
			{
				ob1.setFuelType("Petrol");
			}
			else if(fuel==2)
			{
				ob1.setFuelType("Diesel");
			}
			else
			{
				System.out.println("Invalid Choice");
				System.exit(0);
			}
			
			System.out.println("Enter Fuel Capacity : ");
			ob1.setFuelCapacity(s.nextInt());
			
			System.out.println("Enter Engine CC: ");
			ob1.setCc(s.nextInt());
			
			System.out.println("Enter Kickstart true/false : ");
			ob2.setKickstartAvailable(s.nextBoolean());
			
			ob1.basic_info();
			
			System.out.println(" ");
			System.out.println("The Detailed Information is : ");
			
			ob2.detail_info();
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}

	}

}
