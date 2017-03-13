package com.laptop.study.basic;

public class Input2String {

	public static void main(String[] args) {
		String str = convertStreamToString(System.in);
		System.out.println(str);
	}

	@SuppressWarnings("resource")
	static String convertStreamToString(java.io.InputStream is) {
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter(System.getProperty("line.separator"));
		return s.hasNext() ? s.next() : "";
	}

}
