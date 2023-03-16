package com.xworkz.HeadPhone.service;

public enum TypeAndWeight {
	NeckBand(10.20),BUDS(2.3);
	private final double weight;
	private TypeAndWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}


}
