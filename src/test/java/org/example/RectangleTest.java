package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    void setUp(){
        rectangle = new Rectangle(5, 10);
    }

    @Test
    void testGetLenght() {
        assertEquals(5, rectangle.getLenght());
    }

    @Test
    void testGetWidth() {
        assertEquals(10, rectangle.getWidth());
    }

    @Test
    void testGetArea() {
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(30, rectangle.getPerimeter());
    }
}
