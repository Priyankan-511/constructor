class SongRunner{
 public static void main(String[] args)
 {
	 Song.display();
	 Song.initvariable("sanchariaagu ni","sanjith","super",5);
	 Song.display();
	 
	 System.out.println("reinitalize main start");
	 Song.initvariable("ninu","sanjith","melody",6);
	 Song.display();
	 System.out.println("reinitalize main end");
 }
}