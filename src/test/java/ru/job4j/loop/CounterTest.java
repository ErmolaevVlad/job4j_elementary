package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void when1To2Then3() {
        int start = 1;
        int finish = 2;
        int sum = Counter.sum(start, finish);
        int expected = 3;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void when4To9Then39() {
        int start = 4;
        int finish = 9;
        int sum = Counter.sum(start, finish);
        int expected = 39;
        assertThat(sum).isEqualTo(expected);
    }
}