package ru.daniladeveloper.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIncrementerTest {

    private static void doTest(String str, String expected) {
        String actual = assertDoesNotThrow(() -> StringIncrementer.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }

    @Test
    public void simple() {
        doTest("foo", "foo1");
    }

    @Test
    public void simple2() {
        doTest("foo0", "foo1");
    }

    @Test
    public void mainTest() {
        doTest("foobar000", "foobar001");
    }

    @Test
    public void nine() {
        doTest("foobar99", "foobar100");
    }

    @Test
    public void random() {
       doTest("nsec,DDB^i-*SXi%-xnTo8WHG:", "nsec,DDB^i-*SXi%-xnTo8WHG:1");
    }

    @Test
    public void unfair() {
        doTest("fo55obar99", "fo55obar100");
    }

    @Test
    public void zeroInside() {
        doTest(".a,8*/uBMnjmag.^Ho~41i)o-0000000000000000000000000000029406823", ".a,8*/uBMnjmag.^Ho~41i)o-0000000000000000000000000000029406824");
    }

    @Test
    public void bigNum() {
        doTest("67375985116054", "67375985116055");
    }
    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
    }
}
