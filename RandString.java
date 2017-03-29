package com.laptop.study.basic;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class RandString {
    
    /**
     * @return length 26 random string
     */
    public String getRandomString() {
        SecureRandom random = new SecureRandom();
        random.setSeed(System.nanoTime());
        return new BigInteger(130, random).toString(32);
    }
    
    /**
     * @param length
     *            you want get
     * @return random number string
     */
    public String getRandomNumber(int length) {
        StringBuilder randNbrStr = new StringBuilder();
        Random random = new Random();
        random.setSeed(System.nanoTime());
        for (int i = 0; i < length; i++) {
            randNbrStr.append((random.nextInt() % 10 + 10) % 10);
        }
        return randNbrStr.toString();
    }
}
