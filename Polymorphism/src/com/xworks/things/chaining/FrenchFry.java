package constrctor;

public class FrenchFry {
	public String item;
	public String name;
	public String shape;
	public String taste;
	public boolean availbility;
	public boolean spicy;
	public boolean good;
	public int price;
	public int quntity;
	public int noofplate;
	
	public FrenchFry() {
		System.out.println("wiout argument FrenchFry running");
	}
	public FrenchFry (String ref){
	item=ref;
	}
	public FrenchFry(int ref,boolean ref1) {
		spicy=ref1;
		item=ref2;
	}
	public FrenchFry(String ref, boolean ref1 ,String ref2) {
		spicy=ref1;
		shape=ref2;
	}
}


