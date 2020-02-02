package com.pravin.example.junit;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 * whenever test wants to be executed on condition basis
 */
public class JunitAssumptionTest {
    @Before
    public void setUp() {
        String environment = "LOCAL";
        Assume.assumeTrue("LOCAL".equals(environment));
    }

    @Test
    public void testOnlyOnLocalEnvironment() {
        System.out.println("Test executed");
    }
}
