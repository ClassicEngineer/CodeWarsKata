package ru.daniladeveloper.kata;



// TODO: Replace examples and use TDD by writing your own tests

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HEXToRGBTest {
    @Test
    public void allOne() {
        assertArrayEquals(HexToRGB.hexStringToRGB("#111111"), new int[] {17, 17, 17});
    }

    @Test public void allZero() {
        assertArrayEquals(HexToRGB.hexStringToRGB("#000000"), new int[] {0, 0, 0});
    }

    @Test public void more() {
        assertArrayEquals(HexToRGB.hexStringToRGB("#FF9933"), new int[] {255, 153, 51});
        assertArrayEquals(HexToRGB.hexStringToRGB("#beaded"), new int[] {190, 173, 237});
        assertArrayEquals(HexToRGB.hexStringToRGB("#Fa3456"), new int[] {250, 52, 86});
    }
}
