package com.xworks.things.chaining;

public class HospitalRunner {

	public static void main(String[] args) {
			Hospital hospital = new Hospital () ;
			hospital.show();
			System.out.println("");
			Hospital hospital1 = new Hospital ("trupti","BasaveswarNagar",6,12,"yes");
			hospital1.show();
			

	}

}
