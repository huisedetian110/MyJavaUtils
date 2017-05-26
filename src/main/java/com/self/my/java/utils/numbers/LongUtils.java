package com.self.my.java.utils.numbers;

public class LongUtils {
	
	public static Long strToLong(String v){
		try{
			return Long.valueOf(v);
		} catch(Exception e){
			return null;
		}
	}
	
	public static String longToStr(Long v){
		try{
			return v.toString();
		} catch(Exception e){
			return null;
		}
	}
	
	
}
