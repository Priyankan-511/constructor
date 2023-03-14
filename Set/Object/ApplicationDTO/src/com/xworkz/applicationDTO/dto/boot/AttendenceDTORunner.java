package com.xworkz.applicationDTO.dto.boot;

import com.xworkz.applicationDTO.dto.things.AttendenceDTO;

public class AttendenceDTORunner {

	public static void main(String[] args) {
		AttendenceDTO attendenceDTO=new AttendenceDTO();
		attendenceDTO.setStudentname("pinky");
		attendenceDTO.setMailid("priyanka511@gmail.com");
		attendenceDTO.setRono(52);
		System.out.println(attendenceDTO.hashCode());
		System.out.println(attendenceDTO.equals(attendenceDTO));
		System.out.println(attendenceDTO.toString());

	}

}
