package com.xworkz.HeadPhone.dto;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

import com.xworkz.HeadPhone.constant.Color;
import com.xworkz.HeadPhone.service.Brand;
import com.xworkz.HeadPhone.service.TypeAndWeight;

@SuppressWarnings("serial")
public class HeadPhoneDTO implements Serializable {
	private Brand brand;
	private String modelNo;
	private double price;
	private boolean bass;
	private Color color;
	private TypeAndWeight typeAndWeight;
	private String customerName;
	private int invoiceNo;
	private LocalTime mfgDate;
	private int warrantyPeriod;

	public HeadPhoneDTO(Brand brand, String modelNo, double price, boolean bass, Color color,
			TypeAndWeight typeAndWeight, String customerName, int invoiceNo, LocalTime mfgDate, int warrantyPeriod) {
		super();
		this.brand = brand;
		this.modelNo = modelNo;
		this.price = price;
		this.bass = bass;
		this.color = color;
		this.typeAndWeight = typeAndWeight;
		this.customerName = customerName;
		this.invoiceNo = invoiceNo;
		this.mfgDate = mfgDate;
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [modelNo=" + modelNo + ", price=" + price + ", bass=" + bass + ", customerName="
				+ customerName + ", invoiceNo=" + invoiceNo + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeAndWeight getTypeAndWeight() {
		return typeAndWeight;
	}

	public void setTypeAndWeight(TypeAndWeight typeAndWeight) {
		this.typeAndWeight = typeAndWeight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalTime getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalTime mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bass, customerName, invoiceNo, modelNo, price, warrantyPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadPhoneDTO other = (HeadPhoneDTO) obj;
		return bass == other.bass && Objects.equals(customerName, other.customerName) && invoiceNo == other.invoiceNo
				&& Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& warrantyPeriod == other.warrantyPeriod;
	}

	public Brand getbrand() {
		// TODO Auto-generated method stub
		return null;
	}
}
