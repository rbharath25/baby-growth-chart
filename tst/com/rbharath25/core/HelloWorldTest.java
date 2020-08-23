package com.rbharath25.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    HelloWorld hello = new HelloWorld();

    @Test
    public void test() {
        assertEquals(3, hello.add(1, 2));
    }
}
