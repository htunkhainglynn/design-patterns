package com.design.pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertEquals(instance1, instance2);
    }
}
