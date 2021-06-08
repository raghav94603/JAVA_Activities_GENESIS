class HotelRoom
{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;

	public HotelRoom()
	{}

	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}

	public int calculateTariff(int costPerSqFeet)
	{
		return numberOfSqFeet*costPerSqFeet;
	}

	public int getRatePerSqFeet()
	{
		return 0;
	}
}

class DeluxeRoom extends HotelRoom
{
	protected int ratePerSqFeet;

	public DeluxeRoom()
	{
		this.ratePerSqFeet = 10;
	}

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;		
	}

	public int getRatePerSqFeet()
	{
		if(hasWifi)
		return ratePerSqFeet+2;

		else
		return ratePerSqFeet;
	}
}

class DeluxeACRoom extends DeluxeRoom
{
	public DeluxeACRoom()
	{
		this.ratePerSqFeet = 12;
	}

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;		
	}
}

class SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;

	public SuiteACRoom()
	{
		this.ratePerSqFeet = 15;
	}

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;		
	}

	public int getRatePerSqFeet()
	{
		if(hasWifi)
		return ratePerSqFeet+2;

		else
		return ratePerSqFeet;
	}
}

class hotelMain
{
	public static void main(String gg[]) throws Exception
	{
		System.out.println("Hotel Room Tariff Calculator");

		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");

		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		System.out.println("Select Room Type:");
		char choice = (br.readLine()).charAt(0);

		System.out.println("Hotel Name:");
		String name = br.readLine();

		System.out.println("Room Sqaure Feet Area:");
		int area = Integer.parseInt(br.readLine());

		System.out.println("Room has TV (yes/no):");
		String tv = br.readLine();

		System.out.println("Room has Wifi (yes/no):");
		String wifi = br.readLine();

		boolean hasTV, hasWifi;

		if(tv.equals("yes"))
		hasTV = true;

		else
		hasTV = false;

		if(wifi.equals("yes"))
		hasWifi = true;

		else
		hasWifi = false;

		HotelRoom hr = null;

		switch(choice)
		{
			case '1':
				hr = new DeluxeRoom(name, area, hasTV, hasWifi);
				break;

			case '2':
				hr = new DeluxeACRoom(name, area, hasTV, hasWifi);
				break;

			case '3':
				hr = new SuiteACRoom(name, area, hasTV, hasWifi);
				break;
		}

		System.out.print("Room Tarrif per day is:");
		System.out.println(hr.calculateTariff(hr.getRatePerSqFeet()));
	}
}