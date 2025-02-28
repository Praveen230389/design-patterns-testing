package com.mkyong.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {
    @Test
    void testPizzaBuilder() {
        Pizza pizza = new Pizza.PizzaBuilder("Large")
                .cheese(true)
                .pepperoni(true)
                .olives(false)
                .build();

        assertEquals("Large", pizza.getSize());
        assertTrue(pizza.hasCheese());
        assertTrue(pizza.hasPepperoni());
        assertFalse(pizza.hasOlives());
    }
}

