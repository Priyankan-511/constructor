package com.xworkz.adress.repositary;

import com.xworkz.Exception.MemoryFullException;
import com.xworkz.address.dto.AdressDTO;

public class AdressRepositaryImpimentation implements AdressRepositary {
	AdressDTO[] dtos = new AdressDTO[2];
	int index = 0;
	private Object[] dto;

	public boolean saveDTO(AdressDTO dto) throws MemoryFullException {
		if (index < dtos.length) {
			dtos[index] = dto;
			System.out.println("repo:dto saved:" + dtos[index]);
			index++;
			return false;
		}

		throw new MemoryFullException("arry index out of bound exception,2 dtos we can share");
	}

	public int total() {
		return index;
	}

public AdressDTO findByNumber(int number) {
for (int i=0;i<index;i++){
	int temp = dtos[i].getNumber();
	if(number== temp) {
		return dtos[i];
	}
}
System.out.println("id and no not found");
return null;
}

	public boolean find(AdressDTO dto) {
		for (int i = 0; i < index; i++) {
			AdressDTO temp = dtos[i];
			if (dto.equals(temp)) {
				return true;
			}

		}
		return false;
	}
	public Object findByStreet(String Street) {
		for (int i = 0; i < index; i++) {
			String temp = ((AdressDTO) dto[i]).getStreet();
			if (Street.equals(temp)) {
				return (boolean) dto[i];
			}
			}
		System.out.println("no dto found by street");
		return null;
	}
	public AdressDTO findBypincode(int pincode) {
		for (int index = 0; index < this.index; index++) {
			int temp = dtos[index].getPincode();
			if (pincode==temp) {
				return dtos [index];
			}
		}
		return null;
	}
	public Object findfloorByNumber(int Number) {
		for(int index = 0; index< this.index;index++) {
			int num = dtos [index].getNumber();
			if(Number==num) {
				return dtos[index].getFloore();
			}
		}
		return null;
			}
	public AdressDTO findByStreetAndPincodeAndArea(String street,int pincode,String area) {
		for(int index = 0; index< this.index;index++) {
		String st = dtos [index].getStreet();
		int pin = dtos [index].getPincode();
		String area1 = dtos [index].getArea();
		if (street.equals(st)&& pincode == pin && area.equals(area1)) {
			
		}
		}
		return null;
	}
	public AdressDTO findByStreetAndcity(String street,String city) {
		for(int index = 0; index< this.index;index++) {
		String st = dtos [index].getStreet();
		String City = dtos [index].getCity();
		if (City.equals(City)&& st.equals(street)) {
			
		}
		}
		return null;
	}
	public int findpincodeByNumber(int Number) {
		for (int index = 0; index < this.index; index++) {
			int temp = dtos[index].getPincode();
			if (Number==temp) {
				int pin = dtos[index].getPincode();
				return pin;
			}
		}
		return Number;
	}
	
	

	
 public String  findByNumbertAndPincodeAndStreetAndFloore(String street,int pincode,String area,int number,int floore) {
		for(int index = 0; index< this.index;index++) {
		String st = dtos [index].getStreet();
		int pin = dtos [index].getPincode();
		@SuppressWarnings("unused")
		String area1 = dtos [index].getArea();
		int num = dtos [index].getNumber();
		int flr = dtos [index].getFloore();
		
		if (number== num && floore==flr&& street.equals(st)&&pincode==pin) {
			return dtos[index].getCity();
		}
			
		}
		return area;
}
}


