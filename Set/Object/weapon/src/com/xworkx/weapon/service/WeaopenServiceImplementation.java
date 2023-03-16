package com.xworkx.weapon.service;

import java.time.LocalDate;

import com.xworkx.weapon.dto.WeaponDTO;

public class WeaopenServiceImplementation implements WeaponService {

	@SuppressWarnings("unused")
	public boolean validAndThenSave(WeaponDTO dto) {
		if (dto != null) {
			System.out.println("DTO is not null it validate property");
			int id = dto.getId();
			String name = dto.getName();
			com.xworkx.weapon.constant.Type type = dto.getType();
			double cost = dto.getCost();
			String material = dto.getMaterial();
			String madeBy = dto.getMadeBy();
			String manufacturedBy = dto.getManufacturedBy();
			LocalDate manufacturedYear = dto.getManufacturedYear();
			String usedBy = dto.getUseddBy();
			String usedFor = dto.getUseddBy();
			double weight = dto.getWeight();
			if (name != null && name.isEmpty() && name.length() > 3 && name.length() < 30) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Name is invalid");
			}
			if (type != null) {
				System.out.println("type is valid");
			} else {
				System.out.println("type is valid");
			}
			if (id > 0) {
				System.out.println("id is invalid");
			} else {
				System.out.println("id is valid");
			}
			if (type != null) {
				System.out.println("type is valid");
			} else {
				System.out.println("type is invalid");
			}
			if (cost > 100.0) {
				System.out.println("cost is benifical");
			} else {
				System.out.println("cost is high");
				if (material != "copper") {
					System.out.println("material is good");
				} else {
					System.out.println("material is bad");
				}
				if (manufacturedBy != "pri") {
					System.out.println("manufactred by pri");
				} else {
					System.out.println("not manufactred by pri");
				}
				LocalDate tomorrow=LocalDate.now().plusDays(1);
				LocalDate startDate=LocalDate.of(1, 2, 03);
				Object LocalDate;
				java.time.LocalDate LocalDate1 = null;
				System.out.println("prepared late");
				if (usedBy != "abc") {
					System.out.println("good usage");
				} else {
					System.out.println("not an good usage");
				}
				if (usedFor != "goodwork") {
					System.out.println("used for good use");
				} else {
					System.out.println("not for good use");
				}
				if (weight != 20) {
					System.out.println("good weight");
				} else {
					System.out.println("weigth is less");

				}

			}
			return false;
		}
		return false;

	}
}
