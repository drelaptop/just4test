package com.laptop.stringswitch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwitchStringTest {
    
    SwitchString switchString = null;
    String strExp = "You Say What!";
    String strPart = "THE BEST PROGROM LANGUAGE IN OUR WORLD!";
    String strAll = "JAVA IS THE BEST PROGROM LANGUAGE IN OUR WORLD!";
    
    @Before
    public void setUp() throws Exception {
        switchString = new SwitchString();
    }
    
    @Test
    public void testSayOther() {
        String strSay = new String();
        strSay = switchString.sayOther("JAVA");
        Assert.assertTrue(strAll.equals(strSay));
        strSay = switchString.sayOther("THE");
        Assert.assertTrue(strPart.equals(strSay));
        strSay = switchString.sayOther("Hi!");
        Assert.assertTrue(strExp.equals(strSay));
    }
    
}
