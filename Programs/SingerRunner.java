class SingerRunner{
 public static void main(String[] args)
 {
	 Singer.display();
	 Singer.initvariable("sanjith",6,20,"melody");
	 Singer.display();
	 
	 System.out.println("reinitalize main start");
	 Singer.initvariable("priya",5,25,"plesunt");
	 Singer.display();
	 System.out.println("reinitalize main end");
 }
}