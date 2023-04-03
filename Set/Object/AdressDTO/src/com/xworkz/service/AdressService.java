package com.xworkz.service;

import com.xworkz.Exception.DataValidException;
import com.xworkz.address.dto.AdressDTO;

public interface AdressService {
	public boolean validateAndThenSave(AdressDTO dto)throws DataValidException;
	default int getTotal() {
		return 0;
		}
	
	default AdressDTO findByNumber(int Number)throws DataValidException{
		return null;		
	}
	
	default AdressDTO findBystreet(String Street)throws DataValidException{
		return null;	
	}
	 default AdressDTO findByPinCode(int pincode)throws DataValidException{
		return null;
	 }
	default AdressDTO findByStreetAndPinCodeAndArea(String street)
			throws DataValidException{
		return null;
		}
	default AdressDTO findByCityAndState (String city, String string) throws DataValidException{
		return null;
		}
	default AdressDTO findByflooreNumber(int number)throws DataValidException{
		return null;
		}
	default AdressDTO findCitydByNumberAndFlooreAndPinCode(int number,String floore,String street,int Pincode)
			throws DataValidException{
		return null;
		}
	default AdressDTO  findpincodeByNumber(int number) throws DataValidException{
		return null;
		
	}
	public boolean find(AdressDTO dto2) throws DataValidException;

}
