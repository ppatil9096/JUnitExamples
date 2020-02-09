package com.pravin.example.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    /**
     * Rigorous Test
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * run before all test methods in the test class. This method must be static
     */
    @BeforeClass
    public static void setup() {
        System.out.println("*** Before Class ***");
    }

    /**
     * will be run before each test method in the test class
     */
    @Before
    public void setupThis() {
        System.out.println("* Before test method *");
    }

    /**
     * mark a method/class as junit test
     */
    @Test
    public void method() {
        assertTrue(new ArrayList<>().isEmpty());
    }

    /**
     * '@'Ignore used to disable or ignore a test class or method from test suite
     */
    @Test
    @Ignore
    public void ignoreThisTestMethod() {
        assertTrue(new ArrayList<>().isEmpty());
    }

    /**
     * will be run after each test method in the test class
     */
    @After
    public void tearThis() {
        System.out.println("* After test method *");
    }

    /**
     * run after all test methods in the test class. This method must be static
     */
    @AfterClass
    public static void tear() {
        System.out.println("*** After class ***");
    }

    @Test(expected = NullPointerException.class)
    public void expectNullPointerException() {
        throw new NullPointerException();
    }

    /**
     * fails after 500 msecs
     *
     * @throws InterruptedException
     */
    @Test(timeout = 500)
    // results : org.junit.runners.model.TestTimedOutException: test timed out after 500 milliseconds
    public void testInfiniteTameTakingLoop() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
        }
    }

    /**
     * We can use @Rule for class level timeouts.
     * Note : @Rule applies on @Before and @After methods as well. So use it carefully.
     * @Rule
     * public Timeout globalTimeout = Timeout.seconds(2);
     */

    @Test
    public void testTempFolderOrFileAutoDeletion() throws IOException {
        final File tempFile = tempFolder.newFile("tempFile.txt");
        Files.writeString(Path.of(String.valueOf(tempFile)), "hello world");
        final String s = Files.readString(Path.of(String.valueOf(tempFile)));
        assertEquals("hello world", s);
    }
}
