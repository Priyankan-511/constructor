class Bus{
	static int amount (String BusRoute)
	{
		System.out.println("BusRoute:"+BusRoute);
		if(BusRoute=="mejestic")
		{
			return 20;
		}
		return 0;
	}
}