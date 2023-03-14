package com.xworkz.applicationDTO.dto.boot;

import com.xworkz.applicationDTO.dto.things.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {
		MarketDTO marketDTO=new MarketDTO();
		marketDTO.setArea(1234);
		marketDTO.setName("Basaveswar");
		System.out.println(marketDTO.toString());
		System.out.println(marketDTO.equals(marketDTO));
		System.out.println(marketDTO.hashCode());

	}

}
