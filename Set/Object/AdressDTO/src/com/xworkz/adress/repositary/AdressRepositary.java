package com.xworkz.adress.repositary;

import com.xworkz.Exception.MemoryFullException;
import com.xworkz.address.dto.AdressDTO;

public interface AdressRepositary {
	public boolean saveDTO(AdressDTO dto) throws MemoryFullException;

	default int total() {
		return 0;
	}

	default  boolean find(AdressDTO dto) {
		return false;
	}
 default Object findByStreet(String street) {
	return (Boolean) null;
	 
 }

 default AdressDTO findByStreetAndPincodeAndArea(String street, int pincode, String area) {
	return null;
}

	default  AdressDTO findByStreetAndcity(String state, String city) {
		return null;
	}

	default String findFlooreByNumber(int number) {
		return null;
	}
	default  String  findCityByNumberAndFlooreAndStreetAndPincode( String floor,String street, int pincode, int number) {
		return null;
	}
	default int findpincodeByNumber(int number) {
		return 0;
		
	}
	
	

}



