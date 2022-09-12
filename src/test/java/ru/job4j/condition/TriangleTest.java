package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenNoExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertFalse(result);
    }

}