package com.janssen.junit.helper;

import org.junit.*;

import static org.junit.Assert.*;

public class StringHelperTest {

    StringHelper helper;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @Before
    public void setup(){
        System.out.println("Before");
        this.helper = new StringHelper();
    }

    @After
    public void tearDown(){
        System.out.println("After");
        this.helper = null;
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstTwoPositions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        System.out.println("Performing test");
    }

    @Test
    public void testTruncateAInSecondPosition_AInFirstTwoPositions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("CAD"));
        System.out.println("Performing test");
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition(){
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        System.out.println("Performing test");
    }

    @Test
    public void testTruncateAInFirst2Positions_WithoutAInString(){
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
        System.out.println("Performing test");
    }

    @Test
    public void testTruncateAInFirst2Positions_AInLastTwoPosition(){
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
        System.out.println("Performing test");
    }

    @Test
    public void testTruncateAInFirst2Positions_AInMiddlePosition(){
        assertEquals("CDAD", helper.truncateAInFirst2Positions("CDAD"));
        System.out.println("Performing test");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario(){
        assertFalse("Dummy String", helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
        System.out.println("Performing test");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
        System.out.println("Performing test");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_TwoLetterScenario(){
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
        System.out.println("Performing test");
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_OneLetterScenario(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
        System.out.println("Performing test");
    }
}