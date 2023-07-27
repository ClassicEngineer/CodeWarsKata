package ru.daniladeveloper.kata;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SmallerNumberKataTest {
    @Test
    public void basicTests() {
         assertEquals(12, SmallerNumberKata.nextSmaller(21));
         assertEquals(790, SmallerNumberKata.nextSmaller(907));
         assertEquals(513, SmallerNumberKata.nextSmaller(531));
         assertEquals(-1, SmallerNumberKata.nextSmaller(1027));
         assertEquals(414, SmallerNumberKata.nextSmaller(441));
         assertEquals(123456789, SmallerNumberKata.nextSmaller(123456798));
    }
}
