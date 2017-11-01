package com.janssen.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest_FirstAndLastTwoCharactersTheSame {

    StringHelper helper = new StringHelper();
    private String input;
    private boolean expectedOutput;

    public StringHelperParameterizedTest_FirstAndLastTwoCharactersTheSame(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        Object[][] expectedOutputs = {{"ABCD", false},
                {"ABAB", true},
                {"AB", true},
                {"A", false}};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testFirstAndLastTwoCharactersTheSame() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input)==expectedOutput);
    }
}