package com.xworkz.service;

import com.xworkz.Exception.DataValidException;
import com.xworkz.address.dto.AdressDTO;
import com.xworkz.adress.repositary.AdressRepositary;
import com.xworkz.util.AdressUtil;

public abstract class AdressServiceImplementation implements AdressService {

	private AdressRepositary addRepo;

	public AdressServiceImplementation(AdressRepositary addRepo) {
		this.addRepo = addRepo;
	}

	public boolean ValidateAndThensave(AdressDTO dto) throws DataValidException {
		if (dto != null) {
			boolean validStreet = false;
			boolean validArea = false;
			boolean validpincode = false;
			boolean validfloore = false;
			boolean validnumber = false;
			boolean validcity = false;
			boolean validstate = false;

			String Street = dto.getStreet();
			if (AdressUtil.ValidString(Street)) {
				validStreet = true;
				System.out.println("street is valid");

			} else {
				System.out.println("its invalid");
			}

			String Area = dto.getArea();
			if (AdressUtil.ValidString(Area)) {
				validStreet = true;
				System.out.println("Area is valid");
			} else {
				System.out.println("its invalid");
			}

			int pincode = dto.getPincode();
			if (AdressUtil.validInt(pincode)) {
				validpincode = true;
				System.out.println("pincode is valid");
			} else {
				System.out.println("its invalid");
			}

			String floore = dto.getStreet();
			if (AdressUtil.ValidString(floore)) {
				validfloore = true;
				System.out.println("floore is valid");
			} else {
				System.out.println("its invalid");
			}

			int Number = dto.getNumber();
			if (AdressUtil.validInt(Number)) {
				validnumber = true;
				System.out.println("Number is valid");
			} else {
				System.out.println("its invalid");
			}

			String City = dto.getCity();
			if (AdressUtil.ValidString(City)) {
				validcity = true;
				System.out.println("city is valid");
			} else {
				System.out.println("its invalid");
			}

			String state = dto.getState();
			if (AdressUtil.ValidString(state)) {
				validstate = true;
				System.out.println("street is valid");
			} else {
				System.out.println("its invalid");
			}
			if (AdressUtil.validFlags(validStreet, validArea, validpincode, validfloore, validnumber, validcity,
					validstate)) {
				boolean temp = addRepo.saveDTO(dto);
				if (temp) {
					return true;

				} else {
					return false;
				}
			}
		}
		throw new DataValidException("data validation for exception");
	}

	public int getTotal() {
		return addRepo.total();
	}

	public AdressDTO findByNumber(int number) throws DataValidException {
		if (AdressUtil.validInt(number)) {
			AdressDTO dto = ((AdressService) addRepo).findByNumber(number);
			return dto;
		}
		throw new DataValidException("data validation by findbyNumber()");
	}

	public boolean find(AdressDTO dto) throws DataValidException {
		if (dto != null) {
			if (addRepo.find(dto)) {
				return true;
			}
		}
		throw new DataValidException("DTO validation exception:passing null DTO");
	}

	public AdressDTO findByStreet(String street) throws DataValidException {
		if (AdressUtil.ValidString(street)) {
			AdressDTO dto = ((AdressService) addRepo).findBystreet(street);
			return dto;
		}
		throw new DataValidException("DTO validation exception:passing invalid street");
	}

	public AdressDTO findBypincode(int pincode) throws DataValidException {
		if (AdressUtil.validInt(pincode)) {
			AdressDTO dto = ((AdressService) addRepo).findByPinCode(pincode);
			return dto;
		}
		throw new DataValidException("DTO validation exception:passing invalid pincode");
	}

	public AdressDTO findByStreetAndPincodeAndArea(String street, int pincode, String Area) throws DataValidException {
		if (AdressUtil.validInt(pincode) && AdressUtil.ValidString(Area) && AdressUtil.ValidString(street)) {
			AdressDTO dto = addRepo.findByStreetAndPincodeAndArea(street, pincode, Area);
			return dto;
		}
		throw new DataValidException("DTO validation exception:passing invalid street pincode and area");
	}

	public AdressDTO findByStateAndcity(String state, String city) throws DataValidException {
		if (AdressUtil.ValidString(state) && AdressUtil.ValidString(city)) {
			AdressDTO dto = addRepo.findByStreetAndcity(state, city);
			return dto;
		}
		throw new DataValidException("DTO validation exception:passing invalid state pincode and city");
	}

	public String findfloreBynumber(int number) throws DataValidException {
		if (AdressUtil.validInt(number)) {
			String floore = addRepo.findFlooreByNumber(number);
			return floore;
		}
		throw new DataValidException("DTO validation exception:passing invalid flor");
	}

	public AdressDTO findpincodeByNumber(int Number) throws DataValidException {
		if (AdressUtil.validInt(Number)) {
			AdressDTO dto = ((AdressService) addRepo).findpincodeByNumber(Number);
			return dto;
		}
		throw new DataValidException("passing invalid number");
	}

	public boolean findcityByNumberAndPincodeAndflooreAndStreet(int Number, String floor, String Street, int pincode)
			throws DataValidException {
		if (AdressUtil.validInt(Number) && AdressUtil.ValidString(floor) && AdressUtil.ValidString(Street)
				&& AdressUtil.validInt(pincode)) {
			AdressDTO dto = addRepo.findByStreetAndPincodeAndArea(Street, pincode, floor);
			return dto != null;
		}
		throw new DataValidException("DTO validation exception:passing invalid details");
	}

}
