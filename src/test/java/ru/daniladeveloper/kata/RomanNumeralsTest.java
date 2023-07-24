package ru.daniladeveloper.kata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class RomanNumeralsTest {

    @Test
    public void testToRoman() throws Exception {
        assertThat("1 converts to 'I'", RomanNumerals.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", RomanNumerals.toRoman(2), is("II"));
        assertThat("11 converts to 'XI'", RomanNumerals.toRoman(11), is("XI"));
        assertThat("15 converts to 'XV'", RomanNumerals.toRoman(15), is("XV"));
        assertThat("17 converts to 'XVII'", RomanNumerals.toRoman(17), is("XVII"));
        assertThat("18 converts to 'XVIII'", RomanNumerals.toRoman(18), is("XVIII"));
        assertThat("19 converts to 'XIX'", RomanNumerals.toRoman(19), is("XIX"));
        assertThat("20 converts to 'XX'", RomanNumerals.toRoman(20), is("XX"));
        assertThat("21 converts to 'XXI'", RomanNumerals.toRoman(21), is("XXI"));
        assertThat("25 converts to 'XXV'", RomanNumerals.toRoman(25), is("XXV"));
        assertThat("26 converts to 'XXVI'", RomanNumerals.toRoman(26), is("XXVI"));
        assertThat("29 converts to 'XXIX'", RomanNumerals.toRoman(29), is("XXIX"));
        assertThat("40 converts to 'XL'", RomanNumerals.toRoman(40), is("XL"));
        assertThat("45 converts to 'XLV'", RomanNumerals.toRoman(45), is("XLV"));
        assertThat("49 converts to 'XLIX'", RomanNumerals.toRoman(49), is("XLIX"));
        assertThat("160 converts to 'CLX'", RomanNumerals.toRoman(160), is("CLX"));
        assertThat("400 converts to 'CD'", RomanNumerals.toRoman(400), is("CD"));
        assertThat("1666 converts to 'MDCLXVI'", RomanNumerals.toRoman(1666), is("MDCLXVI"));
        assertThat("1999 converts to 'MCMXCIX'", RomanNumerals.toRoman(1999), is("MCMXCIX"));
        assertThat("3573 converts to 'MMMDLXXIII'", RomanNumerals.toRoman(3573), is("MMMDLXXIII"));
        assertThat("3999 converts to 'MMMCMXCIX'", RomanNumerals.toRoman(3999), is("MMMCMXCIX"));


    }

    @Test
    public void testFromRoman() throws Exception {
        assertThat("'I' converts to 1", RomanNumerals.fromRoman("I"), is(1));
        assertThat("'II' converts to 2", RomanNumerals.fromRoman("II"), is(2));
        assertThat("'XI' converts to 11", RomanNumerals.fromRoman("XI"), is(11));
        assertThat("'XIX' converts to 19", RomanNumerals.fromRoman("XIX"), is(19));
        assertThat("'CD' converts to 400", RomanNumerals.fromRoman("CD"), is(400));
        assertThat("'MMMCMXCIX' converts to 3999", RomanNumerals.fromRoman("MMMCMXCIX"), is(3999));


    }
}
