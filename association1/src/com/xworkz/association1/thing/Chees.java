package com.xworkz.association1.thing;

public class Chees {
	public String brand;
	public int price;
	public boolean testy;
	public Money ref;

	public Chees() {
		System.out.println("no arg constructors");
	}

	public Chees(String brand, int price, boolean testy, Money ref) {
		this.brand = brand;
		this.price = price;
		this.testy = testy;
		this.ref = ref;

	}

	public void init(String brand, int price, boolean testy) {
		this.brand = brand;
		this.price = price;
		this.testy = testy;

	}

	public void show() {
		System.out.println("brand:" + brand);
		System.out.println("price:" + price);
		System.out.println("testy:" + testy);
		System.out.println("");

		if (ref != null) {
			this.ref.display1();
		} else {
			System.out.println("ref not storing in memory");
		}

	}

}
