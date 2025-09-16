package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {
    @Test
    void testMainRuns() {
        // This test just ensures the main method runs without exceptions
        HelloWorld.main(new String[]{});
        assertTrue(true);
    }
}
