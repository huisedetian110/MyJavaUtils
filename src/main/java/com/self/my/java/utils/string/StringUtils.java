package com.self.my.java.utils.string;

public class StringUtils {
	
	public static boolean isNull(String str){
		return str == null;
	}
	@SuppressWarnings("null")
	public static boolean isEmpty(String str){
		return (str == null && "".equals(str.trim()));
	}
	
	public static String[] split(String str, String flag){
		try{
			return str.split(flag);
		} catch(Exception e){
			return null;
		}
	}
	
	public static String[] splitTrim(String str, String flag){
		try{
			String[] temp = str.split(flag);
			String[] results = new String[temp.length];
			for(int i=0; i<temp.length; i++){
				results[i] = temp[i].trim();
			}
			return results;
		} catch(Exception e){
			return null;
		}
	}
	
}
