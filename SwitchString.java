package com.laptop.stringswitch;

public class SwitchString {
    
    private enum StringEnum {
        JAVA, IS, THE, BEST, PROGROM, LANGUAGE, IN, OUR, WORLD, EXCEPTION;
    }
    
    /*
     * learn from stackoverflow
     */
    private <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if (c != null && string != null) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch (IllegalArgumentException ex) {
                return Enum.valueOf(c, "EXCEPTION");
            }
        }
        return null;
    }
    
    public String sayOther(String strEnum) {
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
