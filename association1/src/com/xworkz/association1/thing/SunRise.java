package com.xworkz.association1.thing;

public class SunRise {
	public String colour;
	public int time;
	public boolean happyvibe;
	public Rays ref = new Rays();

	public void init(String colour, int time, boolean happyvibe) {
		this.colour = colour;
		this.time = time;
		this.happyvibe = happyvibe;

	}

	public void display1() {
		System.out.println("colour:" + colour);
		System.out.println("time:" + time);
		System.out.println("happyvibe:" + happyvibe);
		System.out.println(" ");
		this.ref.show();
	}

}
