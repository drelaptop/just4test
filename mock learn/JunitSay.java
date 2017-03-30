package com.licz.simple;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitSay {

    private Boy boy;

    private Girl girl;

    @Before
    public void setUp() throws Exception {
        boy = new Boy();
        girl = new Girl();

        girl.say();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("The Girl Said:" + girl.getSaid());
    }

    @Test
    public void testSayHello() {
        boy.sayHello(girl);
        assertEquals(boy.getSaid(), "Hello!");
    }

}
