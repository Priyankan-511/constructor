package com.xworkx.weapon.boot;

import com.xworkx.weapon.dto.WeaponDTO;
import com.xworkx.weapon.service.WeaopenServiceImplementation;
import com.xworkx.weapon.service.WeaponService;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO weaponDTO = new WeaponDTO();
		weaponDTO.setId(12);
		weaponDTO.getName();
		weaponDTO.getType();
		weaponDTO.getCost();
		weaponDTO.getMaterial();
		weaponDTO.getMadeBy();
		weaponDTO.getManufacturedBy();
		weaponDTO.getUseddBy();
		weaponDTO.getUsedFor();
		weaponDTO.getWeight();
		boolean validid = false;
		boolean validName = false;
		boolean validType =false;
		boolean validCost = false;
		boolean validMaterial = false;
		boolean validMadeBy = false;
		boolean validManufacturedBy = false;
		boolean validUsedBy = false;
		boolean validUsedFor = false;
		boolean validWeight = false;
		
		System.out.println(weaponDTO.equals(weaponDTO));
		System.out.println(weaponDTO.hashCode());
		WeaponService weaponService = new WeaopenServiceImplementation();
		boolean save = WeaponService.validAndThenSave(weaponDTO);
		System.out.println("saved:"+save);
		

	}

}
