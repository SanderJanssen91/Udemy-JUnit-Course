package com.janssen.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({StringHelperParameterizedTest_FirstAndLastTwoCharactersTheSame.class, StringHelperParameterizedTest_TruncateAInFirst2Positions.class})
public class ParameterizedTests {
}
