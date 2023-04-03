package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.repository.FestivalRepository;
import com.xworkz.application.repository.FestivalRepositoryImpliment;
import com.xworkz.application.service.FestivalService;
import com.xworkz.application.service.FestivalServiceImpl;

public class FestivalRunner{
	public static void main(String[] args) {
		try {
			FestivalDTO dto = new FestivalDTO(1, "Dasara", LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 26), "Jaggery",
					"LordShiva");
			System.out.println(dto.toString());
			System.out.println(dto.hashCode());
			System.out.println(dto.equals(dto));

			FestivalRepository festivalRepository = new FestivalRepositoryImpliment();
			FestivalService festivalService = new FestivalServiceImpl();
			boolean save = festivalService.validateAndThenSave(dto);
			System.out.println("Save:" + save);
			System.out.println("**********************");

			FestivalDTO dto1 = new FestivalDTO(1, "Yugadi", LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 26), "Jaggery",
					"LordShiva");
			System.out.println(dto1.toString());
			System.out.println(dto1.hashCode());
			System.out.println(dto1.equals(dto1));

			//FestivalRepository festivalRepository1 = new FestivalRepositoryImpli();
			FestivalService festivalService1 = new FestivalServiceImpl();
			boolean save1 = festivalService1.validateAndThenSave(dto1);
			System.out.println("Save:" + save1);
			System.out.println("**********************");

			FestivalDTO dto2 = new FestivalDTO(1, "Yugadi", LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 26), "Jaggery",
					"LordShiva");
			System.out.println(dto2.toString());
			System.out.println(dto2.hashCode());
			System.out.println(dto2.equals(dto2));

			//FestivalRepository festivalRepository2 = new FestivalRepositoryImpli();
			FestivalService festivalService2 = new FestivalServiceImpl();
			boolean save2 = festivalService2.validateAndThenSave(dto2);
			System.out.println("Save:" + save2);
			System.out.println("**********************");

			FestivalDTO dto3 = new FestivalDTO(1, "Yugadi", LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 26), "Jaggery",
					"LordShiva");
			System.out.println(dto3.toString());
			System.out.println(dto3.hashCode());
			System.out.println(dto3.equals(dto3));

			//FestivalRepository festivalRepository3 = new FestivalRepositoryImpli();
			FestivalService festivalService3 = new FestivalService(festivalRepository);
			boolean save3 = festivalService3.validateAndThenSave(dto3);
			System.out.println("Save:" + save3);
			System.out.println("**********************");

			FestivalDTO dto4 = new FestivalDTO(1, "Yugadi", LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 26), "Jaggery",
					"LordShiva");
			System.out.println(dto4.toString());
			System.out.println(dto4.hashCode());
			System.out.println(dto4.equals(dto4));

			//FestivalRepository festivalRepository4 = new FestivalRepositoryImpli();
			FestivalService festivalService4 = new FestivalServiceImpl();
			boolean save4 = festivalService4.validateAndThenSave(dto4);
			System.out.println("Save:" + save4);
			System.out.println("**********************");

			FestivalDTO dto5 = new FestivalDTO(1, "Yugadi", LocalDate.of(2023, 3, 25), LocalDate.of(2023, 3, 26), "Jaggery",
					"LordShiva");
			System.out.println(dto5.toString());
			System.out.println(dto5.hashCode());
			System.out.println(dto5.equals(dto5));
		}
		
			//FestivalRepository festivalRepository5 = new FestivalRepositoryImpli();




