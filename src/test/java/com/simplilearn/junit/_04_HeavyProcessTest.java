package com.simplilearn.junit;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class _04_HeavyProcessTest {

    @Test
    @Timeout(value=8, unit= TimeUnit.MILLISECONDS)
    void testHeavyProcess() {

        _04_HeavyProcess.process();
    }
}
