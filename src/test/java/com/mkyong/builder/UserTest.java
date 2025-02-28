package com.mkyong.builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void testUserBuilder() {
        User user = new User.UserBuilder("Mk", "Yong")
                .age(42)
                .email("mkyong@example.com")
                .phone("123-456-7890")
                .build();

        assertEquals("Mk", user.getFirstName());
        assertEquals("Yong", user.getLastName());
        assertEquals(42, user.getAge());
        assertEquals("mkyong@example.com", user.getEmail());
        assertEquals("123-456-7890", user.getPhone());
    }
}

