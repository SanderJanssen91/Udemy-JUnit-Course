package com.janssen.junit.helper;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest_TruncateAInFirst2Positions {

    StringHelper helper = new StringHelper();
    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest_TruncateAInFirst2Positions(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutputs = {{"AACD", "CD"},
                {"CDAA", "CDAA"},
                {"ACD", "CD"}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }
}