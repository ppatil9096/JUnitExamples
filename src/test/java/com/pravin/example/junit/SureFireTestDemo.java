package com.pravin.example.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * mvn test : run all test cases present inside test
 * mvn -Dtest=SurefireTestDemo test : execute all test cases inside test class TestSurefire
 * mvn -Dtest=SurefireTestDemo#testSecond test : execute only single test case method i.e. testcaseFirst
 * mvn -Dtest=SurefireTestDemo#test* test : runs multiple test cases with similar names
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SureFireTestDemo {

    @Test
    public void testSecond() {
        System.out.println("Second testcase executed");
    }

    @Test
    public void testFirst() {
        System.out.println("First testcase executed");
    }

    @Test
    public void testThird() {
        System.out.println("Third testcase executed");
    }
}
