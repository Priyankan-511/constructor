class Shop {
	static void buy(String item,double price,String brand)
	{
		System.out.println("START:Execution in buy");
		if (price >1000)
		{
			System.out.println("price is costly");
		}
		else if (price<1000 & price>500)
		{
			System.out.println("price is expensive");
		}
		else if (price<500)
		{
			System.out.println("price is ok");
		}
		System.out.println("End;Execution in buy");
	}
	static void exchange(String itemname1,String itembrand1)
		{
			System.out.println("start excution in exchange");
			System.out.println("item:"+itemname1);
			System.out.println("brand:"+itembrand1);
		
		
			System.out.println("end excution in exchange");
	
		}
	
}