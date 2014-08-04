package com.anucana.utils;

public class SimpleUtils {

	public static int intVal(String str) {
		try {
			return Integer.valueOf(str);
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
	
	public static long longVal(String str) {
		try {
			return Long.valueOf(str);
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
	

	public static String strVal(Object obj) {
		if (obj == null) {
			return "";
		}
		return obj.toString();
	}

}
