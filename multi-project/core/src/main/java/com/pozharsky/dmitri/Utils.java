package com.pozharsky.dmitri;

public class Utils {

    private Utils() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        for (String string : str) {
            if (!StringUtils.isPositiveNumber(string)) {
                return false;
            }
        }
        return true;
    }
}
