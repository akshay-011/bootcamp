package com.bootcamp.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldGiveArea() {
        Square square = new Square(2);
        assertEquals(4, square.area());
        assertEquals(8, square.perimeter());
    }


    @Test
    void shouldGiveIfSideIs0() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
        assertEquals(0, square.area());
    }
}