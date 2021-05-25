package com.pozharsky.dmitri;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void testIsPositiveNumberTrue() {
        boolean conditional = StringUtils.isPositiveNumber("10");
        assertTrue(conditional);
    }

    void testIsPositiveNumberFalse() {
        boolean conditional = StringUtils.isPositiveNumber("-10");
        assertFalse(conditional);
    }
}
