package com.xworkz.applicationDTO.dto.things;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class MarketDTO implements Serializable{
	private String name;
	private int area;
	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", area=" + area + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public int hashCode() {
		return Objects.hash(area, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		return area == other.area && Objects.equals(name, other.name);
	}
	
	

}
