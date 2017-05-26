package com.self.my.java.utils.array;

public class ArrayUtils {
	public static boolean isArrayNull(Object[] objs){
		return objs == null;
	}
	
	public static boolean isArrayEmpty(Object[] objs){
		return objs == null || objs.length==0;
	}
}
