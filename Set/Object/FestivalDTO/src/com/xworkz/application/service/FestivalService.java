package com.xworkz.application.service;

import java.security.InvalidKeyException;

import com.xworkz.application.dto.FestivalDTO;

public interface FestivalService {
	boolean validateAndThenSave(FestivalDTO dto) throws InvalidKeyException;
}
