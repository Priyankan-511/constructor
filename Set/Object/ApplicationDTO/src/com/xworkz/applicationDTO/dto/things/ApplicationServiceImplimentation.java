package com.xworkz.applicationDTO.dto.things;

import java.time.LocalDate;

public class ApplicationServiceImplimentation implements ApplicationService {

@Override
	public boolean ValidateAndThenSave(Application dto) {
		if(dto != null) {
			System.out.println("DTO is not null it validate properties");
			String name = dto.getName();
			LocalDate date = dto.getCreatedDate();
			double size=dto.getSize();
			double version=dto.getVersion();
			LocalDate createdDate=dto.getCreatedDate();
			String developedby=dto.getDevelopedby();
			Type type=dto.getType();
			int price=dto.getPrice();
			LocalDate firstVersionReleaseDate=dto.getFirstVersionReleaseDate();
			
			
			
			
			
			
			

		}
		return false;

	}
}