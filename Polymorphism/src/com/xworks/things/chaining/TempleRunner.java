package com.xworks.things.chaining;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple = new Temple () ;
		temple.show();
		System.out.println("");
		Temple temple1 = new Temple ("Sairam","BasaveswarNagar",5,8,"yes"
				);
		temple1.show();
		

	}

}
