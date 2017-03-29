package com.laptop.study.basic;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RandStringTest {
    
    RandString randString = null;
    
    @Before
    public void setUp() throws Exception {
        randString = new RandString();
    }
    
    @Test
    public void testGetRandomString() {
        String getStr = randString.getRandomString();
        assertTrue(26 == getStr.length());
    }
    
    @Test
    public void testGetRandomNumber() {
        int length = 12;
        String getNbr = randString.getRandomNumber(length);
        assertTrue(length == getNbr.length());
    }
    
}
