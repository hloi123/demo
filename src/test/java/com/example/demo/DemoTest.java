package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    DemoController demoFibo = new DemoController();

    @Test
    public void testFibonacci_whenInputNumber_returnLastFibonacciNumber() {
        assertEquals(0, demoFibo.getLastFibonacci(0));
        assertEquals(1, demoFibo.getLastFibonacci(1));
        assertEquals(2, demoFibo.getLastFibonacci(3));
        assertEquals(5, demoFibo.getLastFibonacci(5));
        assertEquals(55, demoFibo.getLastFibonacci(10));
    }

}
