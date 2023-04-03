package com.xworkz.address.dto;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class AdressDTO implements Serializable {
	private String street;
	private String area;
	private int floore;
	private String city;
	private String state;
	private int pincode;
	private int number;
	@Override
	public String toString() {
		return "AdressDTO [street=" + street + ", area=" + area + ", floore=" + floore + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", number=" + number + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, city, floore, number, pincode, state, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdressDTO other = (AdressDTO) obj;
		return Objects.equals(area, other.area) && Objects.equals(city, other.city)
				&& Objects.equals(floore, other.floore) && number == other.number && pincode == other.pincode
				&& Objects.equals(state, other.state) && Objects.equals(street, other.street);
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getFloore() {
		return floore;
	}
	public void setFloore(int floore) {
		this.floore = floore;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
