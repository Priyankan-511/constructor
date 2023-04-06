class MovieRunner{
 public static void main(String[] args)
 {
	 Movie.display();
	 Movie.initvariable("uunchi","10000.02f","amith","srihari","aliya","2");
	 Movie.display();
	 
	 System.out.println("reinitalize main start");
	 Movie.initvariable("headbush","500000.0f","dolly","dananjaya","sara","4");
	 Movie.display();
	 System.out.println("reinitalize main end");
 }
}