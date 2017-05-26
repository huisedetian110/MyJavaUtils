package com.self.my.java.utils.string;

import java.io.UnsupportedEncodingException;

public class StringEncodeUtils {
	
	/**
	 * utf-8转iso-8859-1
	 * 一般是从java转到网页上需要转换
	 * @param str
	 * @return
	 */
	public static String utf8ToIso88591(String str){
		return oneEncodingToAnother(str, "UTF-8", "ISO-8859-1");
	}
	
	/**
	 * iso-8859-1转utf-8
	 * 一般是从网页中传值到java中需要转换
	 * @param str
	 * @return
	 */
	public static String iso88591ToUtf8(String str){
		return oneEncodingToAnother(str, "ISO-8859-1", "UTF-8");
	}
	
	/**
	 * gbk转iso-8859-1
	 * 一般用在文件下载时的文件名的编码
	 * @param str
	 * @return
	 */
	public static String gbkToIso88591(String str){
		return oneEncodingToAnother(str, "GBK", "ISO-8859-1");
	}
	
	/**
	 * 从一个编码转换到另外一个编码
	 * @param str	需要转码的字符
	 * @param fromEncoding	原编码
	 * @param toEncoding	需要转换的编码
	 * @return
	 */
	public static String oneEncodingToAnother(String str, String fromEncoding, String toEncoding){
		String ret = "";
		try{
			ret = new String(str.getBytes(fromEncoding),toEncoding);
		} catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
		return ret;
	}
	
}
