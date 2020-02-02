package com.pravin.example.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Run tests spread into multiple test classes or test suites help to grouping and executing tests in bulk.
 * Both @RunWith and @Suite annotations are used to run the suite tests
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AppTest.class, AppTestSupplier.class
})
public class TestSuiteDemo {
}
