class Theater{
	static String name;
	static int ticketprice;
	static String ownername;
	static String location;
	static String type;
	static void intivariable(String arg1,int arg2,String arg3,String arg4,String arg5)
	{
		name=arg1;
		ticketprice=arg2;
		ownername=arg3;
		location=arg4;
		type=arg5;
		
	}
	static void display()
	{
		System.out.println("initilize start");
		System.out.println("name");
		System.out.println("ownername");
		System.out.println("location");
		System.out.println("ticketprice");
		System.out.println("type");
		
		
		System.out.println("initilize end");
		
	}
		

}