package ru.daniladeveloper.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class StripCommentsTest {

	@Test
	public void stripComments() throws Exception {
		assertEquals(
				"apples, pears\ngrapes\nbananas",
				StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
		);

		assertEquals(
				"a\nc\nd",
				StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
		);
//        assertEquals(
//            "a\n[ ]b\nc d",
//            StripComments.stripComments( "a \n[ ]b\nc d $e f", new String[] { "#", "$" } )
//        );

	}

    @Test
    public void test() {
        assertEquals(
            """
                        a
                        b
                        c"""
                        ,
            StripComments.stripComments( """
                        a
                        b
                        c"""
                  , new String[] { "#", "$" } )
        );
    }

    @Test
    public void test2() {
        assertEquals(
            """
                        a
                        c"""
            ,
            StripComments.stripComments( """
                        a
                        #b
                        c"""
                , new String[] { "#", "$" } )
        );
    }

    @Test
    public void test3() {
        assertEquals(
            """


                        c"""
            ,
            StripComments.stripComments( """
                        !a
                        #b
                        c"""
                , new String[] { "#", "!" } )
        );
    }


    @Test
    public void test4() {
        assertEquals(
            """


                        c """
            ,
            StripComments.stripComments( """
                        !a
                        #b
                        c """
                , new String[] { "#", "!" } )
        );
    }
}
