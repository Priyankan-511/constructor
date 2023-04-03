package com.xworkz.application.repository;

import com.xworkz.application.dto.FestivalDTO;
import com.xworkz.application.exception.FestivalMemoryFullException;

public class FestivalRepositoryImpliment implements FestivalRepository{
	
	public enum FestivalRepository {

	}

	private FestivalDTO[] festivalDTO=new FestivalDTO[3];
	private int indexFestivalDTO=0;
	
	public boolean save(FestivalDTO dto) {
		if(this.indexFestivalDTO<this.festivalDTO.length) {
			this.festivalDTO[indexFestivalDTO]=dto;
			indexFestivalDTO++;
			return true;
			
		}else {
			System.err.println("Memory is full,cannot add more files,max allowed is 5");
			throw new FestivalMemoryFullException("Memory is full cannot add festivals..");
		}
	}
}



