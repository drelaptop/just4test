package com.licz.simple;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MockSay {

    private Boy realBoy;

    private Girl mockGirl;

    @Before
    public void setUp() throws Exception {
        realBoy = new Boy();
        mockGirl = mock(Girl.class);

        /*
         * 如果有人想知道，Girl说了什么，就告诉他，说了"Hi!"
         */
        when(mockGirl.getSaid()).thenReturn("Hi!");
    }

    @After
    public void tearDown() throws Exception {
        verify(mockGirl).getSaid();
        System.out.println("The Girl Said:" + mockGirl.getSaid());
    }

    @Test
    public void sayHelloTest() throws Exception {
        realBoy.sayHello(mockGirl);
        Assert.assertEquals(realBoy.getSaid(), "Hello!");
    }
}
