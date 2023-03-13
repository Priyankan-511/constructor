package boot;

import thing.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake = new Cake("Srwabrry","three","Round",1500);
		System.out.println(cake);

		System.out.println(cake.equals(cake));

		Cake cake1 = new Cake("mango","two","Square",1000);
		System.out.println(cake1.toString());

		System.out.println(cake1.equals(cake1));

	}

}
