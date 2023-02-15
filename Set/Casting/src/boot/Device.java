package boot;

public class Device {
	private String brand;

	public Device ()
	{
		System.out.println("no arg constructor");
	
	}
	public Device(String brand) {
		this.brand=brand;
		System.out.println("String arg constr in device");
	}
	public static void operate()
	{
		System.out.println("opretaor in device");
	}

	public String getbrand() {
		return brand;
	}
}
