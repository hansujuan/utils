package com.hansujuan.common.utils;

/**
 * @作者 hsj
 * @日期 2019年9月9日
 */
public class StringUtil {

	
	public static String toHtml(String text){
		String all = text.replaceAll("\\\\n\\\\r", "<p></p>");
		String all2 = all.replaceAll("\\\\r", "<br>");
		return all2;
	}
	
	public static boolean isPhone(String phone){
		boolean b = phone.matches("^1[3|5|7|8][0-9]{9}");
		return b;
	}
	
	public static boolean isEmail(String email) {
		boolean b = email.matches("\\w+@\\w+(.cn|.com)+");
		return b;
	}
//	提交的值不能空，而且空白字符串也不行。（4分）
	public static boolean hasNext(String str){
		if (str == null || "".equals(str.trim()) || "null".equals(str.trim())) {
			return true;
		}else{
			return false;
		}
	}
}
