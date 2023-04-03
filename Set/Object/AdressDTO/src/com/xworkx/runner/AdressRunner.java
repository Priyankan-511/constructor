package com.xworkx.runner;

import com.xworkz.Exception.DataValidException;
import com.xworkz.Exception.MemoryFullException;
import com.xworkz.address.dto.AdressDTO;
import com.xworkz.adress.repositary.AdressRepositary;
import com.xworkz.adress.repositary.AdressRepositaryImpimentation;
import com.xworkz.service.AdressService;
import com.xworkz.service.AdressServiceImplementation;

public class AdressRunner {
	public static void main(String []arg) {
		
		AdressDTO dto1 = new AdressDTO();
		dto1.setStreet("2nd crs");
		dto1.setArea("rajajinagar");
		dto1.setPincode(560010);
		dto1.setFloore(1);
		dto1.setNumber(400);
		dto1.setState("mysore");
		dto1.setCity("karanatak");
		
		AdressDTO dto2 = new AdressDTO();
		dto1.setStreet("5th cross");
		dto1.setArea("basaveswarnagar");
		dto1.setPincode(560011);
		dto1.setFloore(11);
		dto1.setNumber(600);
		dto1.setState("banglore");
		dto1.setCity("goa");
		
		System.out.println(dto1);
		System.out.println(dto2);
		
		AdressRepositary repo = new AdressRepositaryImpimentation();
		
		AdressService service = new AdressServiceImplementation(repo);
				try {
					service.validateAndThenSave(dto1);
					System.out.println("runner:saved dto1 in repo");
				}
				int totalDtos = service .getTotal();
				System.out.println("total dto by number:"+ dto1);
				
				boolean found = service.find(dto2);
				System.out.println("DTO found by repositary:"+ found);
				
				AdressDTO dto = service.findBystreet("2nd crs");
				System.out.println("found dto by street:"+dto);
				
				AdressDTO dto111 = service.findBystreet("2nd crs");
				System.out.println("found dto by street:"+dto111);
				
				AdressDTO dtoBypin = service.findByPinCode("560011");
				System.out.println("dto by pincode:"+ dtoBypin);
				
				AdressDTO dtobySPA = service.findByStreetAndPinCodeAndArea("xyz");
				System.out.println("found dto by street&pin&area:"+dtobySPA);
				
				AdressDTO dtoByCityAndStreet1 = service.findByCityAndState("banglore","goa");
				System.out.println("dto by city & state:"+ dtoByCityAndStreet1);
 
	}catch (DataValidException e1) {
		e1.printStackTrace();
	}
	catch (MemoryFullException e) {
		e.printStackTrace();
	} 
	finally{
		System.out.println("main() ends");
	}
}
	
				
	}


