package boot;

public class Alcohol extends Whiskey {
	public static Alcohol alcohol;
	@SuppressWarnings("unused")
	private Object brand;

	public Alcohol() {
		System.out.println("no arg constrctr in Alcohol");

	}

	public void Alcohol1(Object brand) {
		this.brand = brand;
		System.out.println("String arg constructor");
	}

	public static void quility() {
		System.out.println("running  of Whiskey");
	}

	public String getbrand() {
		return getbrand();
	}

	public static void whiskey() {
		// TODO Auto-generated method stub

	}

}
