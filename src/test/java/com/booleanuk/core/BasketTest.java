package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void addItemThatDoesNotExist() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("milk", 2));
    }

    @Test
    public void addItemThatAlreadyExists() {
        Basket basket = new Basket();
        Assertions.assertFalse(basket.add("butter", 4));
    }
}
