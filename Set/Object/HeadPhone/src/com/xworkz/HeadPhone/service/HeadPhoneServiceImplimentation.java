package com.xworkz.HeadPhone.service;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.HeadPhone.dto.HeadPhoneDTO;

public class HeadPhoneServiceImplimentation implements HeadPhoneService{

	@SuppressWarnings("unused")
	@Override
	public boolean validteAndThenSave(HeadPhoneDTO dto) {
		if(dto!=null)
			System.out.println("dto is not null it validate property");
		Brand brand = dto.getbrand();
		String modelNo=dto.getModelNo();
		double price=dto.getPrice();
		TypeAndWeight typeAndWeight=dto.getTypeAndWeight();
		String name=dto.getModelNo();
		int invoiceNo=dto.getInvoiceNo();
		LocalTime localDate=dto.getMfgDate();
		
		int warrantyPeriod=dto.getWarrantyPeriod();
		if(brand!=null) {
			System.out.println("Name of the brand");
		}else {
			System.out.println("wrong brand name");
		}
		if(warrantyPeriod>6) {
			System.out.println("having good warrnty");
		}else {
			System.out.println("less warrnty");
		}
		if(invoiceNo>500) {
			System.out.println("genereted invoice is valid");
		}else {
			System.out.println("invoive is notvalid");
		}
		if(modelNo!=null) {
			System.out.println("Enter modelNo");
		}else {
			System.out.println("not an valid brand");	
		}
		if(price>500) {
			System.out.println("price s good");
		}else {
			System.out.println("prie is high");
		}
			
		if (name != null && name.isEmpty() && name.length() > 3 && name.length() < 30) {
			System.out.println("Name is valid");
		} else {
			System.out.println("Name is invalid");
		}
		LocalDate tomorrow=LocalDate.now().plusDays(1);
		LocalDate startDate=LocalDate.of(1, 2, 03);
		Object LocalDate;
		java.time.LocalDate localDate1 = null;
		System.out.println("prepared late");
			
		return false;
	}

	}
		
