package com.xworkz.applicationDTO.dto.boot;
import com.xworkz.applicationDTO.dto.things.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		ApplicationDTO applicationDTO = new ApplicationDTO();
		applicationDTO.setName("jim jam");
		applicationDTO.setCretedBy();
		applicationDTO.setVersion();
		applicationDTO.setId();
		System.out.println(applicationDTO.hashCode());
		System.out.println(applicationDTO.equals(applicationDTO));
		System.out.println(applicationDTO.toString());
	}
}
