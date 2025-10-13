package com.wipro.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BazTest {
    @Test
    void greet_shouldReturnNameOrGuest() {
        Baz baz = new Baz();
        assertEquals("Hello, Yashita", baz.greet("Yashita"));
        assertEquals("Hello, Guest", baz.greet(null));
    }
}
