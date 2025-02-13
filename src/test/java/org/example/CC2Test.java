package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CC2Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void checkArray1() { //Output [1, 2, "3", ""4]
        CC2 cc2 = new CC2();
        assertArrayEquals(new Object[]{1, 2, "3", "4"}, cc2.transformToArray(new Object[]{1, 2, new Object[]{"3", "4"}}).toArray());
    }

    @Test
    void checkArray2() { //Output [1, 2, "3", ""4]
        CC2 cc2 = new CC2();
        assertArrayEquals(new Object[]{1, 2, 3, 4, 5, 6}, cc2.transformToArray(new Object[]{1, 2, new Object[]{3, 4, new Object[]{5, 6}}}).toArray());
    }

}