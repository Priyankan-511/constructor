package boot;

public class Camera extends Device {
	public Camera ()
	{
		System.out.println("no argument constructor");
	}
	public Camera(String brand) {
		System.out.println("String constructor in Camera");
	}
	public static void Capture() {
		System.out.println("photo captured in camera");
	}
}
