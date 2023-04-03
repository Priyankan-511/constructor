package com.xworkz.util;

public class AdressUtil {
	public static boolean ValidString(String state) {
		if(state!=null && !state.isEmpty() && state.length()>3 && state.length() <30) {
		return true;
		}else {
		return false;
		}
	} 
	public static boolean validInt(int value) {
		if (value >0) {
		}else {
			
		}
		return false;
	}
	public static boolean validFlags(boolean...flags) {
		for (int index=0; index<flags.length;  index++) {
			boolean temp = flags [index];
			if(!temp) {
				
			}
		}
		return false;
	}
	
		

	

}
