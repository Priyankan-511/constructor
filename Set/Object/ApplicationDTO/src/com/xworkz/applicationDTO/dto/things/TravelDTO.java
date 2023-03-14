package com.xworkz.applicationDTO.dto.things;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class TravelDTO implements Serializable {
	private String Place;
	private int km;
	private double budget;
	@Override
	public String toString() {
		return "TravelDTO [Place=" + Place + ", km=" + km + ", budget=" + budget + "]";
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Place, budget, km);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDTO other = (TravelDTO) obj;
		return Objects.equals(Place, other.Place)
				&& Double.doubleToLongBits(budget) == Double.doubleToLongBits(other.budget) && km == other.km;
	}
	

}
