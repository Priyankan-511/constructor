package com.xworkz.applicationDTO.dto.boot;

import com.xworkz.applicationDTO.dto.things.TravelDTO;

public class TravelDTORunner {

	public static void main(String[] args) {
		TravelDTO travelDTO = new TravelDTO();
		travelDTO.setBudget(5000);
		travelDTO.setKm(320);
		travelDTO.setPlace("wyanad");
		System.out.println(travelDTO.equals(travelDTO));
		System.out.println(travelDTO.hashCode());
		System.out.println(travelDTO.toString());

	}

}
