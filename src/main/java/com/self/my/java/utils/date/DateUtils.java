package com.self.my.java.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	
	/**
	 * 获取一年有多少天，默认格式：yyyy-MM-dd
	 * @param dt
	 * @return
	 */
	public static int getYearDays(String dt){
		return getYearDays(dt, "yyyy-MM-dd");
	}
	
	/**
	 * 获取一年有多少天，自定义格式
	 * @param dt
	 * @param format
	 * @return
	 */
	public static int getYearDays(String dt, String format){
		try {
			SimpleDateFormat sformat = new SimpleDateFormat(format);
			return getYearDays(sformat.parse(dt));
			
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	
	/**
	 * 获取一年有多少天
	 * @param dt
	 * @return
	 */
	public static int getYearDays(Date dt) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		return cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	}
	
	/**
	 * 获取指定日期的月份有多少天，默认格式：yyyy-MM-dd
	 * @param dt
	 * @return
	 */
	public static int getMonthDays(String dt){
		return getMonthDays(dt, "yyyy-MM-dd");
	}
	
	/**
	 * 获取指定日期的月份有多少天，自定义时间格式
	 * @param dt
	 * @return
	 */
	public static int getMonthDays(String dt, String format){
		try {
			SimpleDateFormat sformat = new SimpleDateFormat(format);
			return getMonthDays(sformat.parse(dt));
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	/**
	 * 获取指定日期的月份有多少天
	 * @param dt
	 * @return
	 */
	public static int getMonthDays(Date dt){
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
}
