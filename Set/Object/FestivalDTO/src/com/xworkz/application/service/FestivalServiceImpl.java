package com.xworkz.application.service;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.FestivalRepository;
import com.xworkz.application.repository.FestivalRepositoryImpliment;
import com.xworkz.application.util.FestivalValidUtil;

public class FestivalServiceImpl implements FestivalService {

	private Object festivalRepository;

	@Override
	public boolean validateAndThenSave(FestivalDTO dto) throws InvalidFestivalException {
		FestivalRepository festivalRepository;
	}

		FestivalServiceImpl(FestivalRepository festivalRepository) {
			this.festivalRepository = festivalRepository;
		}

	 boolean validateAndThenSave1(FestivalDTO dto1) throws InvalidFestivalException{
			if (dto1 != null) {
				System.out.println("DTO is not null,so Validate");
				int id = dto1.getId();
				String name = dto1.getName();
				LocalDate startDate = dto1.getStartDate();
				LocalDate endDate = dto1.getEndDate();
				String sweet = dto1.getSweet();
				String godName = dto1.getGodName();

				boolean validId = false;
				boolean validName = false;
				boolean validStartDate = false;
				boolean validEndDate = false;
				boolean validSweet = false;
				boolean validGodName = false;

				if (FestivalValidUtil.validId(id)) {
					System.out.println("Id is valid");
					validId = true;
				} else {
					System.err.println("Id is invalid");
				}
				if (FestivalValidUtil.validString(name)) {
					System.out.println("Name is valid");
					validName = true;
				} else {
					System.err.println("Name is Invalid");
				}

				if (FestivalValidUtil.validDate(startDate)) {
					System.out.println("StartDate is valid");
					validStartDate = true;
				} else {
					System.err.println("StartDate is Invalid");
				}
				if (FestivalValidUtil.validDate(endDate)) {
					System.out.println("EndDate is valid");
					validEndDate = true;
				} else {
					System.err.println("EndaDate is Invalid");
				}
				if (FestivalValidUtil.validString(sweet)) {
					System.out.println("Sweet is valid");
					validSweet = true;
				} else {
					System.err.println("Sweet is invalid");
				}
				if (FestivalValidUtil.validString(godName)) {
					System.out.println("GodName is valid");
					validGodName = true;
				} else {
					System.err.println("GodName is invalid");
				}
				if (FestivalValidUtil.validFalg(validId, validName, validStartDate, validEndDate, validSweet,
						validGodName)) {
					System.out.println("Validation Done so saved");
					boolean save=((FestivalRepositoryImpliment) this.festivalRepository).save(dto1);
					return save;
				} else {
					throw new InvalidFestivalException("Data is Invalid");
				}
			} else {
				System.err.println("DTO is null so dont validate");
			}
			return false;
	 }
	}
