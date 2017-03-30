package com.licz.simple;

public class Boy {
    private String said = new String();

    /*
     * 如果Girl打了招呼，就回招呼，否则尴尬中
     */
    public void sayHello(Girl girl) {
        if (girl.getSaid().equals("Hi!")) {
            said = "Hello!";
        }
        else {
            said = "...";
        }
    }

    public String getSaid() {
        return said;
    }

}
