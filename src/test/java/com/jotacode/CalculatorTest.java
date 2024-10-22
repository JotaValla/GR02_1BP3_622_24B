package com.jotacode;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    static Calculator c;

    @BeforeEach
    public void setUp() {
        System.out.println("setUp()");
        c = new Calculator();
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @Test
    public void given_two_integers_when_add_then_ok() {
        System.out.println("Test 1");
        assertEquals(6, c.addition(3, 3));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test 2");
        assertEquals(7, c.subtraction(10, 3));
    }

    @Test
    public void given_two_integers_when_division_then_exception() {
        System.out.println("Test 3");
        assertThrows(ArithmeticException.class, () -> c.division(1, 0));
    }

    @Test
    @Timeout(1000)
    public void given_time_when_timeout_then_exception() {
        System.out.println("Test 4");
        c.timeout(1000);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tearDownClass()");
    }

}