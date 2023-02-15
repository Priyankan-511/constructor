package thing;

import boot.Camera;
import boot.Device;

public class CameraRunner {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	
		Camera camera = new Camera ();
		camera.getbrand();
		Camera.Capture();
		Camera.operate();
		
		Device device = new Camera ();
		device .operate();
		device.getbrand();
		
		Camera cast = (Camera)device;
		cast.Capture();
	
		

	}

}
