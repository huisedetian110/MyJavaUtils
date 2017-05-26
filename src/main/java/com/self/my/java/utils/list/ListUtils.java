package com.self.my.java.utils.list;

import java.util.List;

public class ListUtils {
	
	public static boolean isListNull(List<?> vals){
		return vals == null;
	}
	
	public static boolean isListEmpty(List<?> vals){
		return vals == null || vals.size() == 0;
	}
}
