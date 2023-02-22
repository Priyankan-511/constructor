package boot;

import thing.Alcohol;

public class AlcoholRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alcohol alcohol = new Alcohol();
		System.out.println(alcohol.toString());

		System.out.println(alcohol.equals(alcohol));

		Alcohol alcohol1 = new Alcohol();
		System.out.println(alcohol1.toString());

		System.out.println(alcohol1.equals(alcohol1));



	}

}
