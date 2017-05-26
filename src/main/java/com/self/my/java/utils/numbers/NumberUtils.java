package com.self.my.java.utils.numbers;

public class NumberUtils {
	
	public static Long objectToLong(Object obj){
		try{
			return Long.valueOf(obj.toString());
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
