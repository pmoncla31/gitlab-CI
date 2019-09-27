package io.monkeypatch.mktd10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTests {

    @Test
    void testFoo() {
        assertEquals("foo", "foo");
    }

    @Test
    void testBar() {
        assertEquals("bar", "bar");
    }
    
    @Test
    void testMonkey() {
        assertEquals("monkey", Math.random() > .5 ? "banana" : "monkey");
    }

}
