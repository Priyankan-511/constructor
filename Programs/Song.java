class Song{
	static String name;
	static String singer;
	static String song;
	static int duration;
	static void initvariable(String arg1,String arg2,String arg3,int arg4)
	{
		name=arg1;
		singer=arg2;
		song=arg3;
		duration=arg4;	
	}
	static void display()
	{
		System.out.println("initilize start");
		System.out.println("name"+name);
		System.out.println("singer");
		System.out.println("song");
		System.out.println("duration");
		
		
		System.out.println("initilize end");
		
	}
		

}