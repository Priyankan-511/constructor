package com.xworkz.association1.thing;

public class Glass {
	public String material;
	public int price;
	public boolean durable;
	public Gift ref;

	public Glass() {
		System.out.println("no arg constructors");
	}

	public Glass(String material, int price, boolean durable, Gift ref) {
		this.material = material;
		this.price = price;
		this.durable = durable;
		this.ref = ref;

	}

	public void init1(String material, int price, boolean durable) {
		this.material = material;
		this.price = price;
		this.durable = durable;

	}

	public void show() {
		System.out.println("material:" + material);
		System.out.println("price:" + price);
		System.out.println("durable:" + durable);
		System.out.println("");

		if (ref != null) {
			this.ref.display1();
		} else {
			System.out.println("ref not storing in memory");
		}

	}
}
