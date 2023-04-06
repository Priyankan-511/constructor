class AirConditioner{
	static void increaseSpeed(int speed ){
	System.out.println("START:Execution in AirConditioner");
	System.out.println("start");
	System.out.println("speed:"+speed);
	
	if(speed==5){
		System.out.println("canot increase more");
	}
	}
	static void decresespeed(int speed1){
	System.out.println("speed:+speed1");
	if(speed1<=0 || speed1>5){
	System.out.println("invalid speed");}
	}
	static void changeprogram(String program){
	System.out.println("program:"+program);
	if(program==null ||program!="summer"|program!="winter"| program!="rain"){
		System.out.println("invalid program");
	}
	}
	static void increaseTemp(double temp){
		System.out.println("Temp:"+temp);
		if (temp>32){
		System.out.println("invalid Temp");
		}
	}
	static void decreaseTemp(double temp1){
		System.out.println("temp:"+temp1);
		if (temp1<0){
		System.out.println("invalid temp");
		}
		System.out.println("Ends");
	}
	
}

