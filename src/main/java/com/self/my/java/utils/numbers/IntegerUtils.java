package com.self.my.java.utils.numbers;

public class IntegerUtils {
	
	public static Integer strToInteger(String v){
		try{
			return Integer.valueOf(v);
		} catch(Exception e){
			return null;
		}
	}
	
	public static String integerToStr(Integer v){
		try{
			return v.toString();
		} catch(Exception e){
			return null;
		}
	}
	
}
