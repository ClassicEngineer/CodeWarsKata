package ru.daniladeveloper.kata;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class GoodVsEvilTest {

    @Test
    public void testEvilWin() {
        assertEquals( "Battle Result: Evil eradicates all trace of Good",
            GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"), "Evil should win");
    }

    @Test
    public void testGoodWin() {
        assertEquals( "Battle Result: Good triumphs over Evil",
            GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"),"Good should win");
    }

    @Test
    public void testTie() {
        assertEquals( "Battle Result: No victor on this battle field",
            GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"), "Should be a tie");
    }

    @Test
    public void testReal() {
        assertEquals("Battle Result: Evil eradicates all trace of Good",
            GoodVsEvil.battle("5580 9506 6928 2178 2962 6120", "3836 3864 5204 3805 8179 3394 7310"));
    }
}
