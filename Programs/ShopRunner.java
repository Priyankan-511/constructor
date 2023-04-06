class ShopRunner{
	public static void main(String [] value)
	{
		System.out.println("start;excution in shopRunner");
	
		String item="sweet";
		double price= 800;
		String brand= "kanti";
	
		Shop.buy(item,price,brand);
	
		String itemname1= "food";
		String itembrand1="nadini";
	
		Shop.exchange(itemname1,itembrand1);
	
		System.out.println("End;excution in shopRunner");
	}
	
}
		