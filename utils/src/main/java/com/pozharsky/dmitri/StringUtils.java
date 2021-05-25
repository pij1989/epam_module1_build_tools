package com.pozharsky.dmitri;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str)) {
            double number = NumberUtils.createDouble(str);
            return number >= 0;
        }
        return false;
    }
}
