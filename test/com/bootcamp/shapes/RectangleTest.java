package com.bootcamp.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldGiveAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(3,2);

        assertEquals(6, rectangle.area());
    }

    @Test
    void shouldGiveArea() {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals(4, rectangle.area());
    }
}