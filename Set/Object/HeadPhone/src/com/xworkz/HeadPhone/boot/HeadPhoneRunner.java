package com.xworkz.HeadPhone.boot;

import com.xworkz.HeadPhone.dto.HeadPhoneDTO;
import com.xworkz.HeadPhone.service.HeadPhoneServiceImplimentation;

public class HeadPhoneRunner {
	public static void main(String[] args) {
		HeadPhoneDTO headPhoneDTO = new HeadPhoneDTO(null, null, 0, false, null, null, null, 0, null, 0);
		System.out.println(headPhoneDTO.toString());
		System.out.println(headPhoneDTO.hashCode());
		System.out.println(headPhoneDTO.equals(headPhoneDTO));

		HeadPhoneServiceImplimentation headPhoneservice = new HeadPhoneServiceImplimentation();
		headPhoneservice.validteAndThenSave(headPhoneDTO);

	}

}
