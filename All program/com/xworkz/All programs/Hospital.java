package com.xworks.things.chaining;

public class Hospital {

		public String name;
		public String location;
		public int open;
		public int close;
		public String openfulltime;

		public Hospital() {
			System.out.println("no arg constructor");
		}

		public Hospital(String name) {
			this.name=name;
			System.out.println("arg name constructor");
		}
		public Hospital(String name,String location) {
			this(name);
			this.location=location;
			System.out.println("location and name are arg constructor");
		}
		public Hospital(String name,String location,int open) {
			this(name,location);
			this.open=open;
			System.out.println("name location open are arg constructor");
		}
		public Hospital(String name,String location,int open,int close) {
			this (name,location,open);
			this.close=close;
			System.out.println("name location open close are arg constructor");
		}
		public Hospital(String name,String location,int open,int close,String openfulltime) {
			this(name,location,open,close);
			this.openfulltime=openfulltime;
			System.out.println("name location open close openfulltime are arg constructor");
		}
		public void show() {
			System.out.println("name:"+this.name);
			System.out.println("location:"+this.location);
			System.out.println("open:"+this.open);
			System.out.println("close:"+this.close);
			System.out.println("openfulltime:"+this.openfulltime);
		}
		
		
	}


