package com.self.my.java.utils.numbers;

import java.math.BigDecimal;

public class BigDecimalUtils {
	public static BigDecimal strToBigDecimal(String v){
		try{
			return new BigDecimal(v);
		} catch(Exception e){
			return null;
		}
	}
	
	public static String bigDecimalToStr(BigDecimal v){
		try{
			return v.toPlainString();
		} catch(Exception e){
			return null;
		}
	}
	
	public static String bigDecimalToStr(Object v){
		try{
			BigDecimal vb = (BigDecimal) v;
			return vb.toPlainString();
		} catch(Exception e){
			return null;
		}
	}
	
}
