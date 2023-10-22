package com.simplilearn.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ _01_FinderTest.class, _02_CheckerTest.class, _03_CalculatorTest.class, _04_HeavyProcessTest.class })
public class AllTests {

}
