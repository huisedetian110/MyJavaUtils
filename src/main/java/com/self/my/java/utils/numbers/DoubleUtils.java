package com.self.my.java.utils.numbers;

public class DoubleUtils {
	
	public static Double strToDouble(String v){
		try{
			return Double.valueOf(v);
		} catch(Exception e){
			return null;
		}
	}
	
	public static String doubleToStr(Double v){
		try{
			return v.toString();
		} catch(Exception e){
			return null;
		}
	}
	
}
