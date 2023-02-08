package com.xworkz.association1.boot;
import com.xworkz.association1.thing.*;

public class SunGlassRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sunglass ref = new Sunglass();
		ref.init("RayBan", 12000, true);
		ref.display1();

		Glass show = new Glass();
		show.init1("uv protected", 1100,true);
		show.show();



	}

}
