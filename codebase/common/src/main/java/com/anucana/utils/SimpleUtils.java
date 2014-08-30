package com.anucana.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

	
	public static String calculateChecksum(String enrcriptionType, String str) {
		byte[] hashseq = str.getBytes();
		StringBuffer hexString = new StringBuffer();
		try {
			MessageDigest algorithm = MessageDigest.getInstance(enrcriptionType);
			algorithm.reset();
			algorithm.update(hashseq);
			byte messageDigest[] = algorithm.digest();
			for (int i = 0; i < messageDigest.length; i++) {
				String hex = Integer.toHexString(0xFF & messageDigest[i]);
				if (hex.length() == 1){
					hexString.append("0");
				}
				hexString.append(hex);
			}
		} catch (NoSuchAlgorithmException nsae) {
			nsae.printStackTrace();
		}
		return hexString.toString();
	}	
	
}
