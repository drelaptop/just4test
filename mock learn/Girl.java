package com.licz.simple;

import java.util.Random;

public class Girl {
    private String said = new String();

    /*
     * 考虑5s，决定要不要打个招呼
     */
    public void say() throws Exception {
        Boolean yesOrNo = think();
        if (yesOrNo) {
            said = "Hi!";
        }
        else {
            said = "...";
        }
    }

    private Boolean think() throws Exception {
        Random rad = new Random();
        Thread.sleep(5000);
        return rad.nextBoolean();
    }

    public String getSaid() {
        return said;
    }

}
