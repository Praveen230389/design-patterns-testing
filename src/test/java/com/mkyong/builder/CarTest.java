package com.mkyong.builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void testCarBuilder() {
        Car car = new Car.CarBuilder("Tesla", "Model S")
                .year(2023)
                .sunroof(true)
                .navigationSystem(true)
                .build();

        assertEquals("Tesla", car.getBrand());
        assertEquals("Model S", car.getModel());
        assertEquals(2023, car.getYear());
        assertTrue(car.hasSunroof());
        assertTrue(car.hasNavigationSystem());
    }
}

