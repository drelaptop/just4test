package com.laptop.stringswitch;

public class SwitchString {

	public static void main(String[] args) {
		String sayBeginWord = convertStreamToString(System.in);
		System.out.println(sayOther(sayBeginWord));
	}

	public enum StringEnum {
		JAVA, IS, THE, BEST, PROGROM, LANGUAGE, IN, OUR, WORLD, EXCEPTION;
	}

	/*
	 * learn from stackoverflow
	 */
	private static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
		if (c != null && string != null) {
			try {
				return Enum.valueOf(c, string.trim().toUpperCase());
			} catch (IllegalArgumentException ex) {
				return Enum.valueOf(c, "EXCEPTION");
			}
		}
		return null;
	}

	@SuppressWarnings("resource")
	static String convertStreamToString(java.io.InputStream is) {
		java.util.Scanner s = new java.util.Scanner(is).useDelimiter(System.getProperty("line.separator"));
		return s.hasNext() ? s.next() : "";
	}

	static String sayOther(String strEnum) {
		StringBuilder strBuilder = new StringBuilder();
		switch (getEnumFromString(StringEnum.class, strEnum)) {
		case JAVA: {
			strBuilder.append(StringEnum.JAVA + " ");
		}
		case IS: {
			strBuilder.append(StringEnum.IS + " ");
		}
		case THE: {
			strBuilder.append(StringEnum.THE + " ");
		}
		case BEST: {
			strBuilder.append(StringEnum.BEST + " ");
		}
		case PROGROM: {
			strBuilder.append(StringEnum.PROGROM + " ");
		}
		case LANGUAGE: {
			strBuilder.append(StringEnum.LANGUAGE + " ");
		}
		case IN: {
			strBuilder.append(StringEnum.IN + " ");
		}
		case OUR: {
			strBuilder.append(StringEnum.OUR + " ");
		}
		case WORLD: {
			strBuilder.append(StringEnum.WORLD + "!");
			break;
		}
		default: {
			strBuilder.append("You Say What!");
		}
		}
		return strBuilder.toString();
	}
}
