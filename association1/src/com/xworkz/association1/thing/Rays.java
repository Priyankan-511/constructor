package com.xworkz.association1.thing;

public class Rays {

	public String occurnace;
	public int time;
	public boolean redincolour;
	public SunRise ref;

	public Rays() {
		System.out.println("no arg constructors");
	}

	public Rays(String occurnace, int cost, boolean redincolour, SunRise ref, int time) {

		this.occurnace = occurnace;
		this.time = time;
		this.redincolour = redincolour;
		this.ref = ref;
	}

	public void init(String occurnace, int time, boolean redincolour) {
		this.occurnace = occurnace;
		this.time = time;
		this.redincolour = redincolour;
	}

	public void show() {
		System.out.println("occurnace:" + occurnace);
		System.out.println("time:" + time);
		System.out.println("redincolour:" + redincolour);
		System.out.println("");

		if (ref != null) {
			this.ref.display1();
		} else {
			System.out.println("ref not storing in memory");
		}

	}

}
