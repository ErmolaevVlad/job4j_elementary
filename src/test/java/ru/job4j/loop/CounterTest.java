package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenSum1To2Then3() {
        int start = 1;
        int finish = 2;
        int sum = Counter.sum(start, finish);
        int expected = 3;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSum4To9Then39() {
        int start = 4;
        int finish = 9;
        int sum = Counter.sum(start, finish);
        int expected = 39;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEven1To10Then30() {
        int start = 1;
        int finish = 10;
        int sum = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenSumEven2To8Then20() {
        int start = 2;
        int finish = 8;
        int sum = Counter.sumByEven(start, finish);
        int expected = 20;
        assertThat(sum).isEqualTo(expected);
    }
}