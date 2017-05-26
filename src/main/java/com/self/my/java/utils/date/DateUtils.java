package com.self.my.java.utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static String formatTimestamp(long timestamp){
		return formatTimestamp(timestamp, "yyyy-MM-dd HH:mm:ss");
	}
	
	public static String formatTimestamp(long timestamp, String pattern){
		try{
			Date dt = new Date(timestamp);
			SimpleDateFormat sf = new SimpleDateFormat(pattern);
			return sf.format(dt);
		} catch(Exception e){
			return "";
		}
	}
	
	public static String formatDate(Date dt){
		return formatDate(dt, "yyyy-MM-dd HH:mm:ss");
	}
	
	public static String formatDate(Date dt, String pattern){
		try{
			SimpleDateFormat sf = new SimpleDateFormat(pattern);
			return sf.format(dt);
		} catch(Exception e){
			return "";
		}
	}
}
