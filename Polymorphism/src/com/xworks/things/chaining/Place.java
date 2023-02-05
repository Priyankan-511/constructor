package com.xworks.things.chaining;

public class Place {
	public String name;
	public int population;
	public String district;
	public String state;
	public String country;

	public Place() {
		System.out.println("no argument  constructor");
	}

	public Place(String name) {
		this.name = name;
		System.out.println("name is  argument constructor");
	}

	public Place(String name, int population) {
		this(name);
		this.population = population;
		System.out.println(" population argument constructor");
	}

	public Place(String name, int population, String district) {
		this(name, population);
		this.district = district;
		System.out.println("constructor is argument");
	}

	public Place(String name, int population, String district, String state) {
		this(name, population, district);
		this.state = state;
		System.out.println("String name,int population,String district,String state");
	}

	public Place(String name, int population, String district, String state, String country) {
		this(name, population, district);
		this.country = country;
		System.out.println("String name,int population,String district,String state,String country");
	}

	public void show() {
		System.out.println("name:"+name);
		System.out.println("population:"+population);
		System.out.println("district:"+district);
		System.out.println("state:"+state);
		System.out.println("country:"+country);
		

	}
}
