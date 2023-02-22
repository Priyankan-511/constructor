package boot;

import thing.FootWare;


public class FootWareRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FootWare footWare = new FootWare("vkc", 5, "full");
		System.out.println(footWare.toString());

		System.out.println(footWare.equals(footWare));

		FootWare footWare1 = new FootWare("bata",4, "half");
		System.out.println(footWare1.toString());

		System.out.println(footWare1.equals(footWare1));



	}

}
