package boot;

import thing.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint paint = new Paint();
		paint.setBrand("Varna");
		paint.setnoofbox(20);
		paint.setColour("pink");
		paint.setPrice(5000);
		System.out.println(paint);
		

		Paint paint1 = new Paint();
		paint1.setBrand("Varna");
		paint1.setnoofbox(20);
		paint1.setColour("pink");
		paint1.setPrice(5000);
		System.out.println(paint1);

		System.out.println("hashcode is" + paint1.hashcode() + "origin hashcode is " + System.identityHashCode(paint1));

		System.out.println(paint1.equals(paint1));



	}

}
