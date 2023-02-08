package com.xworkz.association1.thing;

public class Money {

	public String note;
	public int count;
	public boolean pocketfull;

	public void init(String note, int count, boolean pocketfull) {
		this.note = note;
		this.count = count;
		this.pocketfull = pocketfull;
	}

	public void display1() {
		System.out.println("note:" + note);
		System.out.println("count:" + count);
		System.out.println("pocketfull:" + pocketfull);

	}

}
