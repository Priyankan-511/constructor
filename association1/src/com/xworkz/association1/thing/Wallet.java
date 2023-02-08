package com.xworkz.association1.thing;

public class Wallet {
	public String brand;
	public int cost;
	public boolean durable;
	public Money ref;

	public Wallet() {
		System.out.println("no arg constructors");
	}

	public Wallet(String brand, int cost, boolean durable, Money ref) {
		this.brand = brand;
		this.cost = cost;
		this.durable = durable;
		this.ref = ref;

	}

	public void init(String brand, int cost, boolean durable) {
		this.brand = brand;
		this.cost = cost;
		this.durable = durable;

	}

	public void show() {
		System.out.println("brand:" + brand);
		System.out.println("cost:" + cost);
		System.out.println("durable:" + durable);
		System.out.println("");

		if (ref != null) {
			this.ref.display1();
		} else {
			System.out.println("ref not storing in memory");
		}

	}

}
