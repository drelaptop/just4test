package com.laptop.study.basic;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class RandString {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(getRandomString());
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(getRandomNumber(26));
		}
	}

	/**
	 * @return length 26 random string
	 */
	public static String getRandomString() {
		SecureRandom random = new SecureRandom();
		random.setSeed(System.nanoTime());
		return new BigInteger(130, random).toString(32);
	}

	/**
	 * @param result's length
	 * @return random number string
	 */
	public static String getRandomNumber(int length) {
		StringBuilder randNbrStr = new StringBuilder();
		Random random = new Random();
		random.setSeed(System.nanoTime());
		for (int i = 0; i < length; i++) {
			randNbrStr.append((random.nextInt() % 10 + 10) % 10);
		}
		return randNbrStr.toString();
	}
}
