package com.xworkx.weapon.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkx.weapon.constant.Type;

@SuppressWarnings("serial")
public class WeaponDTO implements Serializable {
	private int id;
	private String name;
	private Type type;
	private double cost;
	private String material;
	private String madeBy;
	private String manufacturedBy;
	private LocalDate manufacturedYear;
	private String useddBy;
	private String usedFor;
	private double weight;

	@Override
	public String toString() {
		return "WeaponDTO [id=" + id + ", name=" + name + ", cost=" + cost + ", material=" + material + ", madeBy="
				+ madeBy + ", manufacturedBy=" + manufacturedBy + ", useddBy=" + useddBy + ", usedFor=" + usedFor
				+ ", weight=" + weight + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType1(Type string) {
		this.type = string;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public LocalDate getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(LocalDate manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getUseddBy() {
		return useddBy;
	}

	public void setUseddBy(String useddBy) {
		this.useddBy = useddBy;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, id, madeBy, manufacturedBy, material, name, usedFor, useddBy, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeaponDTO other = (WeaponDTO) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(madeBy, other.madeBy) && Objects.equals(manufacturedBy, other.manufacturedBy)
				&& Objects.equals(material, other.material) && Objects.equals(name, other.name)
				&& Objects.equals(usedFor, other.usedFor) && Objects.equals(useddBy, other.useddBy)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public void setType(String string) {
		// TODO Auto-generated method stub
		
	}

}
